package mutil_thread;

/**
 * 并发编程的挑战，上下文切换，多线程一定快吗
 * 当count<10000时，并发执行操作比串行慢，因为包括线程创建与上下文切换花销
 */
public class ConcurrencyTest {

    private static final long count = 100000001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    /**
     * 多线程并发执行：
     *      1.将a+=5操作加入线程，并start
     *      2.在1运行过程中，并发操作b--操作；
     *      3.join等待1操作完成后，统一打印结果
     *      相当于a+=5 b--两个操作为并发
     */
    private static void concurrency() throws InterruptedException{
        long start = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();

        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        // 线程结束后返回
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency :" + time + "ms, b="+b);
    }

    /**
     * 串行执行a+=5/b--操作
     */
    public static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b="+b+",a="+a);
    }
}
