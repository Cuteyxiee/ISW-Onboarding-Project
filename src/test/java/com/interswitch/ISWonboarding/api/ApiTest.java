package com.interswitch.ISWonboarding.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiTest {

    private MockMvc mockMvc;
    @Test
    public void greetings() {
        String message = "Hello World";
        assertEquals(message , Api.message());
    }
}