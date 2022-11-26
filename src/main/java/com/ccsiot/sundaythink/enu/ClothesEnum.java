package com.ccsiot.sundaythink.enu;

public interface  ClothesEnum {

    /**
     * 衣服类型：衣服、裤子
     */
     enum TypeEnum implements ClothesEnum{
        CLOTHES("clothes"),PANTS("pants");


        public static TypeEnum random(int i)
        {
            return values()[i % values().length];
        }

        private String type;

         public String getType() {
             return type;
         }

         public void setType(String type) {
             this.type = type;
         }

         TypeEnum(String type) {
            this.type = type;
        }
    }

    /**
     * 衣服size
     */
     enum SizeEnum implements ClothesEnum{
        S("S"),L("L"),XL("XL"),XLL("XLL");

        public static SizeEnum random(int i)
        {
            return values()[i % values().length];
        }

        private String size;

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        SizeEnum(String size) {
            this.size = size;
        }
    }

    /**
     * 衣物颜色
     */
    enum ColorEnum implements ClothesEnum{
        RED("red"),BLUE("blue"),BLACK("black");


        public static ColorEnum random(int i)
        {
            return values()[i % values().length];
        }

        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        ColorEnum(String color) {
            this.color = color;
        }
    }
}
