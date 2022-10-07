import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int numPeople = scan.nextInt();

        System.out.println("What's the tip percentage? (0 - 100)");
        int tipPercentage = scan.nextInt();

        TipCalculator bill = new TipCalculator(numPeople, tipPercentage);

        System.out.println("What is the total price before tip? ");
        int addMeal = scan.nextInt();





    }
}
