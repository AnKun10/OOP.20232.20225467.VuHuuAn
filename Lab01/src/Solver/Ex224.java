package Solver;

import javax.swing.*;

public class Ex224 {
    public void solve() {
        String strN1, strN2;
        String strNoti = "You've just entered: ";
        strN1 = JOptionPane.showInputDialog(null,"Enter 1st number: ", "Enter 1st number", JOptionPane.INFORMATION_MESSAGE);
        strNoti += strN1 + " and ";
        strN2 = JOptionPane.showInputDialog(null,"Enter 2nd number: ", "Enter 2nd number", JOptionPane.INFORMATION_MESSAGE);
        strNoti += strN2;
        JOptionPane.showMessageDialog(null, strNoti, "Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
