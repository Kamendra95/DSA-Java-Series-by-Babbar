public class StringProblems {

    // 1. Count consonants in a string
    public static int countConsonants(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if ((ch >= 'a' && ch <= 'z') &&
                ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }

    // 2. Convert string to uppercase without using toUpperCase()
    public static String convertToUppercase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    // 3. Find frequency of a character
    public static int characterFrequency(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    // 4. Remove all spaces from string
    public static String removeSpaces(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        return result;
    }

    // 5. Check if string contains only digits
    public static boolean containsOnlyDigits(String str) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    // 6. Count words in a sentence
    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }



    public static void main(String[] args) {

        String text = "Hello World Java";

        System.out.println("Consonants: " + countConsonants(text));

        System.out.println("Uppercase: " + convertToUppercase(text));

        System.out.println("Frequency of 'l': " + characterFrequency(text, 'l'));

        System.out.println("Without spaces: " + removeSpaces(text));

        System.out.println("Only digits (12345): " + containsOnlyDigits("12345"));

        System.out.println("Word count: " + countWords(text));
    }
}