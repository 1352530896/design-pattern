package com.example.principle.composition;

public class Computer {

    private Mouse mouse = new Mouse();//鼠标可以和Computer不能分离

    private Monitor monitor = new Monitor();//显示器可以和Computer不能分离

}
