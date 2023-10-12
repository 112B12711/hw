// hw9_3，從一個建構元呼叫另一個建構元
class Caaa // (a) 修正類別名稱為 Caaa
{
    private int value;

    public Caaa()
    {
        this(10); // (a) 設定預設值為 10
    }

    public Caaa(int i)
    {
        value = i;
        System.out.println("value=" + value);
    }
}
public class hw9_3
{
    public static void main(String args[])
    {
        Caaa obj1 = new Caaa(); // (b) 第21行呼叫的是沒有引數的建構元
        Caaa obj2 = new Caaa(12); // (b) 第22行呼叫的是有引數的建構元
    }
}


//(c) 在本例中，第2行的 Caaa 類別是否可以宣告為 public 取決於這個類別的使用情境。
//如果這個類別只在同一個檔案中被使用，則不需要宣告為 public。
//如果這個類別要在其他檔案中被使用，則需要宣告為 public。
//(d) 如果將第4行的 value 成員改成宣告為 public，這表示其他程式碼可以直接存取和修改 value 的值，可能會破壞封裝性。
//這樣的改變可能使得程式的維護和擴展變得更加困難，因為外部程式碼可以直接改變 value 的值，而不需要經過 Caaa 類別的方法。
//最好的做法是保持 value 為私有，使用公共方法來訪問和修改它。