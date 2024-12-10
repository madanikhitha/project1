public class Division {
    public static void main(String[] args) {
        // Assigning values directly to num1 and num2 (no user input)
        double num1 = 10;  // First number for division
        double num2 = 2;   // Second number for division

        // Performing division
        double result = divide(num1, num2);

        // Display the result
        System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
    }

    // Function to divide two numbers
    public static double divide(double a, double b) {
        // Handling division by zero
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN for division by zero
        }
        return a / b;
    }
}

