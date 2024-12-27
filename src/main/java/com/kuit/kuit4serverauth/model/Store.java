package com.kuit.kuit4serverauth.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    private Long id;
    private String name;
    private Integer minimumOrderPrice;
    private String status;

}
