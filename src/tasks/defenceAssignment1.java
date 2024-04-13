package tasks;

public class defenceAssignment1 {
    public static void main(String[] args) {
        String str = "Here, hi? Here!";
        String subStr = "hi";

        int occurrences = countOccurrences(str.toLowerCase(), subStr.toLowerCase());
        System.out.println("Occurrences of \"" + subStr + "\" in \"" + str + "\": " + occurrences);
    }
    public static int countOccurrences(String str, String subStr) {
        if (str.length() < subStr.length()) {
            return 0;
        } else if (str.substring(0, subStr.length()).equals(subStr)) {
            return 1 + countOccurrences(str.substring(subStr.length()), subStr);
        } else {
            return countOccurrences(str.substring(1), subStr);
        }
    }
}

