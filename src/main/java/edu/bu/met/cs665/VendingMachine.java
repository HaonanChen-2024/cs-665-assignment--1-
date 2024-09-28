package edu.bu.met.cs665;

import edu.bu.met.cs665.Beverage.*;

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

    // 让用户选择饮料
    public void selectBeverage() {
        Scanner input = new Scanner(System.in);
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
                break;
            case 2:
                selectedBeverage = new Americano();
                break;
            case 3:
                selectedBeverage = new LatteMacchiato();
                break;
            case 4:
                selectedBeverage = new BlackTea();
                break;
            case 5:
                selectedBeverage = new GreenTea();
                break;
            case 6:
                selectedBeverage = new YellowTea();
                break;
            default:
                System.out.println("Invalid choice, please select again.");
                selectBeverage();
                break;
        }
        System.out.println("You selected: " + selectedBeverage.getName());
    }

    // 让用户选择是否添加牛奶和糖
    public void addCondiments() {
        // 加牛奶
        selectedBeverage.milk = selectedBeverage.addMilk();

        // 加糖
        selectedBeverage.sugar = selectedBeverage.addSugar();
    }
    public Beverage getSelectedBeverage() {
        return selectedBeverage;
    }

    public void setSelectedBeverage(Beverage selectedBeverage) {
        this.selectedBeverage = selectedBeverage;
    }

}
