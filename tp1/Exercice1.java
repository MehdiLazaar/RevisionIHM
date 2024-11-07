import java.awt.*;
import javax.swing.*;

public class Exercice1 extends JDialog {

    public Exercice1(JFrame fenetre) {
        super(fenetre,"Exercice 1", true);
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    void init() {
        // Panneau principal avec un BorderLayout pour répartir les zones
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Création de la zone supérieure avec les 3 boutons centrés
        JPanel panelHaut = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton b1 = new JButton("Bouton 1");
        JButton b2 = new JButton("Bouton 2");
        JButton b3 = new JButton("Bouton 3");
        panelHaut.add(b1);
        panelHaut.add(b2);
        panelHaut.add(b3);

        // Création de la zone inférieure avec 2 boutons alignés verticalement
        JPanel panelBas = new JPanel();
        panelBas.setLayout(new BoxLayout(panelBas, BoxLayout.Y_AXIS)); // Alignement vertical
        JButton b4 = new JButton("Bouton 4");
        JButton b5 = new JButton("Bouton 5");

        // Centrer les boutons horizontalement
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Espacement entre les boutons
        panelBas.add(b4);
        panelBas.add(b5);

        // Ajout des panneaux à la fenêtre principale
        panelPrincipal.add(panelHaut, BorderLayout.NORTH);  // Place les 3 boutons en haut
        panelPrincipal.add(panelBas, BorderLayout.SOUTH);   // Place les 2 boutons en bas

        // Ajout du panneau principal à la fenêtre
        add(panelPrincipal, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fenetre = new JFrame();
            new Exercice1(fenetre);
        });
    }
}
