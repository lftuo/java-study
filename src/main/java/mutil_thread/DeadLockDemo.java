package mutil_thread;

/**
 * 死锁：使用jstack可查看死锁
 * 死锁示例：数据库释放连接时发生异常
 *
 */
public class DeadLockDemo {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args){
         new DeadLockDemo().deadLock();
    }

    public void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (A){
                    System.out.println("enter A ....");
                    try {
                        Thread.sleep(2000);
                        System.out.println("sleep A ....");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B){
                        System.out.println("lock B ....");
                        System.out.println("1");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (B){
                    System.out.println("enter B ....");
                    synchronized (A){
                        System.out.println("lock A ....");
                        System.out.println("2");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
