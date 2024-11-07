import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;
public class Exercice3 extends JDialog {
    Exercice3(JFrame fenetre){
        super(fenetre,"Exercice 3",true);
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelHaut = new JPanel();
        panelHaut.setLayout(new BoxLayout(panelHaut,BoxLayout.LINE_AXIS));
        JButton bouton1 = new JButton("bouton 1");
        JButton bouton2 = new JButton("mon deuxieme bouton");
        panelHaut.add(bouton1);
        panelHaut.add(bouton2);

        JPanel panelBas = new JPanel();
        panelBas.setLayout(new BoxLayout(panelBas, BoxLayout.LINE_AXIS));
        JButton btn3 = new JButton("mon troisieme bouton");
        JButton btn4 = new JButton("Bouton 4");
        panelBas.add(btn3);
        panelBas.add(btn4);

        panelPrincipal.add(panelHaut,BorderLayout.NORTH);
        panelPrincipal.add(panelBas,BorderLayout.SOUTH);
        add(panelPrincipal);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame fenetre = new JFrame("Exercice 3");
            new Exercice3(fenetre);
        });
    }
}
