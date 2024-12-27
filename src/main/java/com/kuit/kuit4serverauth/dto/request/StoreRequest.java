package com.kuit.kuit4serverauth.dto.request;

import com.kuit.kuit4serverauth.model.Menu;
import com.kuit.kuit4serverauth.model.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StoreRequest {
    private Store store;
    private Menu menu;
}
