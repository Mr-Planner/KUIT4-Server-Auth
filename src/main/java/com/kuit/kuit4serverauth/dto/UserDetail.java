package com.kuit.kuit4serverauth.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@Builder
@NoArgsConstructor
public class UserDetail {
    private String username;  // 사용자의 이름 또는 ID
    private String role;      // 사용자의 역할 (예: USER, ADMIN)
}