package Menu;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class fenetre1 extends JFrame {
    fenetre1(){
        super("fenetre 1 Menu");
        init();
        init2();
        pack();
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
    void init2(){
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        JPanel panelGauche = new JPanel();
        panelGauche.setLayout(new BoxLayout(panelGauche, BoxLayout.Y_AXIS));
        JLabel texte1 = new JLabel("Bonjour");
        JTextArea textArea = new JTextArea(1, 3);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPaneTexteArea = new JScrollPane(textArea);
        panelGauche.add(texte1);
        panelGauche.add(textArea);
        panelGauche.add(scrollPaneTexteArea);

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
        

        JPanel panelMilieu = new JPanel(new FlowLayout());
        JSplitPane splitPaneMilieu = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelGauche, panelDroite);
        panelMilieu.add(splitPaneMilieu);

        panelPrincipal.add(panelGauche, BorderLayout.WEST);
        
        panelPrincipal.add(panelDroite, BorderLayout.EAST);
        panelPrincipal.add(splitPaneMilieu, BorderLayout.CENTER);

        add(panelPrincipal);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre1::new);
    }
}
