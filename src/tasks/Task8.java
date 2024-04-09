package tasks;

public class Task8 {
    /**
     * This method checks if the given string consists only of digits.
     * It uses a recursive approach.
     * Time complexity: O(n)
     *
     * @param s the input string
     * @return "YES" if the string consists only of digits, "NO" otherwise
     */
    public static String allDigits(String s) {
        // Base case: If the string is empty, return "YES"
        if (s.isEmpty()) {
            return "YES";
        }

        // Check if the first character is a digit
        char firstChar = s.charAt(0);
        if (Character.isDigit(firstChar)) {
            // Recursive call
            return allDigits(s.substring(1));
        } else {
            // If the first character is not a digit, return "NO"
            return "NO";
        }
    }

    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "123a12";

        double startTime1 = System.nanoTime();
        String result1 = allDigits(input1);
        double endTime1 = System.nanoTime();
        double duration1 = (endTime1 - startTime1) / 1000000;

        double startTime2 = System.nanoTime();
        String result2 = allDigits(input2);
        double endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1000000;

        System.out.println("Result for '" + input1 + "': " + result1);
        System.out.println("Time taken for '" + input1 + "': " + duration1 + " milliseconds");

        System.out.println("Result for '" + input2 + "': " + result2);
        System.out.println("Time taken for '" + input2 + "': " + duration2 + " milliseconds");
    }
}
