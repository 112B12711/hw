public class CRectangle {
    private int width;
    private int height;

    // (a) 有引數的建構元
    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    // (b) 沒有引數的建構元，不使用this
    public CRectangle() {
        width = 10;
        height = 8;
    }

    // (c) 沒有引數的建構元，使用this
    public CRectangle() {
        this.width = 10;
        this.height = 8;
    }

    // 用來顯示width和height的成員函式
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {
        // 測試建構元
        CRectangle rect1 = new CRectangle(5, 6); // 使用有引數的建構元
        rect1.display();

        CRectangle rect2 = new CRectangle(); // 使用沒有引數的建構元 (b)
        rect2.display();

        CRectangle rect3 = new CRectangle(); // 使用沒有引數的建構元 (c)
        rect3.display();
    }
}