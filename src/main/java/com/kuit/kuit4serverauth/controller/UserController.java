package com.kuit.kuit4serverauth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // API를 인증된 사용자만 접근 가능하도록
    @GetMapping("/profile")
    public ResponseEntity<String> getProfile(HttpServletRequest request) {
        // TODO : 로그인 한 사용자면 username 이용해 "Hello, {username}" 반환하기
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
    }

    // API에 관리자 권하이 있는 사용자만 접근 가능하도록
    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin(HttpServletRequest request) {
        // TODO: role이 admin이면 "Hello, admin" 반환하기
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden");
    }
}
