/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {
        boolean isBoyBorn = false;
        boolean isGirlBorn = false;
        int childrenCount = 0;

        while (!isBoyBorn || !isGirlBorn) {
            double randomGender = Math.random();

            if (randomGender > 0.5) {
                isBoyBorn = true;
                System.out.print("b ");
            } else {
                isGirlBorn = true;
                System.out.print("g ");
            }

            childrenCount++;
        }

        System.out.println();
        System.out.println("You made it... and you now have " + childrenCount + " children.");
    }
}
