package com.example.principle.inversion.improve;

/**
 * 应用实例
 */
public class DependencyPass {

    public static void main(String[] args) {

        ChangHong changHong = new ChangHong();
        // 方式1：通过接口传递依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        // 方式2：通过构造方法传递依赖
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        // 方式3，通过setter方法传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }

}

// 方式1：通过接口传递依赖
//开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv);// 抽象方法，接收接口
//}
//interface ITV {
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// 方式2：通过构造方法传递依赖
//interface IOpenAndClose {
//    public void open();// 抽象方法
//}
//interface ITV {
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose {
//    public ITV itv;// 成员
//    public OpenAndClose(ITV itv) {  // 构造器
//        this.itv = itv;
//    }
//    @Override
//    public void open() {
//        this.itv.play();
//    }
//}

// 方式3，通过setter方法传递
interface IOpenAndClose {
    public void open();// 抽象方法

    public void setTv(ITV itv);
}
interface ITV {
    public void play();
}
class OpenAndClose implements IOpenAndClose {
    public ITV itv;// 成员
    @Override
    public void setTv(ITV itv) {  // 构造器
        this.itv = itv;
    }
    @Override
    public void open() {
        this.itv.play();
    }
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}