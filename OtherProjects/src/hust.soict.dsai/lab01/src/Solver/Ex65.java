package hust.soict.dsai.lab01.src.Solver;

import java.util.Arrays;
import java.util.Scanner;

public class Ex65 {
    public static double calSum(double[] arr){
        double sum = 0;
        for (double numb : arr) {
            sum += numb;
        }
        return sum;
    }
    public static double calAvr(double[] arr){
        return calSum(arr)/ arr.length;
    }
    private static double[] inpArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array (each elements seperated by a space): ");
        String[] strArr = sc.nextLine().split(" ");
        double[] arr = new double[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(strArr[i]);
        }
        return arr;
    }
    public static void solve() {
        double[] arr = inpArr();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
