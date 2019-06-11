
import java.util.Scanner;

/**
 * The best class ever
 */
public class TheBestClassMate {
    /**
     *The best method ever as well
     * @param args
     */
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        System.out.println("Hour: ");
        int c = console.nextInt();

        System.out.println("Money: ");
        double m = console.nextDouble();

        System.out.println("Am I sick: (true or false)");
        boolean h = console.nextBoolean();

        if (h) {
            System.out.println("I will stay at home.");

            if (m > 0) {
                System.out.println("I will ask my friend to bring me some drugs.");
            }
            if (m == 0) {
                System.out.println("I'm out of money, so no drugs.");
            }
        } else {
            if (m >= 10) {
                System.out.println("Today I will go on a restaurant.");
            }
            if (m < 10) {
                System.out.println("If I'm out of money, I will go to work!");
            }
        }


    }
}