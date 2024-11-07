import java.awt.FlowLayout;

import javax.swing.*;
public class fenetre3 extends JFrame {

    fenetre3(){
        super("Fenetre 3 Tp1");
        init();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        JPanel pan = new JPanel();
        JLabel text1 = new JLabel("texte dans un JPanel");
        pan.add(text1);
        add(pan);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre3::new);
    }
}
