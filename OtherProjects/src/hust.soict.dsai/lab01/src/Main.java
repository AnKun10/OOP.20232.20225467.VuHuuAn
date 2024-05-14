package hust.soict.dsai.lab01.src;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//private

import hust.soict.dsai.lab01.src.Solver.*;

import java.util.Scanner;

public class Main {
    private static boolean isExit(Scanner sc) {
        while (true) {
            System.out.print("Test another problem? (y/n)");
            String res = sc.nextLine();
            switch (res) {
                default: System.out.println("Invalid input."); continue;
                case "y": return false;
                case "n": return true;
            }
        }
    }

    private static void showProblems() {
        System.out.println("PROBLEM LIST");
        System.out.println("1, Exercise 2.2.1");
        System.out.println("2, Exercise 2.2.2");
        System.out.println("3, Exercise 2.2.3");
        System.out.println("4, Exercise 2.2.4");
        System.out.println("5, Exercise 2.2.5");
        System.out.println("6, Exercise 2.2.6");
        System.out.println("7, Exercise 6.1");
        System.out.println("8, Exercise 6.2");
        System.out.println("9, Exercise 6.3");
        System.out.println("10, Exercise 6.4");
        System.out.println("11, Exercise 6.5");
        System.out.println("12, Exercise 6.6");
        System.out.print("Choose a problem: ");
    }

    private static int intProblem(Scanner sc) {
        int choice = -1;
        try {
            choice = Integer.parseInt(sc.nextLine());
            if (choice > 12 || choice < 1) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid input.");
            return -1;
        }
        return choice;
    }

    private static void solveProblem(int problem) {
        switch (problem) {
            default -> System.out.println("Invalid input.");
            case 1 -> Ex221.solve();
            case 2 -> Ex222.solve();
            case 3 -> Ex223.solve();
            case 4 -> Ex224.solve();
            case 5 -> Ex225.solve();
            case 6 -> Ex226.solve();
            case 7 -> Ex61.solve();
            case 8 -> Ex62.solve();
            case 9 -> Ex63.solve();
            case 10 -> Ex64.solve();
            case 11 -> Ex65.solve();
            case 12 -> Ex66.solve();
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            showProblems();
            solveProblem(intProblem(sc));
            if (isExit(sc)) {
                break;
            }
        }
    }
}