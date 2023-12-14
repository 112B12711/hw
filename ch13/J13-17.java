import java.util.Scanner;

class IntegerLessThanZeroException extends Exception {
    public IntegerLessThanZeroException(String message) {
        super(message);
    }
}

class IntegerGreaterThanZeroException extends Exception {
    public IntegerGreaterThanZeroException(String message) {
        super(message);
    }
}

class IntegerEqualToZeroException extends Exception {
    public IntegerEqualToZeroException(String message) {
        super(message);
    }
}

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數: ");
            int input = scanner.nextInt();

            checkInteger(input);
        } catch (IntegerLessThanZeroException | IntegerGreaterThanZeroException | IntegerEqualToZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("發生未知錯誤: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkInteger(int num) throws IntegerLessThanZeroException, IntegerGreaterThanZeroException, IntegerEqualToZeroException {
        if (num < 0) {
            throw new IntegerLessThanZeroException("您輸入的整數的值小於 0");
        } else if (num > 0) {
            throw new IntegerGreaterThanZeroException("您輸入的整數的值大於 0");
        } else {
            throw new IntegerEqualToZeroException("您输入的整數的值為 0");
        }
    }
}
