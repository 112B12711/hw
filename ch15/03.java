class Test extends Thread {
    private String id;

    public Test(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            for (int j = 0; j < 100000000; j++);
        System.out.println(id + " " + i);
    }
}

public class Main {
    public static void main(String[] args) {
        // 創建四個執行緒物件
        Test hi = new Test("Hello");
        Test bye = new Test("Good bye");
        Test morning = new Test("Good morning");
        Test night = new Test("Good night");

        // 啟動四個執行緒
        hi.start();
        bye.start();
        morning.start();
        night.start();
    }
}
