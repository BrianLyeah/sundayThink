package com.ccsiot.sundaythink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 箱子：用来装衣服
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Box {

    private static Box instance = null;

    /**
     * 箱子大小
     */
    private String size;
    /**
     * 装的衣服
     */
    private List<Clothes> clothes;

    /**
     * 我只有一个箱子，所以通过单例模式获取箱子
     * @return
     */
    public static Box getInstance() {
        if (instance == null) {
            synchronized (Box.class) {
                if (instance == null) {
                    instance = new Box();
                    instance.setSize("24寸箱子");
                }
            }
        }
        return instance;
    }
}
