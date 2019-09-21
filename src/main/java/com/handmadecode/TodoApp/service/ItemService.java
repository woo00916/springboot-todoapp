package com.handmadecode.TodoApp.service;

import com.handmadecode.TodoApp.model.Item;
import org.springframework.stereotype.Service;

@Service //spring boot에 service라는 것을 알려주는 어노테이션
public class ItemService {
    //DB에서 id로 검색해서 투두아이템을 가져와서 리턴
    public Item get(final String id){
        //가져온다

        return new Item.builder().title("connect to db...").build();//lombok @builder를 쓰면 new 가 필요없넹
    }

}
