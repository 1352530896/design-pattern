package com.example.prototype.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");

        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.setFriend(new Sheep("jack", 2, "黑色"));

        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆
        Sheep sheep6 = (Sheep) sheep.clone(); //克隆
        Sheep sheep7 = (Sheep) sheep.clone(); //克隆
        Sheep sheep8 = (Sheep) sheep.clone(); //克隆
        Sheep sheep9 = (Sheep) sheep.clone(); //克隆
        Sheep sheep10 = (Sheep) sheep.clone(); //克隆

        System.out.println("sheep = " + sheep);
        System.out.println("sheep2 = " + sheep2 + " sheep2.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep3 = " + sheep3 + " sheep3.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep4 = " + sheep4 + " sheep4.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep5 = " + sheep5 + " sheep5.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep6 = " + sheep6 + " sheep6.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep7 = " + sheep7 + " sheep7.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep8 = " + sheep8 + " sheep8.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep9 = " + sheep9 + " sheep9.friend = " + sheep2.getFriend().hashCode());
        System.out.println("sheep10 = " + sheep10 + " sheep9.friend = " + sheep2.getFriend().hashCode());
    }

}
