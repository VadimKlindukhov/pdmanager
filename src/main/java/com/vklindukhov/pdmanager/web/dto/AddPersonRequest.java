package com.vklindukhov.pdmanager.web.dto;

import java.time.LocalDate;

import com.vklindukhov.pdmanager.domain.Gender;

public class AddPersonRequest {

    private String username;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String rawImage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRawImage() {
        return rawImage;
    }

    public void setRawImage(String rawImage) {
        this.rawImage = rawImage;
    }
}
