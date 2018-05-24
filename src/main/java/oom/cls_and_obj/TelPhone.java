package oom.cls_and_obj;

// 1. 定义类
public class TelPhone {

    // 2. 属性（成员变量有什么），Java会分配默认初始值
    float screen;
    float cpu;
    float mem;
    int var;
    int repearVar = 20;

    // 3. 方法 干什么
    void call(){
        int localVar = 10;// 局部变量：必须手动定义初始值
        // int localVar = 0;// 在同一方法中，不允许有重复的局部变量名
        int repearVar = 30;// 两类变量同名时，局部变量具有较高的优先级
        System.out.println("localVar:"+localVar);
        System.out.println("repeatVar:"+repearVar);
        System.out.println("var:"+var);
        System.out.println("tel phone 打电话");
    }

    void sendMsg(){
        int localVar = 20;
        System.out.println("localVar:"+localVar);//在不同方法中，允许有重复的局部变量名
        System.out.println("var:"+var);
        System.out.println("tel phone 发短信");
        System.out.println("screen:"+screen+" cpu:"+cpu+" mem:"+mem);

    }
}
