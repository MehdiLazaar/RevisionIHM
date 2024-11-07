import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;
public class BulleDaide extends JFrame{
    JPanel panel;
    JLabel txt, txt2,txt3;
    BulleDaide() {
        super("Bulle d'aide");
        init();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void init(){
        panel = new JPanel();
        txt = new JLabel("Holaaa");
        txt2 = new JLabel("Como estas");
        txt3 = new JLabel("Ciao");
        Border border = new LineBorder(Color.BLACK, 2);
        Border border2 = new BevelBorder(BevelBorder.RAISED,Color.BLUE,Color.GREEN);
        Border border3 = new BevelBorder(BevelBorder.RAISED,Color.RED,Color.YELLOW);
        txt.setBorder(border);
        txt2.setBorder(border2);
        txt3.setBorder(border3);
        txt.setToolTipText("Mehdi");
        txt2.setToolTipText("Mehdi");
        txt3.setToolTipText("Mehdi");
        panel.add(txt);
        panel.add(txt2);
        panel.add(txt3);
        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BulleDaide::new);
    }
}
