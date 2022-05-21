package com.TangledLogistic.domain.request;

import com.TangledLogistic.domain.Box;

import java.util.List;

public class TransportRequest {

    private List<Box> boxes;

    public TransportRequest(List<Box> boxes) {
        this.boxes = boxes;
    }

    public TransportRequest() {
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
