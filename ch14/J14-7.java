import java.io.*;

public class FileWriterAppendExample {

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

        // 開啟檔案並在原先檔案內容後面寫入字串"Welcome!"
        try (FileWriter fileWriter = new FileWriter(filePath, true)) { // 使用 true 表示在檔案末尾追加
            fileWriter.write("\nWelcome!");
            System.out.println("字串\"Welcome!\" 已成功寫入檔案 " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 讀取並印出整個檔案內容
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
