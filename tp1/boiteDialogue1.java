import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class boiteDialogue1 extends JDialog{
    boiteDialogue1(JFrame fenetre){
        super(fenetre,"BDialog",true);
        setSize(300,400);
        setLocationRelativeTo(fenetre);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fenetre = new JFrame();
            new boiteDialogue1(fenetre);
        });
    }
}
