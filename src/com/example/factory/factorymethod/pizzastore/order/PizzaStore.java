package com.example.factory.factorymethod.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if(loc.equals("bj")) {
            //创建北京的口味的各种Pizza
            new BJOrderPizza();
        } else if(loc.equals("ld")) {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }

}
