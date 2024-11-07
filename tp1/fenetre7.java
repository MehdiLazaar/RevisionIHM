import java.awt.*;

import javax.swing.*;
public class fenetre7 extends JFrame {
    fenetre7(){
        super("Fenetre 7");
       // init();
        init2();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan, BoxLayout.X_AXIS));
        JButton bouton1 = new JButton("bouton 1");
        JButton bouton2 = new JButton("bouton 2");
        JButton bouton3 = new JButton("bouton 3");
        JButton bouton4 = new JButton("bouton 4");
        pan.add(bouton1);
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton2);
        pan.add(Box.createRigidArea(new Dimension(5,5)));
        pan.add(bouton3);
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton4);
        pan.add(Box.createRigidArea(new Dimension(10,10)));
        add(pan);
    }
    void init2(){
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan, BoxLayout.X_AXIS));
        JButton bouton1 = new JButton("bouton 1");
        JButton bouton2 = new JButton("bouton 2");
        JButton bouton3 = new JButton("bouton 3");
        JButton bouton4 = new JButton("bouton 4");
        pan.add(bouton1);
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton2);
        pan.add(bouton3);
        pan.add(Box.createHorizontalGlue());
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton4);
        add(pan);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre7::new);
    }
}
