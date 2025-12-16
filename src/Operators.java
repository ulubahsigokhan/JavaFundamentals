public class Operators {

    public static void main(String[] args) {

        // ARITHMETIC OPERATORS (SIMPLE CALCUTOR)
        // This example shows how Java uses arithmetic operators (+, -, *, /, %) to perform basic calculations
        // between two numbers

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        //-----------------------------------------------------------------------------------------------------

        // Comparison Operators (NUMBER CHECKER)
        // This example demonstrates comparison operator (>, <, ==, !=) which return true or false when
        // comparing values

        byte x = 15;
        byte y = 20;

        System.out.println("x is greater than y: " + (x > y));
        System.out.println("x is less than y: " + (x < y));
        System.out.println("x is equals to y: " + (x == y));
        System.out.println("x not equal to y" + (x != y));

        //-----------------------------------------------------------------------------------------------------

        // Logical Operators (LOGIN VALIDATION)
        // This example shows logical operators (&&, ||, !) used to combine conditions, commonly seen in
        // validation and decision-making

        String username = "admin";
        String password = "0000";

        boolean isValid = username.equals("admin") && password.equals("0000");

        System.out.println("Login succesful: " + isValid);
    }
}
