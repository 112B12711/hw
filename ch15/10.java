class HiByePrinter implements Runnable {
    private String message;
    private int interval;
    private int times;

    public HiByePrinter(String msg, int interval, int times) {
        this.message = msg;
        this.interval = interval;
        this.times = times;
    }

    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(message + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 創建兩個 HiByePrinter 的物件，分別代表 hi 和 bye 的執行緒
        HiByePrinter hiPrinter = new HiByePrinter("Hello", 1000, 5);
        HiByePrinter byePrinter = new HiByePrinter("Good bye", 2500, 5);

        // 使用 Runnable 的方式建立執行緒
        Thread hiThread = new Thread(hiPrinter);
        Thread byeThread = new Thread(byePrinter);

        // 啟動執行緒
        hiThread.start();
        byeThread.start();
    }
}
