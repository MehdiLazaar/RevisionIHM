import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class Exercice1Cadre extends JFrame{
    JPanel panel;
    JLabel txt, txt2, txt3;
    Border border,marieLouise , ereLigne, emeLigne;

    Exercice1Cadre(){
        super("Exercice 1 Cadre");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        panel = new JPanel();
        //Ligne Simple
        txt = new JLabel("Bonjour");
        border = new LineBorder(Color.BLACK, 2);
        txt.setBorder(border);
        panel.add(txt);
        //Marie Louise
        txt2 = new JLabel("Au revoir");
        marieLouise = new BevelBorder(BevelBorder.RAISED);
        txt2.setBorder(marieLouise);
        panel.add(txt2);
        //Deux couleurs (compound)
        txt3 = new JLabel("Hola");
        ereLigne = new LineBorder(Color.RED,2);
        emeLigne = new LineBorder(Color.BLUE,2);
        Border comp = new CompoundBorder(ereLigne,emeLigne);
        txt3.setBorder(comp);
        panel.add(txt3);

        //Cadre simple mais décollé du Jlabel de 5 pixels
        JLabel txt4 = new JLabel("A Dios");
        Border  cadreInt= new EmptyBorder(5,5,5,5);
        Border cadreExt = new LineBorder(Color.BLACK,2);
        Border cadre = new CompoundBorder(cadreExt,cadreInt);
        txt4.setBorder(cadre);
        panel.add(txt4);

        // Cadre fait de 2 lignes (1 bleue et 1 rouge) séparés par un espace de 2 pixels
        JLabel txt5 = new JLabel("Salam");
        Border cadreInterieur = new EmptyBorder(2,2,2,2);
        Border cadreRougeBleu = new BevelBorder(BevelBorder.RAISED,Color.RED,Color.BLUE);
        Border cadre2 = new CompoundBorder(cadreRougeBleu,cadreInterieur);
        txt5.setBorder(cadre2);
        panel.add(txt5);

        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercice1Cadre::new);
    }
}
