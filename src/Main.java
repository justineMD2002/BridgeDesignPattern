import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ctr = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ctr++;
            int option, method;
            try {
                System.out.println("What is the beast's favorite drink?(Available coffee: (1)Latte, (2)Cappuccino, (3)Macchiato) ");
                option = scanner.nextInt();
                System.out.println("How would the beast like his/her coffee to be prepared?(Available methods: (1)Drip Brew, (2)Espresso Machine, (3)French Press) ");
                method = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("An error occurred, please try agan.");
                return;
            }
            BridgeGuardCoffeeLover b;

            if (option == 1) {
                if (method == 1) {
                    b = new BridgeGuardLatteEnjoyer(new DripBrewing());
                    b.ikuzo();
                } else if (method == 2) {
                    b = new BridgeGuardLatteEnjoyer(new EspressoMachine());
                    b.ikuzo();
                } else if (method == 3) {
                    b = new BridgeGuardLatteEnjoyer(new FrenchPress());
                    b.ikuzo();
                }
            } else if (option == 2) {
                if (method == 1) {
                    b = new BridgeGuardCappuccinoEnjoyer(new DripBrewing());
                    b.ikuzo();
                } else if (method == 2) {
                    b = new BridgeGuardCappuccinoEnjoyer(new EspressoMachine());
                    b.ikuzo();
                } else if (method == 3) {
                    b = new BridgeGuardCappuccinoEnjoyer(new FrenchPress());
                    b.ikuzo();
                }
            } else if (option == 3) {
                if (method == 1) {
                    b = new BridgeGuardMacchiatoEnjoyer(new DripBrewing());
                    b.ikuzo();
                } else if (method == 2) {
                    b = new BridgeGuardMacchiatoEnjoyer(new EspressoMachine());
                    b.ikuzo();
                } else if (method == 3) {
                    b = new BridgeGuardMacchiatoEnjoyer(new FrenchPress());
                    b.ikuzo();
                }
            } else System.out.println("Item unavailable!");

            if(ctr == 3) {
                System.out.println("Does the beast want more coffee? (1/0)");
                int input = scanner.nextInt();
                if(input == 0) {
                    System.out.println("Enjoy your coffee!");
                    break;
                }
                ctr = 0;
            }
        }
    }
}