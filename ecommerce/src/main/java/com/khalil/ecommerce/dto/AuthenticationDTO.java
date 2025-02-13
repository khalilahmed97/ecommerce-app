package com.khalil.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuthenticationDTO {

    private String name;

    private String email;

    private String profileImage;

    private LocalDateTime createdAt;
}
