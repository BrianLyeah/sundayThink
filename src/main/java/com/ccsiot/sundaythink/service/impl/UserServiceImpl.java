package com.ccsiot.sundaythink.service.impl;


import com.ccsiot.sundaythink.entity.Box;
import com.ccsiot.sundaythink.entity.Clothes;
import com.ccsiot.sundaythink.enu.ClothesEnum;
import com.ccsiot.sundaythink.service.LaundryService;
import com.ccsiot.sundaythink.service.RestaurantService;
import com.ccsiot.sundaythink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private LaundryService laundryService;

    @Override
    public void eat() {
        restaurantService.eat();
    }

    @Override
    public void wash() {
        // 先获取箱子
        Box box = Box.getInstance();
        box.setSize("24寸");
        // 装入衣物
        packageClothes(box);
        laundryService.wash(box);
    }

    private void packageClothes(Box box){
        List<Clothes> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Clothes clothes = new Clothes();
            clothes.setType(ClothesEnum.TypeEnum.random(i).getType());
            clothes.setSize(ClothesEnum.SizeEnum.random(i).getSize());
            clothes.setColor(ClothesEnum.ColorEnum.random(i).getColor());
            list.add(clothes);
        }
        box.setClothes(list);
    }
}
