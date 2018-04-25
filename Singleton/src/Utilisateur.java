import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String pseudo;
	private List<Vente> ventes;
	
	
	public boolean seConnecter () {
		return true;
	}
	
	public void ajouterProduit () {
		
	}
	
	public void supprimerProduit () {
		
	}
	
	public void creerDossierProduit () {
	}

	public void ajouterVente (Vente v) {
		ventes.add(v);
	}
	public int getId () {
		return this.id;
	}
	public Utilisateur(int id, String nom, String prenom, String email, String pseudo) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pseudo = pseudo;
		
		this.ventes = new ArrayList<Vente>();
	}
	
	
}
