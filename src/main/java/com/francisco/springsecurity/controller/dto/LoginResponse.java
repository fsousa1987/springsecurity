package com.francisco.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
