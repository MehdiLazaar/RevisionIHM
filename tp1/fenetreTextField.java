import java.awt.*;
import javax.swing.*;

public class fenetreTextField extends JFrame {
    fenetreTextField() {
        super("fenetreTextField");
        init();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void init() {
        // Panel principal avec BoxLayout
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        // Panel haut contenant le JLabel "Bonjour"
        JPanel panelHaut = new JPanel();
        JLabel texte1 = new JLabel("Bonjour");
        panelHaut.add(texte1);

        // Panel milieu contenant les champs de saisie
        JPanel panelMilieu = new JPanel();
        panelMilieu.setLayout(new BoxLayout(panelMilieu, BoxLayout.Y_AXIS));
        
        JLabel loginLabel = new JLabel("Login :");
        JTextField textField = new JTextField(20);
        
        JLabel passwordLabel = new JLabel("Mot de passe :");
        JPasswordField psswd = new JPasswordField(20);
        
        JLabel anecdoteLabel = new JLabel("Anecdote :");
        JTextArea txtArea = new JTextArea(5, 20);
        
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtArea);

        // Ajout des composants au panel milieu
        panelMilieu.add(loginLabel);
        panelMilieu.add(textField);
        panelMilieu.add(passwordLabel);
        panelMilieu.add(psswd);
        panelMilieu.add(anecdoteLabel);
        panelMilieu.add(scrollPane);

        // Panel bas contenant les boutons
        JPanel panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton question = new JButton("Questions");
        JButton quitter = new JButton("Quitter");
        quitter.addActionListener((e) -> System.exit(0));
        
        panelBas.add(question);
        panelBas.add(quitter);

        // Ajout des panels au panel principal
        panelPrincipal.add(panelHaut);
        panelPrincipal.add(panelMilieu);
        panelPrincipal.add(panelBas);

        // Ajout du panel principal à la fenêtre
        add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetreTextField::new);
    }
}
