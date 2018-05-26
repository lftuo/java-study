package ooa.staticstu;

public class StaticDemo {

    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
    int score2 = 92;

    // 定义静态方法sum，计算成绩总分，并返回总分
    public static int sum() {
        // 静态方法中红调用非静态方法，必须通过创建累的对象，然后通过该对象访问非静态变量
        StaticDemo hello = new StaticDemo();
        return score1+hello.score2;

    }

    public static void main(String[] args) {

        // 调用静态方法sum并接收返回值
        int allScore = sum();
        System.out.println("总分：" + allScore);
    }
}