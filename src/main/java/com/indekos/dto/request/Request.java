package com.indekos.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Request {
    @NotEmpty(message = "username is required")
    private String username;

    @NotEmpty(message = "password is required")
    private String password;
}
