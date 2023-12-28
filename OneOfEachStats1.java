/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        int numberOfExperiments = Integer.parseInt(args[0]);
        int allChildrenCount = 0;
        int couplesWith2Children = 0;
        int couplesWith3Children = 0;
        int couplesWith4OrMoreChildren = 0;

        for (int i = 0; i < numberOfExperiments; i++) {
            boolean isBoyBorn = false;
            boolean isGirlBorn = false;
            int childrenPerCouple = 0;

            while (!isBoyBorn || !isGirlBorn) {
                double randomGender = Math.random();

                if (randomGender > 0.5) {
                    isBoyBorn = true;
                } else {
                    isGirlBorn = true;
                }

                childrenPerCouple++;
            }

            if (childrenPerCouple == 2) {
                couplesWith2Children++;
            } else if (childrenPerCouple == 3) {
                couplesWith3Children++;
            } else {
                couplesWith4OrMoreChildren++;
            }

            allChildrenCount += childrenPerCouple;
        }

        double averageChildrenPerCouple = (double) allChildrenCount / numberOfExperiments;
        System.out.println("Average: " + averageChildrenPerCouple + " children to get at least one of each gender.");

        System.out.println("Number of families with 2 children: " + couplesWith2Children);
        System.out.println("Number of families with 3 children: " + couplesWith3Children);
        System.out.println("Number of families with 4 or more children: " + couplesWith4OrMoreChildren);

        String mostCommonNumberOfChildrenMessage = "The most common number of children is ";
        int mostCommonNumberOfChildren = Math.max(couplesWith2Children,
                Math.max(couplesWith3Children, couplesWith4OrMoreChildren));

        if (mostCommonNumberOfChildren == couplesWith2Children) {
            mostCommonNumberOfChildrenMessage += "2.";
        } else if (mostCommonNumberOfChildren == couplesWith3Children) {
            mostCommonNumberOfChildrenMessage += "3.";
        } else {
            mostCommonNumberOfChildrenMessage += "4 or more.";
        }

        System.out.println(mostCommonNumberOfChildrenMessage);
    }
}
