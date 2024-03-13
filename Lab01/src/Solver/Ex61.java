package Solver;

import javax.swing.*;

public class Ex61 {
    public static void solve() {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the 1st class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
