
public class Vente {
	private int id;
	private int profil;
	private double prixDeVente;
	private String nomVille;
	private Produit produit;
	
	private int idUtilisateur; 
	
	public int getIdUtilisateur () {
		return idUtilisateur;
	}
	
	public int getId () {
		return id;
	}
	
	public double getPrix () {
		return prixDeVente;
	}
	public void valider () {
		
	}
	public Vente(int id, int profil, double prixDeVente, String nomVille, Produit produit, int idUser) {
		super();
		this.id = id;
		this.profil = profil;
		this.prixDeVente = prixDeVente;
		this.nomVille = nomVille;
		this.produit = produit;
		this.idUtilisateur = idUser;
	}

	@Override
	public String toString() {
		return "Vente [id=" + id + ", profil=" + profil + ", prixDeVente=" + prixDeVente + ", nomVille=" + nomVille
				+ ", produit=" + produit.getNom() + ", idUtilisateur=" + idUtilisateur + "]";
	}
	
	
}
