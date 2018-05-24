package oom.cls_and_obj;

public class InitailTelPhone {
    public static void main(String[] args) {
        TelPhone phone = new TelPhone();
        //phone.sendMsg();

        // 1.给实例变量赋值
        phone.screen = 5.0f;
        phone.cpu = 1.4f;
        phone.mem = 2.0f;

        // 2.调用对象方法：
        //phone.sendMsg();
        phone.call();
    }
}
