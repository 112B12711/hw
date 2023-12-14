class NoTriangleException extends Exception {
    public NoTriangleException(String message) {
        super(message);
    }
}

class EquilateralTriangleException extends Exception {
    public EquilateralTriangleException(String message) {
        super(message);
    }
}

class NotEquilateralTriangleException extends Exception {
    public NotEquilateralTriangleException(String message) {
        super(message);
    }
}

public class Ex13_14 {
    public static void main(String[] args) {
        try {
            triangle(3, 3, 3);
        } catch (NoTriangleException e) {
            System.out.println(e.getMessage());
        } catch (EquilateralTriangleException e) {
            System.out.println(e.getMessage());
        } catch (NotEquilateralTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void triangle(int a, int b, int c) throws NoTriangleException, EquilateralTriangleException, NotEquilateralTriangleException {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new NoTriangleException("不構成三角形");
        } else if (a == b && a == c && b == c) {
            throw new EquilateralTriangleException("這是正三角形");
        } else {
            throw new NotEquilateralTriangleException("這不是正三角形");
        }
    }
}
