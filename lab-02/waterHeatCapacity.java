import java.util.Scanner;
public class waterHeatCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mass of water in grams: ");
        double mass = scanner.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = scanner.nextDouble();
        double tempChange = (finalTemp - 32) * 5 / 9 - (initialTemp - 32) * 5 / 9;
        double heatEnergy = mass * 4184 * tempChange;
        System.out.println("The heat energy required is: " + heatEnergy );
        scanner.close();
    }
}
