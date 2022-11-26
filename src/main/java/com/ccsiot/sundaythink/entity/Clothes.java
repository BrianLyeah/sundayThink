package com.ccsiot.sundaythink.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 衣服类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clothes {
    /**
     * 衣服类型
     */
    private String type;
    /**
     * 衣服颜色
     */
    private String color;
    /**
     * 衣服型号
     */
    private String size;
}
