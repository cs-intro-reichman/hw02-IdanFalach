/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
        int sideLength = Integer.parseInt(args[0]);

        for (int i = 1; i <= sideLength; i++) {
            boolean isEvenLine = (i % 2 == 0);

            for (int j = 0; j < sideLength; j++) {
                if (isEvenLine) {
                    System.out.print(" *");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
