package com.example.singleton.type5;

public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懒汉式3，线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance.hashCode());
    }
    
}

// 懒汉式（线程安全，同步方法）
// 其实并没有解决线程安全问题
class Singleton {

    //1.在本类内部定义对象
    private static Singleton instance;

    //2.构造器私有化，外部不能new
    private Singleton() {

    }

    //3.提供一个静态的公有方法
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            // 同步机制放在代码块位置，但是并没有解决线程安全问题
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}