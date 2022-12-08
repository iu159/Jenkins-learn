package com.fans.demo.web;

import com.fans.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping
    public String index() throws JsonProcessingException {
        User user = new User();
        user.setUsername("hello");
        user.setUid("213123");
        user.setAvatar("http://jo.com");
        return objectMapper.writeValueAsString(user);
    }

}
