package com.kuit.kuit4serverauth.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Menu {
    private Long id;
    private String name;
    private int price;
    private Long storeId;
}
