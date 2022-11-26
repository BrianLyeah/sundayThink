package com.ccsiot.sundaythink.service;

import com.ccsiot.sundaythink.entity.Box;

public interface LaundryService {

    /**
     * 提供了洗衣服的功能
     * @param box 衣服
     * @return
     */
    boolean wash(Box box);

    /**
     * 提供了烘干功能
     * @param box
     * @return
     */
    boolean dry(Box box);
}
