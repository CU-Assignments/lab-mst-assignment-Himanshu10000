public class MathOperations {

    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded multiply methods
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Testing add() methods
        System.out.println("Addition of 2 ints: " + math.add(5, 3));                  // 8
        System.out.println("Addition of 2 doubles: " + math.add(4.2, 3.8));           // 8.0
        System.out.println("Addition of 3 ints: " + math.add(1, 2, 3));               // 6

        // Testing multiply() methods
        System.out.println("Multiplication of 2 ints: " + math.multiply(4, 5));       // 20
        System.out.println("Multiplication of 2 doubles: " + math.multiply(2.5, 4.0));// 10.0
        System.out.println("Multiplication of 3 ints: " + math.multiply(2, 3, 4));    // 24
    }
}
