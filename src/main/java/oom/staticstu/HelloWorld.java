package oom.staticstu;

public class HelloWorld {

    // 使用static关键字定义静态方法
    public static void print(){
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        // 直接通过类名调用
        HelloWorld.print();

        // 也可以通过对象名调用，推荐直接使用类名调用
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
    }
}
