package com.authenticationapi.dtos;

import com.authenticationapi.domains.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
