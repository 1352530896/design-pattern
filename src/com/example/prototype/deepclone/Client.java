package com.example.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 重写clone完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();

        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式2 反序列化完成深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + " p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());

    }

}
