import java.awt.*;

import javax.swing.*;
public class fenetre2BtnRadio extends JFrame{
    fenetre2BtnRadio(){
        super("fenetre2BtnRadio");
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
        JCheckBox gauche = new JCheckBox("gauche",false);
        JCheckBox droite = new JCheckBox("droite",false);
        panelHaut.add(gauche);
        panelHaut.add(droite);

        JPanel panelMilieu = new JPanel();
        panelMilieu.setLayout(new BoxLayout(panelMilieu, BoxLayout.Y_AXIS));
        String [] tab = {"École maternelle","École élémentaire ","Collège","Lycée","Enseignement Supérieur"};
        String [] tab2 = {"Mathématiques","Français","Anglais","Physique-Chimie","SVT","EPS"};
        JComboBox<String> grp = new JComboBox<>(tab);
        JList<String> grp2 = new JList<>(tab2);
        panelMilieu.add(grp);
        panelMilieu.add(grp2);

        JPanel panelBas = new JPanel(new BorderLayout());
        panelBas.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        JButton annuler = new JButton("Annuler");
        JButton quitter = new JButton("Quitter");
        quitter.addActionListener((e) -> System.exit(0));
        panelBas.add(quitter,BorderLayout.EAST);
        panelBas.add(annuler,BorderLayout.WEST);
        panelPrincipal.add(panelBas);

        panelPrincipal.add(panelHaut);
        panelPrincipal.add(panelMilieu);
        panelPrincipal.add(panelBas);
        add(panelPrincipal);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(fenetre2BtnRadio::new);
    }
}
