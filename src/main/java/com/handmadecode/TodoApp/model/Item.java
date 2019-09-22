package com.handmadecode.TodoApp.model;
import java.util.Date;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
//@Data
@Getter @Setter
@Builder
public class Item {
    private String id;
    private String title;
    private boolean done;


    public static class builder{
        private String id;
        private String title;
        private boolean done;

        public builder(){

        }

        public builder id(String id){
            this.id=id;
            return this;
        }

        public builder title(String title){
            this.title=title;
            return this;
        }

        public builder done(boolean done){
            this.done=done;
            return this;
        }

        public Item build(){
            Item item=new Item();
            item.id=this.id;
            item.title=this.title;
            item.done=this.done;
            return item;
        }
    }
}
