package com.naab.bloodbank;

public class ResponseMsg {
    private String message;

    public ResponseMsg(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
