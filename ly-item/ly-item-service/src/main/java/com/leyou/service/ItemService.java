package com.leyou.service;

import com.leyou.Item;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exceptions.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Date:2019/9/8 description:
 */
@Service
@Slf4j
public class ItemService {
    public Item saveItem(Item item){
        if (item.getPrice()==null){
            log.error("新增商品价格不能为空");
            throw new LyException(ExceptionEnum.PRICE_CAN_NOT_NULL);
        }
        int id = new Random().nextInt(100);
        item.setId(id);

        return item;
    }
}
