package actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fenetre.fenetre;

public class ActionCouleur implements ActionListener {
    private final Color couleur;
    private final fenetre fe;

    public ActionCouleur(fenetre fe, Color couleur) {
        this.fe = fe;
        this.couleur = couleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Utilisation du getter pour accéder à `textArea`
        fe.getTextArea().setForeground(couleur);
    }
}
