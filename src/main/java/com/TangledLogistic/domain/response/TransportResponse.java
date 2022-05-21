package com.TangledLogistic.domain.response;

import java.util.List;

public class TransportResponse {

    private Boolean success;
    private List<String> discountedUserIndex;


    public TransportResponse() {
    }

    public TransportResponse(Boolean success, List<String> discountedUserIndex) {
        this.success = success;
        this.discountedUserIndex = discountedUserIndex;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<String> getDiscountedUserIndex() {
        return discountedUserIndex;
    }

    public void setDiscountedUserIndex(List<String> discountedUserIndex) {
        this.discountedUserIndex = discountedUserIndex;
    }
}
