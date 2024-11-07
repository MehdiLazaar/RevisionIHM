import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;


public class fenetre2 extends JFrame{
    fenetre2(){
        super("maFenêtre 2");
        init();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        JLabel text1 = new JLabel("ceci est ma deuxieme fenetre");
        add(text1);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre2::new);
    }
}
