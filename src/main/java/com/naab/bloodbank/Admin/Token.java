package com.naab.bloodbank.Admin;

public class Token {
    private String name ;
    private String email;
    private String password;

    public Token(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Token() {
        this.name = null;
        this.email = null;
        this.password = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
