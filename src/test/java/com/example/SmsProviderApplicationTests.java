package com.example;

import com.example.dto.ApiResponse;
import com.example.service.SmsSenderService;
import com.example.util.JWTUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmsProviderApplicationTests {
    @Autowired
    private SmsSenderService smsSenderService;

    @Test
    void contextLoads() {
//        ApiResponse send = smsSenderService.send("998902812345", "hello", "qalaysan");
        JWTUtil.encode("kunuz","123");
    }

}
