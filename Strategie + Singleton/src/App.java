import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur (1, "Robert", "Bertrand", "mail@mail.ca", "grospseudosansinspi");
		utilisateur.ajouterVente(new Vente(1, 2 ,3, "Chicoutimi", new Produit (1, "Baguette", 1, ""), 1 ));
		utilisateur.ajouterVente(new Vente(3, 5 ,15, "Jonquière", new Produit (2, "Burger", 12, ""), 1 ));
		
		afficherVente(utilisateur);
		
		VenteService.getInstance().changerStrategie(new FiltreNom("Chicoutimi"));
		System.out.println("Filtre par strategy :");
		VenteService.getInstance().filtrerParStrategie();
	}

	
	// On peut imaginer que cette fonction affiche les ventes sur l'appli
	public static void afficherVente (Utilisateur utilisateur) {
		List<Vente> ventesDeLUtilisateur = VenteService.getInstance().getAllUserSales(utilisateur.getId());
		System.out.println("Affichage des ventes : ");
		for (Vente vente : ventesDeLUtilisateur) {
			System.out.println(vente.toString());
		}
		
	}
}
