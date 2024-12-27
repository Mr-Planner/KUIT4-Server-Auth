package com.kuit.kuit4serverauth.dto;

import com.kuit.kuit4serverauth.model.Store;
import lombok.*;

import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuStoreDTO {
    private Store store;
    private Menu menu;
}
