package com.example.singleton.type2;

public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance.hashCode());
    }
    
}

// 饿汉式（静态代码块）
class Singleton {

    //1.构造器私有化，外部不能new
    private Singleton() {

    }

    //2.在本类内部定义对象
    private static Singleton instance;

    //3.在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    //4.对外提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}