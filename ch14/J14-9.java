import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {

    public static void main(String[] args) {
        // 讀取 aaa.txt 與 bbb.txt 內容
        String aaaContent = readFile("aaa.txt");
        String bbbContent = readFile("bbb.txt");

        // 合併兩個檔案的內容
        String mergedContent = mergeContents(aaaContent, bbbContent);

        // 儲存合併後的內容至 ccc.txt
        writeFile("ccc.txt", mergedContent);

        // 列印 aaa.txt 內容
        System.out.println("aaa.txt 內容：");
        System.out.println(aaaContent);

        // 列印 bbb.txt 內容
        System.out.println("\nbbb.txt 內容：");
        System.out.println(bbbContent);

        // 列印 ccc.txt 內容
        System.out.println("\nccc.txt 內容：");
        System.out.println(mergedContent);
    }

    // 讀取檔案內容的方法
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // 合併兩個檔案內容的方法
    private static String mergeContents(String content1, String content2) {
        return content1.trim() + "\n" + content2.trim();
    }

    // 將內容寫入檔案的方法
    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
