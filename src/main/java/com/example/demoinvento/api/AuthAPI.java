package com.example.demoinvento.api;/*  gaajiCode
    99
    04/01/2025
    */

import com.example.demoinvento.dtos.LoginRequestDTO;
import com.example.demoinvento.dtos.RegisterDTO;
import com.example.demoinvento.dtos.Response;
import com.example.demoinvento.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/auth")
@RequiredArgsConstructor
public class AuthAPI {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> registerUser(@RequestBody @Valid RegisterDTO registerRequest) {
        return ResponseEntity.ok(userService.registerUser(registerRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response> loginUser(@RequestBody @Valid LoginRequestDTO loginRequest) {
        return ResponseEntity.ok(userService.loginUser(loginRequest));
    }

}
