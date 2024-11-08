package Menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCouleur implements ActionListener {
    private final Color couleur;
    private final Fenetre1 fenetre;

    public ActionCouleur(Fenetre1 fenetre, Color couleur) {
        this.fenetre = fenetre;
        this.couleur = couleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Utilisation du getter pour accéder à `textArea`
        fenetre.getTextArea().setForeground(couleur);
    }
}
