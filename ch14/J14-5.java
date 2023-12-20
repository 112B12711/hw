import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // 指定檔案路徑
        String filePath = "donkey.txt";

        // 讀取檔案內容並計算字元數
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            int charCount = 0;
            int data;
            boolean skipLine = false;

            // 逐行讀取並印出檔案內容
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("我有一隻小毛驢")) {
                    skipLine = true;
                    continue; // 跳過包含特定字串的行
                }

                // 逐字讀取並印出檔案內容
                for (int i = 0; i < line.length(); i++) {
                    charCount++;
                    System.out.print(line.charAt(i));
                }

                System.out.println(); // 換行
            }

            System.out.println("讀取的字元數: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
