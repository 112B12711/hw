import java.io.*;

class Data {
    private String name;
    private int english;
    private int math;

    // (a) 有引數的建構子
    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }

    // (b) 寫入資料到 student.txt
    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            writer.write(name + " " + english + " " + math);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // (c) 顯示資料及平均分數
    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("英文成績: " + english);
        System.out.println("數學成績: " + math);

        // 計算平均分數
        double average = (english + math) / 2.0;
        System.out.println("平均分數: " + average);
    }

    // Getters and Setters (Optional)
    public String getName() {
        return name;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}

public class Main {
    // (d) 讀取 student.txt 的資料並顯示
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line = reader.readLine();
            String[] parts = line.split(" ");
            
            // 使用 readData() 函數建立 Data 物件
            Data student = new Data(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            
            // 顯示資料
            student.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 使用建構子建立 stu1 和 stu2
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        // 將 stu1 和 stu2 的資料寫入 student.txt
        stu1.writeData();
        stu2.writeData();

        // 顯示 stu1 和 stu2 的資料
        stu1.show();
        System.out.println();
        stu2.show();

        System.out.println("\n讀取 student.txt 的資料：");
        readData();
    }
}
