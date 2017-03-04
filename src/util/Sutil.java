package util;


import java.awt.Component;
import javax.swing.JOptionPane;

public class Sutil {

    public static void msg(Component parent, String message) {
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                1);
    }
    
    public static void msgE(Component parent, String message) {
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                2);
    }
    
    public static int msgQ(Component parent, String message) {
        int respon = JOptionPane.showOptionDialog(parent,
                message,
                "App Info",
                JOptionPane.YES_NO_OPTION, 3, null, null, null);
        return respon;
    }
}
