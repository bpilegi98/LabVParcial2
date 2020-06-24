package com.utn.LabVParcial2.service.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/";

    @PostConstruct
    private void init()
    {
        rest = new RestTemplateBuilder()
                .build();
    }

    public ResponseEntity getLineNumberAndReceivedCalls(String lineNumber)
    {
        return rest.getForEntity(url + "call/lineNumberAndReceivedCalls/"+lineNumber, String.class);
    }
}
