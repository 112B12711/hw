import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUpperCaseConverter {

    public static void main(String[] args) {
        // 使用 Scanner 從鍵盤讀取輸入
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個字串：");
        String inputString = scanner.nextLine();
        scanner.close();

        // 使用 String 的 toUpperCase 方法將字串轉換成大寫
        String upperCaseString = inputString.toUpperCase();

        // 寫入檔案
        writeToFile("output.txt", upperCaseString);

        System.out.println("已將大寫字串寫入檔案 output.txt。");
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
