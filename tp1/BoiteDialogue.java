import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BoiteDialogue extends JDialog {
    JTextField texte;
    JRadioButton rouge = new JRadioButton("Rouge");
    JRadioButton bleu = new JRadioButton("Bleu");
    JRadioButton noir = new JRadioButton("Noir");
    tp3Ex1fenetre2p2 fenetre; // Référence à l'instance de la fenêtre principale
    JCheckBox caseCocher;

    BoiteDialogue(tp3Ex1fenetre2p2 fenetre) {
        super(fenetre, "Boite dialogue non modal TP3 EX 1", false);
        this.fenetre = fenetre; // Initialiser l'instance de la fenêtre
        init();
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(fenetre);
        setVisible(true);
    }

    void init() {
        JPanel panelPrincipale = new JPanel();
        panelPrincipale.setLayout(new BoxLayout(panelPrincipale, BoxLayout.Y_AXIS));
        JPanel panelHaut = new JPanel();
        texte = new JTextField(20);
        panelHaut.add(texte);

        JPanel panelMilieu = new JPanel();
        panelMilieu.setLayout(new BoxLayout(panelMilieu, BoxLayout.Y_AXIS));
        panelMilieu.setBorder(BorderFactory.createTitledBorder("Couleur"));
        ButtonGroup group = new ButtonGroup();
        group.add(rouge);
        group.add(bleu);
        group.add(noir);
        panelMilieu.add(rouge);
        panelMilieu.add(bleu);
        panelMilieu.add(noir);

        JPanel panelBas = new JPanel();
        panelBas.setLayout(new FlowLayout());
        caseCocher = new JCheckBox("Case cocher");
        caseCocher.addActionListener((e) -> {
            if (caseCocher.isSelected()) {
                fenetre.returnChampstxt().setBackground(Color.YELLOW);
            } else {
                fenetre.returnChampstxt().setBackground(null);
            }
            fenetre.returnChampstxt().repaint();
        });

        ActionListener updateListener = e -> updateText();

        texte.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateText();
            }
        });

        rouge.addActionListener(updateListener);
        bleu.addActionListener(updateListener);
        noir.addActionListener(updateListener);

        panelBas.add(caseCocher);
        panelPrincipale.add(panelHaut);
        panelPrincipale.add(panelMilieu);
        panelPrincipale.add(panelBas);
        add(panelPrincipale);
    }

    public void updateText() {
        String nouveauTexte = texte.getText();
        Color couleurTexte = rouge.isSelected() ? Color.RED : bleu.isSelected() ? Color.BLUE : Color.BLACK;
        fenetre.returnChampstxt().setForeground(couleurTexte);
        fenetre.returnChampstxt().setText(nouveauTexte);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BoiteDialogue(new tp3Ex1fenetre2p2()));
    }
}
