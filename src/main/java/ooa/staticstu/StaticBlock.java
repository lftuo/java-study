package ooa.staticstu;

public class StaticBlock {

    String name;
    // java中可以通过初始化块进行数据赋值，在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。
    {
        name = "tuotuo";
    }

    // 静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
    int num1;   // 声明变量num1
    int num2;   // 声明变量num2
    static int num3;    // 声明静态变量num3

    public StaticBlock() {
        num1 = 90;
        System.out.println("通过构造方法为变量num1赋值");
    }
    // 初始化块
    {
        num2 = 74;
        // 非静态初始块可以给非静态、静态变量赋值
        num3 = 10;
        System.out.println("通过初始化块为变量num2赋值");
    }
    // 静态初始块
    static {
        // 静态初始化块只能给静态变量赋值，不能初始化普通的成员变量
        // num1 = 0;
        num3 = 83;
        System.out.println("通过静态初始化块为变量num3赋值");
    }

    // 程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
    // 由于静态初始化块只在类加载时执行一次，所以当再次创建对象 block1 时并未执行静态初始化块。
    public static void main(String[] args) {
        // 创建类的对象
        StaticBlock block = new StaticBlock();

        System.out.println("num1:"+block.num1);
        System.out.println("num2:"+block.num2);
        System.out.println("num1:"+num3);
        // 再次创建类的对象
        StaticBlock block1 = new StaticBlock();
    }
}
