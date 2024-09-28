package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewBehavior;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Beverage {
    protected String name;
    protected BigDecimal price = BigDecimal.ZERO;
    public int milk;
    public int sugar;

    Scanner input = new Scanner(System.in);

    protected BrewBehavior brewBehavior;
    protected BrewBehavior brewBehavior2;
    protected BrewBehavior brewBehavior3;

    public void brewing() {
        System.out.println("Brewing " + this.name + "...");
        if (brewBehavior != null) {
            brewBehavior.brew();
        }
        if (brewBehavior2 != null) {
            brewBehavior2.brew();
        }
        if (brewBehavior3 != null) {
            brewBehavior3.brew();
        }
    }

    public int addMilk() {
        int milk = 0;
        input = new Scanner(System.in);
        BigDecimal milkPrice = new BigDecimal("0.3");

        System.out.println("Do you want to add extra milk(0.3$/add) to " + this.name + "? Yes(1)/No(0)");

        while (true) {
            try {
                int choice = input.nextInt();  // 捕获非整数输入的异常
                if (choice == 1) {
                    System.out.println("Enter milk amount(From 1 to 3): ");
                    while (true) {
                        try {
                            milk = input.nextInt();
                            if (milk > 3 || milk < 1) {
                                System.out.println("Invalid milk amount, please try again.");
                            } else {
                                System.out.println(milk + " unit of milk has been added");
                                this.price = this.price.add(milkPrice.multiply(BigDecimal.valueOf(milk)));
                                return milk;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input, please enter a number.");
                            input.next();  // 跳过错误的输入
                        }
                    }
                } else if (choice == 0) {
                    return 0;
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter 1 for Yes or 0 for No.");
                input.next();  // 跳过错误的输入
            }
        }
    }

    public int addSugar() {
        int sugar = 0;
        Scanner input = new Scanner(System.in);
        BigDecimal sugarPrice = new BigDecimal("0.2");

        System.out.println("Do you want to add extra sugar(0.2$/add) to " + this.name + "? Yes(1)/No(0)");
        while (true) {
            try {
                int choice = input.nextInt();  // 捕获非整数输入的异常
                if (choice == 1) {
                    System.out.println("Enter sugar amount (Between 1 to 3): ");
                    while (true) {
                        try {
                            sugar = input.nextInt();
                            if (sugar > 3 || sugar < 1) {
                                System.out.println("Invalid sugar amount, please try again.");
                            } else {
                                System.out.println(sugar + " unit of sugar has been added");
                                this.price = this.price.add(sugarPrice.multiply(BigDecimal.valueOf(sugar)));
                                return sugar;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input, please enter a number.");
                            input.next();  // 跳过错误的输入
                        }
                    }
                } else if (choice == 0) {
                    return 0;
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter 1 for Yes or 0 for No.");
                input.next();  // 跳过错误的输入
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



}
