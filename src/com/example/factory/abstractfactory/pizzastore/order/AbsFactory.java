package com.example.factory.abstractfactory.pizzastore.order;

import com.example.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * 是一个抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {

    //让下面的工厂子类具体实现
    public Pizza createPizza(String orderType);

}
