package com.anandreddy.portfolio.dto;

public class ContactRequestDTO {
    private String email;
    private String message;

    // ✅ Add getters and setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
