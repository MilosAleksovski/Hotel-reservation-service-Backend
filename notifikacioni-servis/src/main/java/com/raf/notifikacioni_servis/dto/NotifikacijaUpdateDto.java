package com.raf.notifikacioni_servis.dto;

public class NotifikacijaUpdateDto {
    private String email;
    private String type;
    private String text;

    public NotifikacijaUpdateDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
