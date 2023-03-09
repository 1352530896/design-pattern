package com.example.singleton.type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance.hashCode());
    }
    
}

//静态内部类完成，推荐使用
class Singleton {

    private static volatile Singleton instance;

    //写一个静态内部类，该类中有一个静态的属性Singleton
    //在Singleton类装载的时候SingletonInstance不会立即装载，保证了懒加载
    //当getInstance方法用到了SingletonInstance.INSTANCE属性时，会去装载SingletonInstance类，jvm在装载类的时候是线程安全的，所以也保证了线程安全。
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //构造器私有化
    private Singleton() {

    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}