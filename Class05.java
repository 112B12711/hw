public class CCount {
    private static int cnt = 0; // (d) 利用類別變數

    public CCount() {
        cnt++;
    }

    public static void setZero() {
        cnt = 0;
    }

    public static void setValue(int n) {
        cnt = n;
    }

    public static int count() {
        return cnt;
    }

    public static void main(String[] args) {
        CCount obj1 = new CCount();
        System.out.println("Count after obj1: " + count());

        CCount obj2 = new CCount();
        System.out.println("Count after obj2: " + count());

        setZero();
        System.out.println("Count after setZero: " + count());

        setValue(5);
        System.out.println("Count after setValue: " + count());
    }
}
//(d)cnt 變數應該利用「類別變數」，因為它是與類別相關聯的，而不是與特定物件實例相關聯。
//這樣的變數對於整個類別都是共享的，而不是每個物件實例都有一份。
//(e) 在本例中，count() 函數應該宣告為「類別函數」，因為它操作的是類別變數 cnt，而不是特定物件的實例變數。
//這樣的函數可以直接透過類別名稱呼叫，而不需要先建立物件實例。