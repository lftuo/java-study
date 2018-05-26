package oom.objfun;

public class InitailTelPhone {

    public static void main(String[] args) {
        // 调用系统默认的无参构造方法
        TelPhone phone = new TelPhone();
        // 有参的构造方法
        new TelPhone(5.0f,2.0f,3.0f);
    }

}
