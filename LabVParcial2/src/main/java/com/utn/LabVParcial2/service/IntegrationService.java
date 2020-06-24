package com.utn.LabVParcial2.service;

import com.utn.LabVParcial2.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;


    public ResponseEntity getLineNumberAndCallsReceived(String lineNumber)
    {
        return integrationComponent.getLineNumberAndReceivedCalls(lineNumber);
    }

}
