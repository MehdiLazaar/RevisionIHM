import javax.swing.*;
import java.awt.*;

public class tp3Ex1fenetre2p2 extends JFrame {
    JPanel panelPrincipal = new JPanel();
    JLabel txt = new JLabel();
    tp3Ex1fenetre2p2(){
        super("tp3Ex1fenetre2p2");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init() {
        panelPrincipal = new JPanel(); // Initialisation du panneau principal
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        JPanel panelHaut = new JPanel();
        txt = new JLabel("Texte affiché");
        txt.setFont(new Font("Arial", Font.BOLD, 20));
        txt.setOpaque(true);
        panelHaut.add(txt);

        JPanel panelbas = new JPanel();
        JButton quitter = new JButton("Quitter");
        quitter.addActionListener((e) -> System.exit(0));
        panelbas.add(quitter);

        panelPrincipal.add(panelHaut);
        panelPrincipal.add(panelbas);
        add(panelPrincipal);
    }
    public JLabel returnChampstxt(){
        return txt;
    }
    public JPanel getPanelPrincipal() { // Méthode pour accéder au panneau principal
        return panelPrincipal;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(tp3Ex1fenetre2p2::new);
    }
}
