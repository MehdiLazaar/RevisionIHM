import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
public class bouton3CLassePartie2 extends JFrame {
    bouton3CLassePartie2(){
        super("Partie 2 : Boutons 3 classes");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Que voulez-vous faire ?");
        panel.add(label, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton validerButton = new JButton("Valider");
        buttonPanel.add(validerButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton annulerButton = new JButton("Annuler");
        buttonPanel.add(annulerButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton quitterButton = new JButton("Quitter");
        quitterButton.addActionListener((e) -> System.exit(0));
        buttonPanel.add(quitterButton);

        panel.add(buttonPanel, BorderLayout.CENTER);
        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(bouton3CLassePartie2::new);
    }
    
}