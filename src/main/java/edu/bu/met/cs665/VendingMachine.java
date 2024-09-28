package edu.bu.met.cs665;

import edu.bu.met.cs665.Beverage.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {


    private Beverage selectedBeverage;

    public void start() {
        System.out.println("Welcome to the Beverage Vending Machine!");
        selectBeverage();
        addCondiments();
        selectedBeverage.brewing();
        System.out.println("Final price: $" + selectedBeverage.getPrice());
    }

    // choose beverage
    public void selectBeverage() {
        Scanner input = new Scanner(System.in);
        boolean validSelection = false;

        while (!validSelection) {
            try {
                System.out.println("Please select a beverage:");
                System.out.println("1. Espresso(2.5$)");
                System.out.println("2. Americano(3.0$)");
                System.out.println("3. Latte Macchiato(6$)");
                System.out.println("4. Black Tea(2.0$)");
                System.out.println("5. Green Tea(3.0$)");
                System.out.println("6. Yellow Tea(2.0$)");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        selectedBeverage = new Espresso();
                        validSelection = true;
                        break;
                    case 2:
                        selectedBeverage = new Americano();
                        validSelection = true;
                        break;
                    case 3:
                        selectedBeverage = new LatteMacchiato();
                        validSelection = true;
                        break;
                    case 4:
                        selectedBeverage = new BlackTea();
                        validSelection = true;
                        break;
                    case 5:
                        selectedBeverage = new GreenTea();
                        validSelection = true;
                        break;
                    case 6:
                        selectedBeverage = new YellowTea();
                        validSelection = true;
                        break;
                    default:
                        System.out.println("Invalid choice, please select again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number from 1 to 6.");
                input.next(); // Clear incorrect input
            }
        }

        System.out.println("You selected: " + selectedBeverage.getName());
    }


    // Let the user choose whether to add milk and sugar
    public void addCondiments() {
        // add milk
        selectedBeverage.milk = selectedBeverage.addMilk();

        // add sugar
        selectedBeverage.sugar = selectedBeverage.addSugar();
    }
    public Beverage getSelectedBeverage() {
        return selectedBeverage;
    }

    public void setSelectedBeverage(Beverage selectedBeverage) {
        this.selectedBeverage = selectedBeverage;
    }

}
