package com.kuit.kuit4serverauth.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private Long id;
    private Long userId;
    private int totalPrice;
    private Long menuId;
    private String menuName;
}
