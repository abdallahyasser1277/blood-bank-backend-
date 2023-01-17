package com.naab.bloodbank.Admin;

public class LoginResponse {
    private String message;
    private String error;
    private Token token;


    public LoginResponse(String message, String error, Token token) {
        this.message = message;
        this.error = error;
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}

