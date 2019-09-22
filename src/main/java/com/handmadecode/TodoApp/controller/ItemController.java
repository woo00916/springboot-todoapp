package com.handmadecode.TodoApp.controller;

import com.handmadecode.TodoApp.adapter.ItemAdapter;
import com.handmadecode.TodoApp.apiResponse.ItemResponse;
import com.handmadecode.TodoApp.model.Item;
import com.handmadecode.TodoApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(method= RequestMethod.GET,value="/{id}")//path에서 id라는 갓을 받는다....
    public @ResponseBody ItemResponse get(@PathVariable(value="id")String id){
        List<String> error = new ArrayList<>();
        Item item = null;

        try{
           item =   itemService.get(id);
        }catch (Exception e){
            error.add(e.toString());
        }

        return ItemAdapter.toItemResponse(item,error);
    }
}


