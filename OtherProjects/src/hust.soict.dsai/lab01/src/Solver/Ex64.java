package hust.soict.dsai.lab01.src.Solver;

import java.util.Arrays;
import java.util.Scanner;

public class Ex64 {
    private static int calDays(int month, boolean isLeapYear) {
        return switch (month) {
            default -> 30;
            case -1 -> -1;
            case 0, 2, 4, 6, 7, 9, 11 -> 31;
            case 1 -> {
                if (isLeapYear) {
                    yield 29;
                }
                yield 28;
            }
        };
    }

    private static int convertMonth(String strMonth) {
        int intMonth = -1;
        // Jan = 0, Feb = 1, ..., Dec = 11
        String[][] arrMonth = {{"January", "Jan.", "Jan", "1"},
                {"February", "Feb.", "Feb", "2"},
                {"March", "Mar.", "Mar", "3"},
                {"April", "Apr.", "Apr", "4"},
                {"May", "5"}, {"June", "Jun", "6"},
                {"July", "Jul", "7"},
                {"August", "Aug.", "Aug", "8"},
                {"September", "Sept.", "Sep", "9"},
                {"October", "Oct.", "Oct.", "10"},
                {"November", "Nov.", "Nov", "11"},
                {"December", "Dec.", "Dec", "12"}};
        for (int i = 0; i < arrMonth.length; i++) {
            if (Arrays.asList(arrMonth[i]).contains(strMonth)) {
                intMonth = i;
                break;
            }
        }
        return intMonth;
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int year = -1;
            System.out.print("Enter year = ");
            try {
                year = Integer.parseInt(sc.nextLine());
                if (year < 0) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Invalid input");
                continue;
            }
            System.out.print("Enter month (Ex: January, Jan., Jan, 1) = ");
            int intMonth = convertMonth(sc.nextLine());
            int intDays = calDays(intMonth, isLeapYear(year));
            if (intDays == -1) {
                System.out.println("Invalid input");
                continue;
            }
            System.out.printf("Number of days in %d/%d is %d\n", intMonth, year, intDays);
            return;
        }
    }
}
