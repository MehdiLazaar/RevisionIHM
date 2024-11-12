package org.example;

import javax.swing.SwingUtilities;

import fenetre.fenetre;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre::new);
    }
}