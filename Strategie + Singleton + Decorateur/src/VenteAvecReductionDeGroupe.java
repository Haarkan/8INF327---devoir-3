
public class VenteAvecReductionDeGroupe extends VenteAvecCasSpeciaux {

	public VenteAvecReductionDeGroupe(int id, int profil, int prixDeVente, String nomVille, Produit produit,
			int idUser) {
		super(id, profil, prixDeVente, nomVille, produit, idUser);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrix () {
		
		return (super.getPrix() - super.getPrix() * 0.15);
	}
}
