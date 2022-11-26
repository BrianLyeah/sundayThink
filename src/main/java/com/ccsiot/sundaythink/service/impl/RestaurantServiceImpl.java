package com.ccsiot.sundaythink.service.impl;


import com.ccsiot.sundaythink.service.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public void eat() {
        if (checkTicket())
        {
            System.out.println("买了票了。。。");
            System.out.println("给你打餐。。。");
        }
    }

    /**
     * 校验买票没有
     * @return
     */
    private boolean checkTicket(){
        return true;
    }
}
