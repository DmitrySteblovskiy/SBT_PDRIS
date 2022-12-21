package org.testsDB;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


@RestController
@RunWith(SpringRunner.class)
public class DBwebTest {
    @Test
    public void checkDocument() throws Exception{
        MongoClient client = MongoClients.create("mongodb:localhost:27017");
        MongoDatabase database = client.getDatabase("users");
        MongoCollection<Document> users = database.getCollection("users");
        users.insertOne(new Document("userid", "test"));

        Assert.assertEquals("test", users[0].getId());
    }
}
