package com.ccsiot.sundaythink.service;

import com.ccsiot.sundaythink.entity.Clothes;

import java.util.List;

/**
 * 洗衣机服务，提供洗衣物功能
 */
public interface WasherService {

    /**
     * 洗衣服
     * @param clothes
     * @return
     */
    public boolean wash(List<Clothes> clothes);

}
