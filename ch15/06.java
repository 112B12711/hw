class Sub implements Runnable {
    private int n;
    private int sum = 1;

    public Sub(int a) {
        n = a;
    }

    public void run() {
        calculateFactorial();
        System.out.println("Factorial of " + n + " is: " + sum);
    }

    private void calculateFactorial() {
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 創建兩個Sub的物件，分別計算1*2*...*5和1*2*...*10的值
        Sub sub1 = new Sub(5);
        Sub sub2 = new Sub(10);

        // 使用Runnable方式建立執行緒
        Thread thread1 = new Thread(sub1);
        Thread thread2 = new Thread(sub2);

        // 啟動執行緒
        thread1.start();
        thread2.start();
    }
}
