
abstract class VenteAvecCasSpeciaux extends Vente{
	Vente vente;

	public VenteAvecCasSpeciaux(int id, int profil, int prixDeVente, String nomVille, Produit produit, int idUser) {
		super (id, profil, prixDeVente, nomVille, produit, idUser);
		this.vente = new Vente(id, profil, prixDeVente, nomVille, produit, idUser);
		// TODO Auto-generated constructor stub
	}


}
