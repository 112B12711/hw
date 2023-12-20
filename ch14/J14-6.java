import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        // 定義字元陣列 hi
        char[] hi = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        // 指定檔案路徑
        String filePath = "hello.txt";

        // 寫入檔案
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(hi);

            System.out.println("字元陣列已成功寫入檔案 " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
