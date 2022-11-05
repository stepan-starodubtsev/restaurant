package com.progect.ui.rest.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserResponseDTO {
    private Long userId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String flat;
    private String entry;
    private String floor;
    private String login;
    private String password;
    private List<Long> orders;
    private List<Long> comments;
    private String privileges;
}