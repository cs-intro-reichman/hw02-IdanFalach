/**
 * Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sumOfDivisors = 1; // 1 is divisor of every number
        String perfectNumberMessage = number + " is a perfect number since " + number + " = 1";

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                sumOfDivisors += i;
                perfectNumberMessage += " + " + i;
            }
        }

        if (number == sumOfDivisors && number != 1) {
            System.out.println(perfectNumberMessage);
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
