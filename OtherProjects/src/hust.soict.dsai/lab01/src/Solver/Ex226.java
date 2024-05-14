package hust.soict.dsai.lab01.src.Solver;

import java.util.Scanner;

public class Ex226 {
    private static void linearEquation(Scanner sc) {
        double a, b = 0;
        System.out.print("Enter a = ");
        try {
            a = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter b = ");
        try {
            b = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.printf("The linear function %.2fx+%.2f = 0 has ", a, b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            System.out.println("Solution x = " + -b/a);
        }
    }
    private static void linearSystem(Scanner sc) {
        //Input cooeficients
        double a11, a12, a21, a22, b1, b2 = 0;
        System.out.print("Enter a11 = ");
        try {
            a11 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter a12 = ");
        try {
            a12 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter a21 = ");
        try {
            a21 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter a22 = ");
        try {
            a22 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter b1 = ");
        try {
            b1 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter b2 = ");
        try {
            b2 = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        //Solve
        System.out.println("The linear system:");
        System.out.printf("%.2fx+%.2fy = %.2f\n", a11, a12, b1);
        System.out.printf("%.2fx+%.2fy = %.2f\n", a21, a22, b2);
        System.out.print("has ");
        double D = a11*a22 - a21*a12;
        double Dx = b1*a22 - b2*a12;
        double Dy = a11*b2 - a21*b1;
        if (D==0) {
            if (Dx == 0 && Dy == 0){
                System.out.println("Infinite solution");
            } else {
                System.out.println("No solution");
            }
        } else {
            System.out.printf("Solution (x,y) = (%.2f,%.2f)\n", Dx/D, Dy/D);
        }
    }
    private static void quadraticEquation(Scanner sc) {
        //Input cooefficients
        double a, b, c = 0;
        System.out.print("Enter a = ");
        try {
            a = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter b = ");
        try {
            b = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        System.out.print("Enter c = ");
        try {
            c = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid number input.");
            return;
        }
        //Solve
        System.out.printf("The quadratic function %.2fx^2 + %.2fx + %.2f = 0 has ", a, b, c);
        double delta = b*b-4*a*c;
        if (delta > 0) {
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("2 solution x1 = "+x1+" and x2 = "+x2);
        } else if (delta == 0) {
            double x = -b/(2*a);
            System.out.println("A solution x = "+x);
        } else {
            System.out.println("No real solution");
        }
    }
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SOLVING TOOL");
        System.out.println("1, Linear Equation.");
        System.out.println("2, Linear System.");
        System.out.println("3, Quadratic Equation.");
        System.out.print("Choose an option: ");
        String inp = sc.nextLine();
        switch (inp){
            case ("1") -> linearEquation(sc);
            case ("2") -> linearSystem(sc);
            case ("3") -> quadraticEquation(sc);
            default -> System.out.println("Invalid input.");
        }
    }
}
