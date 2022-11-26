package com.ccsiot.sundaythink.service.impl;

import com.alibaba.fastjson.JSON;
import com.ccsiot.sundaythink.entity.Clothes;
import com.ccsiot.sundaythink.service.WasherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasherServiceImpl implements WasherService {


    private static final String LOCK="lock";

    @Override
    public boolean wash(List<Clothes> clothes) {
        synchronized (LOCK){
            if (clothes.isEmpty())
            {
                System.out.println("没有衣服不能开动洗衣机。。。");
                return false;
            }
            System.out.println("洗衣机开始洗衣服，衣物数量："+clothes.size());
            for (Clothes clothe : clothes) {
                System.out.println("正在洗衣服："+ JSON.toJSONString(clothe));
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("洗衣物完成。。。");
        }
        return true;
    }
}
