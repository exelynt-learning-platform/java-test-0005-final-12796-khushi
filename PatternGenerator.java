public class PatternGenerator {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        int currentNumber = 1;

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}