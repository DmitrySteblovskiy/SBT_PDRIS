package sbt.pdris.task12application;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@RestController
public class DBSetter {

    @GetMapping("/setuser")
    public String setUsers(@RequestParam(value = "userId", defaultValue = "") String userId) throws IOException {
        MongoClient client = MongoClients.create("mongodb:localhost:27017");
        MongoDatabase database = client.getDatabase("users");
        MongoCollection<Document> users = database.getCollection("users");
        users.insertOne(new Document("userid", userId));
        return "Database updated by user with id" + userId;
    }

    public static void main(String[] args) {
        SpringApplication.run(DBSetter.class, args);
    }

}
