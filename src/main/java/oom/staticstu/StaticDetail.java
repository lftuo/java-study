package oom.staticstu;

public class StaticDetail {

    String name = "imooc";
    static String hobby = "programmer";

    // 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
    public static void print(){
        // 不能直接调用非静态方法
        // System.out.println("hello "+ name);
        // 如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量
        StaticDetail detail = new StaticDetail();
        System.out.println("hello "+ detail.name);
        // 可直接调用
        System.out.println("hello " + hobby);
    }

    //  在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
    public void show(){
        System.out.println("show "+ name);
        System.out.println("show " + hobby);
    }

    public static void main(String[] args) {
        // 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。
        StaticDetail detail = new StaticDetail();
        detail.show();
        // 可以直接调用静态方法
        print();
    }
}
