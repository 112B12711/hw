import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // 指定檔案路徑
        String filePath = "donkey.txt";

        // 讀取檔案內容並計算字元數
        try (FileReader fileReader = new FileReader(filePath)) {
            int charCount = 0;
            int data;
            
            // 逐字讀取並印出檔案內容
            while ((data = fileReader.read()) != -1) {
                charCount++;
                System.out.print((char) data);
            }
            
            System.out.println("\n讀取的字元數: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
