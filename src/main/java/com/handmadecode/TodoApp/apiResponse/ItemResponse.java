package com.handmadecode.TodoApp.apiResponse;
import com.handmadecode.TodoApp.model.Item;
import lombok.*;

import java.util.List;

import com.handmadecode.TodoApp.apiResponse.ApiResponse;
public class ItemResponse extends ApiResponse<Item> {
    @Builder//Adapter에서 씀
    public ItemResponse(final Item item, final List<String> errors){
        super(item);
        this.setErrors(errors);
    }

}

