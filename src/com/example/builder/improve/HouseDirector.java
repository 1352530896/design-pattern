package com.example.builder.improve;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        this.houseBuilder.buildBasic();
        this.houseBuilder.buildWalls();
        this.houseBuilder.roofed();
        return this.houseBuilder.buildHouse();
    }

}
