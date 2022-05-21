package com.TangledLogistic.domain;


public class Box {
    private String innerString;
    private String identifyingString;

    public Box() {
    }

    public Box(String innerString, String identifyingString) {
        this.innerString = innerString;
        this.identifyingString = identifyingString;
    }

    public String getInnerString() {
        return innerString;
    }

    public void setInnerString(String innerString) {
        this.innerString = innerString;
    }

    public String getIdentifyingString() {
        return identifyingString;
    }

    public void setIdentifyingString(String identifyingString) {
        this.identifyingString = identifyingString;
    }
}
