package Menu;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Fenetre1 extends JFrame {
    public JPanel panelPrincipal = new JPanel(new BorderLayout());
    public JPanel panelGauche = new JPanel();
    public JPanel panelDroite = new JPanel();
    public JLabel texte1 = new JLabel("Bonjour");
    private JTextArea textArea = new JTextArea(3, 20);  // Passée en `private`
    JLabel texte2 = new JLabel("Choisissez une couleur");
    JRadioButton bleu = new JRadioButton("Bleu");
    JRadioButton rouge = new JRadioButton("Rouge");
    JRadioButton noir = new JRadioButton("Noir");

    JMenu fonts = new JMenu("Fonts");
    
    public Fenetre1(){
        super("Fenetre 1 Menu");
        initMenu();
        initUI();
        initFont();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void initMenu(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fichier = new JMenu("Fichier");
        JMenu editer = new JMenu("Editer");
        JMenu aide = new JMenu("Aide");
        

        JMenuItem nouveau = new JMenuItem("Nouveau");
        JMenuItem ouvrir = new JMenuItem("Ouvrir");
        JMenuItem enregistrer = new JMenuItem("Enregistrer");
        JMenuItem enregistrerSous = new JMenuItem("Enregistrer sous");
        JMenuItem quitter = new JMenuItem("Quitter");

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

        fonts.setMnemonic('F');
        fonts.addActionListener((e) -> initFont());
        editer.add(fonts);

        menuBar.add(fichier);
        menuBar.add(editer);
        menuBar.add(aide);
        
        setJMenuBar(menuBar);
    }

    void initUI(){
        panelGauche.setLayout(new BoxLayout(panelGauche, BoxLayout.Y_AXIS));
        
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPaneTexteArea = new JScrollPane(textArea);
        panelGauche.add(texte1);
        panelGauche.add(scrollPaneTexteArea);

        panelDroite.setLayout(new BoxLayout(panelDroite, BoxLayout.Y_AXIS));
        panelDroite.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2), "Couleur"));

        // Créer les actions pour chaque couleur
        bleu.addActionListener(new ActionCouleur(this, Color.BLUE));
        rouge.addActionListener(new ActionCouleur(this, Color.RED));
        noir.addActionListener(new ActionCouleur(this, Color.BLACK));

        ButtonGroup group = new ButtonGroup();
        group.add(bleu);
        group.add(rouge);
        group.add(noir);

        panelDroite.add(texte2);
        panelDroite.add(bleu);
        panelDroite.add(rouge);
        panelDroite.add(noir);

        JSplitPane splitPaneMilieu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelGauche, panelDroite);
        splitPaneMilieu.setDividerLocation(250);

        panelPrincipal.add(splitPaneMilieu, BorderLayout.CENTER);

        add(panelPrincipal);
    }

    // Getter pour `textArea`
    public JTextArea getTextArea() {
        return textArea;
    }

    void initFont() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontP = ge.getAvailableFontFamilyNames();
        for (String fontName : fontP) {
            JMenuItem fontItem = new JMenuItem(fontName);
            fontItem.addActionListener(e -> textArea.setFont(new Font(fontName, Font.PLAIN, 12)));
            fonts.add(fontItem);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Fenetre1::new);
    }
}
