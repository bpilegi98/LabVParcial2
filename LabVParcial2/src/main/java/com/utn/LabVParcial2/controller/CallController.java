package com.utn.LabVParcial2.controller;

import com.utn.LabVParcial2.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class CallController {

    @Autowired
    IntegrationComponent integrationComponent;

    @GetMapping("/lineNumberAndReceivedCalls/{lineNumber}")
    public ResponseEntity getLineNumberAndReceivedCalls(@PathVariable String lineNumber)
    {
        return integrationComponent.getLineNumberAndReceivedCalls(lineNumber);
    }
}
