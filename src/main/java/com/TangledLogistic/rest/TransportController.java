package com.TangledLogistic.rest;

import com.TangledLogistic.domain.request.TransportRequest;
import com.TangledLogistic.domain.response.TransportResponse;
import com.TangledLogistic.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transports")
public class TransportController {

    @Autowired
    private TransportService transportService;

    @PostMapping
    public TransportResponse transportBoxes(@RequestBody TransportRequest transportRequest) {
        return transportService.transportBoxes(transportRequest.getBoxes());

    }
}

