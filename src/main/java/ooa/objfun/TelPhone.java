package ooa.objfun;

public class TelPhone {
    // 无参的构造方法
    public TelPhone() {
        System.out.println("无参的构造方法执行了！");
    }

    // 有参的构造方法
    public TelPhone(float screen,float mem,float cpu) {
        System.out.println("screen:"+screen+"; mem:"+mem+"; cpu:"+cpu);
    }
}
