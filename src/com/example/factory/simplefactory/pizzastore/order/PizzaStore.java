package com.example.factory.simplefactory.pizzastore.order;

//相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();//不适用工厂模式

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出程序~");

        //简单工厂模式2 （静态工厂模式）
        new OrderPizza2();
    }

}
