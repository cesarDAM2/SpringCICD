package com.example.springcicd;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerIT {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Esta es la página principal");
    }

    @Test
    public void getNombre() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/nombre", String.class);
        assertThat(response.getBody()).isEqualTo("SpringBoot CI/CD César Díaz Ufano Sánchez");
    }
}

