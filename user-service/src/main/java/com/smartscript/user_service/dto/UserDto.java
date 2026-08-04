package com.smartscript.user_service.dto;

import com.smartscript.user_service.entity.Role;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String fullName;
    private Role role;
}