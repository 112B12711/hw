import java.util.Scanner;

class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) { // Circle建構子
        radius = r;
    }

    public void show() {
        System.out.printf("半徑為 %.2f 的圓面積為 %.2f\n", radius, pi * radius * radius);
    }
}

public class Ch9_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle[] cir;
        cir = new Circle[6]; // 改為建立長度為 6 的陣列

        for (int i = 0; i < cir.length; i++) {
            System.out.print("請輸入第 " + i + " 個圓的半徑: ");
            double radius = scanner.nextDouble();
            cir[i] = new Circle(radius);
        }

        for (int i = 0; i < cir.length; i++) {
            cir[i].show(); // 利用物件 cir[i] 呼叫 show() 函數
        }

        scanner.close();
    }
}