

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class fenetre4 extends JFrame{
    fenetre4(){
        super("Fenetre 4");
        init();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        JPanel pan1 = new JPanel(new BorderLayout());
        JLabel texte1 = new JLabel("Mon Saint-Michel");
        pan1.add(texte1,BorderLayout.NORTH);
        add(pan1);
        JPanel pan2 = new JPanel(new BorderLayout());
        JLabel image = new JLabel(new ImageIcon("ane.png"));
        pan2.add(image,BorderLayout.SOUTH);
        add(pan2);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre4::new);
    }
}
