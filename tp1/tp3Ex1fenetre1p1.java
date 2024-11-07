import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
public class tp3Ex1fenetre1p1 extends JFrame {
    tp3Ex1fenetre1p1(){
        super("TP3 Exercice 1 Partie 1");
        init();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    void init(){
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        JPanel panelHaut = new JPanel(new FlowLayout());
        JLabel ancien = new JLabel("Ancien");
        JLabel actuel = new JLabel("Actuel");
        panelHaut.add(ancien);
        panelHaut.add(actuel);

        JPanel panelMilieu = new JPanel();
        panelMilieu.setLayout(new BoxLayout(panelMilieu, BoxLayout.Y_AXIS));
        panelMilieu.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2), "Bouton Radio"));
        JRadioButton bleu = new JRadioButton("Bleu");
        JRadioButton rouge = new JRadioButton("Rouge");
        JRadioButton noir = new JRadioButton("Noir");
        panelMilieu.add(bleu);
        panelMilieu.add(rouge);
        panelMilieu.add(noir);
        ButtonGroup group = new ButtonGroup();
        group.add(bleu);
        group.add(rouge);
        group.add(noir);

        JPanel panelBas = new JPanel();
        panelBas.setLayout(new FlowLayout());
        JButton raz = new JButton("RAZ");
        JButton quitter = new JButton("Quitter");
        raz.addActionListener((e)->{
            if(bleu.isSelected()){
                ancien.setForeground(Color.BLUE);
                actuel.setForeground(Color.BLUE);
            }else if(rouge.isSelected()){
                ancien.setForeground(Color.RED);
                actuel.setForeground(Color.RED);
            } else{
                ancien.setForeground(Color.BLACK);
                actuel.setForeground(Color.BLACK);
            }
        });
        quitter.addActionListener((e) -> System.exit(0));
        panelBas.add(raz);
        panelBas.add(quitter);
        
        panelPrincipal.add(panelHaut);
        panelPrincipal.add(panelMilieu);
        panelPrincipal.add(panelBas);
        add(panelPrincipal);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(tp3Ex1fenetre1p1::new);
    }
}
