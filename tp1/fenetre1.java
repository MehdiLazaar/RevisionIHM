import java.awt.*;
import javax.swing.*;
public class fenetre1 extends JFrame{
    public fenetre1(){
        super("Fenetre 1 Tp1");
        init();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600,300);
    }
    void init(){
        System.out.println("Mehdi");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre1::new);
    }
}