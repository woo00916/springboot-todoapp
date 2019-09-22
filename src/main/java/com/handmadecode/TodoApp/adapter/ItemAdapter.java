package com.handmadecode.TodoApp.adapter;

import com.handmadecode.TodoApp.apiResponse.ItemResponse;
import com.handmadecode.TodoApp.model.Item;

import java.util.List;

//Class converting Item to ItemResponse
public class ItemAdapter {
    public static ItemResponse toItemResponse(final Item item, final List<String> errors){
        return ItemResponse.builder().item(item).errors(errors).build();
    }

}
