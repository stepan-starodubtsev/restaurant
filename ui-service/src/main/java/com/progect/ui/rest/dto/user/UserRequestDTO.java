package com.progect.ui.rest.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {
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
    private String role;
    private String imgFile;
}
