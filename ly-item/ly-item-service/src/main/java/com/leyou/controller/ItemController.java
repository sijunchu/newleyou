package com.leyou.controller;

import com.leyou.Item;
import com.leyou.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Date:2019/9/8 description:
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("/item")
    public ResponseEntity<Item> saveItem(Item item){
//        if (item.getPrice()==null){
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//           throw  new RuntimeException("价格不能为空");
//        }
//        Item item1 = itemService.saveItem(item);
        return  ResponseEntity.status(HttpStatus.CREATED).body( itemService.saveItem(item));
    }
}
