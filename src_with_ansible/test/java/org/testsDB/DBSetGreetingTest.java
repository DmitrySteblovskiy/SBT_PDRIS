package org.testsDB;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
public class DBSetGreetingTest {
    public String userId = "userid";
    @Autowired
    private DBSetter dbSetter;
    @Test
    public void checkDocCollectionName() {
        dbSetter.setUsers("userid");
        MongoCollection<Document> users_test = database.getCollection("users");

        Assert.assertEquals("users", users_test.getName());
    }

    @Test
    public void checkUser() {
        dbSetter.setUsers("userid");
        users.insertOne(new Document("userid", userId));

        Assert.assertEquals("userid", userId);
    }
}
