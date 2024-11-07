package Menu;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class fenetre1 extends JFrame {
    fenetre1(){
        super("fenetre 1 Menu");
        init();
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    void init(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fichier = new JMenu("Fichier");
        JMenu editer = new JMenu("editer");
        JMenu aide = new JMenu("aide");

        JMenuItem nouveau = new JMenuItem("nouveau");
        JMenuItem ouvrir = new JMenuItem("ouvrir");
        JMenuItem enregistrer = new JMenuItem("enregistrer");
        JMenuItem enregistrer_sous = new JMenuItem("enregistrer sous");
        JMenuItem quitter = new JMenuItem("quitter");

        nouveau.setMnemonic('N');
        nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(nouveau);
        ouvrir.setMnemonic('O');
        ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(ouvrir);
        enregistrer.setMnemonic('E');
        enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(enregistrer);
        enregistrer_sous.setMnemonic('S');
        enregistrer_sous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.SHIFT_DOWN_MASK));
        fichier.add(enregistrer_sous);
        quitter.setMnemonic('Q');
        quitter.addActionListener((e) -> System.exit(0));
        quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(quitter);

        menuBar.add(fichier);
        menuBar.add(editer);
        menuBar.add(aide);
        setJMenuBar(menuBar);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre1::new);
    }
}
