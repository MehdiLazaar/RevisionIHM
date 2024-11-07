import java.awt.event.*;

import javax.swing.*;
public class bouton3Classes extends JFrame{
    JPanel panel;
    JButton btn, btn2, btn3;
    bouton3Classes(){
        super("Bouton simple");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        panel = new JPanel();
        btn = new JButton("Quitter Avec Lambda Expression");
        btn2 = new JButton("Quitter Avec Classe Interne Mauvaise Approche");
        btn3 = new JButton("Quitter Avec Classe anonyme Mauvaise Approche");
        // Lambda Expression
        btn.addActionListener((e) -> System.exit(0));
        // Classe Interne
        btn2.addActionListener(new ActionQuitter());
        //Classe anonyme
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
        add(panel);
    }
    // Ce qu il faut pas faire
    class ActionQuitter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new bouton3Classes());
    }
}
