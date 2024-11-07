import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class fenetre1BtnRadio extends JFrame {
    fenetre1BtnRadio() {
        super("Fenetre 1 Bouton Radio");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void init() {
        // Principal BoxLayout
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        // Panel haut avec BorderLayout
        JPanel panelHaut = new JPanel(new BorderLayout());
        JLabel texte1 = new JLabel("Gauche");
        JLabel texte2 = new JLabel("Droite");
        panelHaut.add(texte1, BorderLayout.WEST);
        panelHaut.add(texte2, BorderLayout.EAST);

        // Panel milieu pour les boutons radio
        JPanel panelMilieu = new JPanel();
        panelMilieu.setLayout(new BoxLayout(panelMilieu, BoxLayout.Y_AXIS));
        panelMilieu.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2), "Couleur"));

        JRadioButton bleu = new JRadioButton("Bleu");
        JRadioButton rouge = new JRadioButton("Rouge");
        JRadioButton noir = new JRadioButton("Noir");

        panelMilieu.add(bleu);
        panelMilieu.add(rouge);
        panelMilieu.add(noir);

        // Groupement des boutons radio pour une sélection exclusive
        ButtonGroup group = new ButtonGroup();
        group.add(bleu);
        group.add(rouge);
        group.add(noir);

        // Panel bas avec FlowLayout centré
        JPanel panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton raz = new JButton("RAZ");
        JButton quitter = new JButton("Quitter");
        quitter.addActionListener((e) -> System.exit(0));
        panelBas.add(raz);
        panelBas.add(quitter);

        // Ajout des panels au panel principal
        panelPrincipal.add(panelHaut);
        panelPrincipal.add(panelMilieu);
        panelPrincipal.add(panelBas);

        // Ajout du panel principal à la fenêtre
        add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre1BtnRadio::new);
    }
}
