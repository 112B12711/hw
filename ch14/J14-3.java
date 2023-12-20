import java.io.*;

public class SumCalculatorToFile {

    public static void main(String[] args) {
        int n = readIntegerFromConsole();
        int sum = calculateSum(n);

        // 寫入檔案
        writeToFile("output.txt", "1+2+3+...+" + n + " 的總和是：" + sum);

        System.out.println("計算結果已寫入檔案 output.txt。");
    }

    // 從控制台讀取整數的方法
    private static int readIntegerFromConsole() {
        int result = 0;
        System.out.println("請輸入一個整數 n：");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            result = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    // 計算1+2+3+...+n的總和的方法
    private static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 寫入檔案的方法
    private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
