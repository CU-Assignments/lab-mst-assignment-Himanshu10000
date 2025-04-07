public class InsertAlphabets {

    public static void main(String[] args) {
        String input = "Ac 12a"; // You can change this for testing
        System.out.println("Output: " + transformString(input));
    }

    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();
        input = input.toLowerCase(); // Convert entire string to lowercase
        int n = input.length();

        for (int i = 0; i < n; i++) {
            char current = input.charAt(i);
            result.append(current);

            // If current and next characters are both alphabets
            if (i < n - 1 && Character.isLetter(current) && Character.isLetter(input.charAt(i + 1))) {
                int val1 = current - 'a' + 1;
                int val2 = input.charAt(i + 1) - 'a' + 1;
                int sum = val1 + val2;

                if (sum % 26 == 0) {
                    result.append('0');
                } else {
                    char insertedChar = (char) ((sum % 26 - 1) + 'a');
                    result.append(insertedChar);
                }
            }
        }

        return result.toString();
    }
}
