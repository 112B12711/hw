class Prepaid extends Thread {
    private int sum = 200;

    public void run() {
        for (int i = 0; i < 3; i++) {
            int fee = (int) (Math.random() * 100); // 產生0-99的隨機整數作為通話費

            if (sum > 10) {
                talk(fee);
            } else {
                System.out.println("餘額不足，無法打電話");
                break;
            }
        }
    }

    public synchronized void talk(int fee) {
        System.out.println("打了" + fee + "元，餘額" + (sum - fee) + "元");

        try {
            Thread.sleep(100); // 故意拖延時間，模擬同步問題
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sum -= fee;
    }
}

public class Main {
    public static void main(String[] args) {
        Prepaid phone1 = new Prepaid();
        Prepaid phone2 = new Prepaid();
        Prepaid phone3 = new Prepaid();

        phone1.start();
        phone2.start();
        phone3.start();
    }
}
