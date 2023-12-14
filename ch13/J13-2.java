// Ex13_1,例外訊息的擷取
public class Ex13_1 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        if (den != 0) {
            int ans = num / den;
            System.out.println("Answer: " + ans);
        } else {
            System.out.println("除數為0");
        }

        System.out.println("end of main()!!");
    }
}
