//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of cakes: ");
        int numberOfCakes = scanner.nextInt();

        Cake[] cakeList = new Cake[numberOfCakes];
        int index = 0;

        for (int i = 0; i < numberOfCakes; i++) {
            System.out.println("\nCake " + (i + 1) + ":");
            System.out.print("Enter 1 for Custom Cake or 2 for Special Cake: ");
            int type = scanner.nextInt();

            if (type != 1 && type != 2) {
                System.out.println("You have to enter either 1 or 2.");
                i--;
                continue;
            }

            scanner.nextLine();

            System.out.println("Select a flavour:");
            System.out.println("1. Chocolate");
            System.out.println("2. Caramel");
            System.out.println("3. Vanilla");
            System.out.print("Enter your choice (1-3): ");
            int flavourChoice = scanner.nextInt();

            String flavour = "";
            switch (flavourChoice) {
                case 1:
                    flavour = "Chocolate";
                    break;
                case 2:
                    flavour = "Caramel";
                    break;
                case 3:
                    flavour = "Vanilla";
                    break;
                default:
                    System.out.println("Invalid flavour choice. Defaulting to Chocolate.");
                    flavour = "Chocolate";
            }

            if (type == 1) {
                System.out.print("Enter number of layers (1-4): ");
                int layers = scanner.nextInt();
                System.out.print("Enter size of cake (6, 8, 10, 12 inches): ");
                int size = scanner.nextInt();
                if (size != 6 && size != 8 && size != 10 && size != 12) {
                    System.out.println("Size is unavailable.");
                    i--;
                    continue;
                }
                cakeList[index++] = new CustomCake(flavour, layers, size);
            } else if (type == 2) {
                System.out.println("Select a special cake:");
                for (int j = 0; j < SpecialCake.specialCakesArray.length; j++) {
                    System.out.println(j + 1 + ". " + SpecialCake.specialCakesArray[j][0] + " - $" + SpecialCake.specialCakesArray[j][1]);
                }
                System.out.print("Enter your choice (1-4): ");
                int choice = scanner.nextInt();
                cakeList[index++] = new SpecialCake(flavour, choice - 1);
            }
        }

        System.out.println("\nOrder Summary:");
        double totalCost = 0;
        for (Cake cake : cakeList) {
            if (cake != null) {
                double cakeCost = cake.calcCakeCost();
                System.out.println(cake + ", Cost: $" + cakeCost);
                totalCost += cakeCost;
            }
        }

        System.out.println("Total Cost before discount: $" + totalCost);
        totalCost = applyDiscount(totalCost);

        System.out.println("Total Cost after discount : $" + totalCost);

        scanner.close();
    }

    public static double applyDiscount(double totalCost) {
        if (totalCost > 100) {
            double discount = totalCost * 0.20;
            System.out.println("You qualify for a 20% discount of $" + discount + "!");
            return totalCost - discount;
        } else if (totalCost > 50) {
            double discount = totalCost * 0.10;
            System.out.println("You qualify for a 10% discount of $" + discount + "!");
            return totalCost - discount;
        }
        return totalCost;
    }
}

