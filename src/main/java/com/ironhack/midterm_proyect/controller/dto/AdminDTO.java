package com.ironhack.midterm_proyect.controller.dto;

import javax.validation.constraints.NotEmpty;

public class AdminDTO {

    @NotEmpty(message = "id must be provided")
    private Long adminId;
    @NotEmpty(message = "Name must be provided")
    private String name;
    @NotEmpty(message = "Password must be provided")
    private String password;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
