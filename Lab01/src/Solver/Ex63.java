package Solver;

import java.util.Scanner;

public class Ex63 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n = ");
        try {
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e){
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < n; i++) {
            int spaces = n-i-1;
            int stars = 2*i+1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
