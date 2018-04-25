
public class Produit {
	private int id;
	private String nom;
	private int prix;
	private String description;
	
	
	public void activer() {
		
	}
	
	public void desactiver () {
		
	}

	public Produit(int id, String nom, int prix, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}

	public String getDescription() {
		return description;
	}
	
	
}
