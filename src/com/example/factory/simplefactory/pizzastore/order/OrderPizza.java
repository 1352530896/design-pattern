package com.example.factory.simplefactory.pizzastore.order;

import com.example.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.example.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.example.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.example.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            if(orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if(orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            } else if(orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨 ");
            } else {
                break;
            }
            //输出Pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            System.out.println("input pizza type:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
