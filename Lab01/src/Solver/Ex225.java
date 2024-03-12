package Solver;

import java.util.Scanner;

public class Ex225 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double ans, n1, n2 = 0;
        try {
            n1 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter 2nd number: ");
        try {
            n2 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter operation (+ - * /): ");
        String op = sc.nextLine();
        switch (op) {
            case "+" -> ans = n1 + n2;
            case "-" -> ans = n1 - n2;
            case "*" -> ans = n1 * n2;
            case "/" -> {
                try {
                    if (n2 == 0) {
                        throw new ArithmeticException();
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Divided by zero error.");
                    return;
                }
                ans = n1 / n2;
            }
            default -> {
                System.out.println("Operater cannot be interpreted.");
                return;
            }
        }
        System.out.printf("%.2f %S %.2f = %.2f", n1, op, n2, ans);
    }
}

