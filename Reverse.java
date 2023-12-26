/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        String originalString = args[0];
        String reversedString = "";
        int stringLength = originalString.length();

        for (int i = stringLength - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        System.out.println(reversedString);

        int middleCharIndex = (stringLength - 1) / 2;
        char middleChar = originalString.charAt(middleCharIndex);
        System.out.println("The middle character is " + middleChar);
    }
}
