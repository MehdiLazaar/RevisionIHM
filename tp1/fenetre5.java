import java.awt.FlowLayout;

import javax.swing.*;

public class fenetre5 extends JFrame{
    fenetre5(){
        super("Fenetre 5 Tp1");
        init();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        JPanel pan = new JPanel(new FlowLayout());
        ButtonGroup boutons = new ButtonGroup();
        for(int i = 0; i < 5; i++){
            JButton btn = new JButton("bouton " + (i+1));
            boutons.add(btn);
            pan.add(btn);
        }
        add(pan);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre5::new);
    }
}
