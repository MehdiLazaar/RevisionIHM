import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class fenetre6B extends JFrame {
    fenetre6B(){
        super("Fenetre 6B");
        init();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan, BoxLayout.X_AXIS));
        JButton bouton1 = new JButton("bouton 1");
        JButton bouton2 = new JButton("bouton 2");
        JButton bouton3 = new JButton("bouton 3");
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton1);
        pan.add(bouton2);
        pan.add(Box.createRigidArea(new Dimension(5,5)));
        pan.add(bouton3);
        pan.add(Box.createHorizontalGlue());
        add(pan);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre6B::new);
    }
}
