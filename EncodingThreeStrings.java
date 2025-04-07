import java.util.*;

public class EncodingThreeStrings {

    // Method to split string into front, middle and end parts
    public static String[] splitString(String str) {
        int len = str.length();
        int rem = len % 3;
        int partSize = len / 3;

        String front, middle, end;

        if (rem == 0) {
            front = str.substring(0, partSize);
            middle = str.substring(partSize, 2 * partSize);
            end = str.substring(2 * partSize);
        } else if (rem == 1) {
            front = str.substring(0, partSize);
            middle = str.substring(partSize, 2 * partSize + 1);
            end = str.substring(2 * partSize + 1);
        } else { // rem == 2
            front = str.substring(0, partSize + 1);
            middle = str.substring(partSize + 1, 2 * partSize + 1);
            end = str.substring(2 * partSize + 1);
        }

        return new String[]{front, middle, end};
    }

    // Method to toggle the case of each character
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch))
                toggled.append(Character.toUpperCase(ch));
            else
                toggled.append(Character.toLowerCase(ch));
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter third string: ");
        String str3 = sc.nextLine();

        // Split all strings
        String[] parts1 = splitString(str1);
        String[] parts2 = splitString(str2);
        String[] parts3 = splitString(str3);

        // Form outputs
        String output1 = parts1[0] + parts2[1] + parts3[2];
        String output2 = parts1[1] + parts2[2] + parts3[0];
        String output3 = parts1[2] + parts2[0] + parts3[1];

        // Toggle output3
        output3 = toggleCase(output3);

        // Final results
        System.out.println("Output1 = " + output1);
        System.out.println("Output2 = " + output2);
        System.out.println("Output3 = " + output3);

        sc.close();
    }
}
