package Menu;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Fenetre1 extends JFrame {
    Fenetre1(){
        super("Fenetre 1 Menu");
        initMenu();
        initUI();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void initMenu(){
        JMenuBar menuBar = new JMenuBar();

        // Création des menus
        JMenu fichier = new JMenu("Fichier");
        JMenu editer = new JMenu("Editer");
        JMenu aide = new JMenu("Aide");

        // Création des éléments de menu
        JMenuItem nouveau = new JMenuItem("Nouveau");
        JMenuItem ouvrir = new JMenuItem("Ouvrir");
        JMenuItem enregistrer = new JMenuItem("Enregistrer");
        JMenuItem enregistrerSous = new JMenuItem("Enregistrer sous");
        JMenuItem quitter = new JMenuItem("Quitter");

        // Définition des raccourcis clavier et mnémoniques
        nouveau.setMnemonic('N');
        nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(nouveau);

        ouvrir.setMnemonic('O');
        ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(ouvrir);

        enregistrer.setMnemonic('E');
        enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        fichier.add(enregistrer);

        enregistrerSous.setMnemonic('S');
        enregistrerSous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.SHIFT_DOWN_MASK));
        fichier.add(enregistrerSous);

        quitter.setMnemonic('Q');
        quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
        quitter.addActionListener(e -> System.exit(0));
        fichier.add(quitter);

        // Ajout des menus à la barre de menu
        menuBar.add(fichier);
        menuBar.add(editer);
        menuBar.add(aide);
        
        // Affecter la barre de menu à la fenêtre
        setJMenuBar(menuBar);
    }

    void initUI(){
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Panel gauche avec zone de texte
        JPanel panelGauche = new JPanel();
        panelGauche.setLayout(new BoxLayout(panelGauche, BoxLayout.Y_AXIS));
        JLabel texte1 = new JLabel("Bonjour");
        JTextArea textArea = new JTextArea(3, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPaneTexteArea = new JScrollPane(textArea);
        panelGauche.add(texte1);
        panelGauche.add(scrollPaneTexteArea);  // Utiliser scrollPane pour textArea

        // Panel droite avec boutons radio
        JPanel panelDroite = new JPanel();
        panelDroite.setLayout(new BoxLayout(panelDroite, BoxLayout.Y_AXIS));
        JLabel texte2 = new JLabel("Choisissez une couleur");
        JRadioButton bleu = new JRadioButton("Bleu");
        JRadioButton rouge = new JRadioButton("Rouge");
        JRadioButton noir = new JRadioButton("Noir");

        panelDroite.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2), "Couleur"));
        ButtonGroup group = new ButtonGroup();
        group.add(bleu);
        group.add(rouge);
        group.add(noir);

        panelDroite.add(texte2);
        panelDroite.add(bleu);
        panelDroite.add(rouge);
        panelDroite.add(noir);

        // SplitPane pour diviser gauche/droite
        JSplitPane splitPaneMilieu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelGauche, panelDroite);
        splitPaneMilieu.setDividerLocation(250); // Ajustez la position initiale du séparateur

        // Ajouter le splitPane au centre de panelPrincipal
        panelPrincipal.add(splitPaneMilieu, BorderLayout.CENTER);

        // Ajouter panelPrincipal à la fenêtre
        add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Fenetre1::new);
    }
}
