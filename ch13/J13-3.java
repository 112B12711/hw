// Ex13_1,例外訊息的擷取
public class Ex13_1 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            if (den != 0) {
                int ans = num / den;
                System.out.println("Answer: " + ans);
            } else {
                System.out.println("除數為0");
            }
        } catch (ArithmeticException e) {
            System.out.println("捕捉到算術異常: " + e.getMessage());
        } finally {
            System.out.println("finally區塊");
        }

        System.out.println("end of main()!!");
    }
}
