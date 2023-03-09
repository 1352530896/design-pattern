package com.example.singleton.type3;

public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance.hashCode());
    }
    
}

// 懒汉式（线程不安全）
class Singleton {

    //1.在本类内部定义对象
    private static Singleton instance;

    //2.构造器私有化，外部不能new
    private Singleton() {

    }

    //3.提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}