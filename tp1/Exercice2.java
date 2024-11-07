import javax.swing.*;
import java.awt.*;

public class Exercice2 extends JFrame {

    public Exercice2() {
        super("Exercice 2");
        init();
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void init() {
        // Crée le panel principal avec BoxLayout pour disposer les zones verticalement
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        // 1ère zone : 2 boutons (Bouton 1 à gauche, Bouton 2 à droite)
        JPanel panelHaut = new JPanel(new BorderLayout());
        JButton b1 = new JButton("Bouton 1");
        JButton b2 = new JButton("Bouton 2");
        panelHaut.add(b1, BorderLayout.WEST);  // Bouton 1 calé à gauche
        panelHaut.add(b2, BorderLayout.EAST);  // Bouton 2 calé à droite
        panelPrincipal.add(panelHaut);

        // 2ème zone : 2 boutons (Bouton 3 et Bouton 4, l'un sous l'autre et centrés)
        JPanel panelMilieu1 = new JPanel();
        panelMilieu1.setLayout(new BoxLayout(panelMilieu1, BoxLayout.Y_AXIS));
        JButton b3 = new JButton("Bouton 3");
        JButton b4 = new JButton("Bouton 4");
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);  // Centre horizontalement
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);  // Centre horizontalement
        panelMilieu1.add(b3);
        panelMilieu1.add(Box.createRigidArea(new Dimension(0, 10)));  // Espacement entre les boutons
        panelMilieu1.add(b4);
        panelPrincipal.add(panelMilieu1);

        // 3ème zone : Un texte statique à droite
        JPanel panelMilieu2 = new JPanel(new BorderLayout());
        JLabel labelTexte = new JLabel("Texte");
        labelTexte.setHorizontalAlignment(SwingConstants.RIGHT);  // Aligne le texte à droite
        panelMilieu2.add(labelTexte, BorderLayout.EAST);
        panelPrincipal.add(panelMilieu2);
        

        // 4ème zone : 3 boutons (Bouton 5 à gauche, Bouton 6 centré, Bouton 7 à droite)
        JPanel panelBas = new JPanel(new BorderLayout());
        JButton b5 = new JButton("Bouton 5");
        JButton b6 = new JButton("Bouton 6");
        JButton b7 = new JButton("Bouton 7");
        panelBas.add(b5, BorderLayout.WEST);   // Bouton 5 calé à gauche
        panelBas.add(b6, BorderLayout.CENTER); // Bouton 6 centré
        panelBas.add(b7, BorderLayout.EAST);   // Bouton 7 calé à droite
        panelPrincipal.add(panelBas);

        // Ajoute le panel principal à la fenêtre
        add(panelPrincipal, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercice2::new);
    }
}
