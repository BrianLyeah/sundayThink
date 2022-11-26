package com.ccsiot.sundaythink.service.impl;

import com.ccsiot.sundaythink.entity.Box;
import com.ccsiot.sundaythink.entity.Clothes;
import com.ccsiot.sundaythink.service.LaundryService;
import com.ccsiot.sundaythink.service.WasherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaundryServiceImpl implements LaundryService {

    @Autowired
    private WasherService washerService;

    @Override
    public boolean wash(Box box) {
        if (box == null || box.getClothes().isEmpty())
        {
            System.out.println("不能没有衣服来洗。。。");
            return false;
        }
        System.out.println("洗衣店收到衣服。。。");
        List<Clothes> clothes = box.getClothes();
        boolean flag = washerService.wash(clothes);
        String msg =  flag?"洗衣完成，还给顾客。。。":"洗衣未完成，检查原因。。。";
        System.out.println(msg);
        return flag;
    }

    @Override
    public boolean dry(Box box) {
        return false;
    }
}
