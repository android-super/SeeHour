package com.base.net;

public class ApiException extends Error {

    private String status;

    public ApiException(String status, String message) {
        super(message);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}