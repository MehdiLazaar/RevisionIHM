import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class RessourceManager {
    public static final String TradFichier = "textes";
    private static RessourceManager gestionnaire;
    private Locale lieu;
    private ResourceBundle ressources;
    private List<Traduisible> traduisibles;

    private RessourceManager() {
		this.lieu = lieu.getDefault();
		this.ressources = ResourceBundle.getBundle(TradFichier, lieu);
		this.traduisibles = new ArrayList<>();

	}
	
	public static RessourceManager getRessourceManager() {
		if(gestionnaire == null){
			gestionnaire = new RessourceManager();
		}
		return gestionnaire;
	}
	
	public String getString(Ressource res) {
		return ressources.getString(res.getNom());
		
	}
	
	public void definirLieu(Locale lieu) {
		this.lieu = lieu;
		ressources = ResourceBundle.getBundle(TradFichier, lieu);
		faireTraduire();
		
	}
	
	public Locale getLieu() {
		return lieu;
		
	}
	
	public void addTraduisible(Traduisible trad) {
		traduisibles.add(trad);
		
	}
	
	public void removeTraduisible(Traduisible trad) {
		traduisibles.remove(trad);
		
	}
	
	private void faireTraduire() {
		for (Traduisible trad : traduisibles) {
			trad.traduire();
		}
	}


    
}
