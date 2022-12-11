package sbt.pdris.Task1App;

import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DBGetter {

    @GetMapping("/getusers")
    public String getUsers() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("users");
        MongoCollection<Document> users = database.getCollection("users");
        StringBuilder answer = new StringBuilder("The users:");

        MongoCursor<Document> iter = users.find().iterator();
        while(iter.hasNext()) {
            answer.append(iter.tryNext().get("userid") + ", ");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(DBGetter.class, args);
    }

}

