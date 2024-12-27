package com.kuit.kuit4serverauth.dto.request;

import com.kuit.kuit4serverauth.model.Menu;
import com.kuit.kuit4serverauth.model.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OrderRequest {
    private Long orderId;
    private Menu menu;
    private Store store;
}
