package com.example.singleton;

//JDK源码单例模式
public class TestRuntime {

    public static void main(String[] args) {
        //Runtime就是使用的饿汉式（静态常量）实现的。
        Runtime runtime = Runtime.getRuntime();
    }

}
