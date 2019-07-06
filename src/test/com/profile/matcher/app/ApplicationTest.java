package com.profile.matcher.app;

import com.profile.matcher.controller.ProfilesController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ProfilesController profilesController;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(profilesController);
    }

}