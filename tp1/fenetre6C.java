import javax.swing.*;
public class fenetre6C extends JFrame{
    fenetre6C(){
        super ("fenetre 6C");
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
        pan.add(bouton1);
        pan.add(bouton2);
        pan.add(Box.createHorizontalGlue());
        pan.add(bouton3);
        add(pan);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre6C::new);
    }
}
