/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        int previousNumber = -1;

        do {
            System.out.print(randomNumber + " ");
            previousNumber = randomNumber;
            randomNumber = (int) (Math.random() * 10);
        } while (randomNumber >= previousNumber);
    }
}
