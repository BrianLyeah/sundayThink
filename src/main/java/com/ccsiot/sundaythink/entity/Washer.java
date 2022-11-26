package com.ccsiot.sundaythink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 洗衣机
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Washer {
    /**
     * 洗衣机no
     */
    private String washerNo;
    /**
     * 洗衣机模式
     */
    private String model;
    /**
     * 洗衣机容量
     */
    private int capacity;
    /**
     * 洗衣时长
     */
    private String washTime;
}
