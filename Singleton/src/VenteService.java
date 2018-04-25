import java.util.ArrayList;
import java.util.List;

public class VenteService {
	
	private static VenteService instance;
	
	// sert à simuler des données renvoyées par une BDD
	private static List<Vente> ventesDB;
	
	public VenteService () {
		ventesDB = new ArrayList<Vente>();
		// on ajoute des fake ventes
		ventesDB.add(new Vente(1, 2 ,3, "Chicoutimi", new Produit (1, "Baguette", 1, ""),1));
		ventesDB.add(new Vente(3, 5 ,15, "Jonquière", new Produit (2, "Burger", 12, ""),1));
		ventesDB.add(new Vente(4, 5 ,15, "La baie", new Produit (2, "Burger", 12, ""),2));

	}
	public static VenteService getInstance () {
		if (instance == null) {
			instance = new VenteService();
		}
			
		return instance;
	}
	
	public List<Vente> getAllUserSales (int idUtilisateur) {
		// Ici normalement on envoie une requete
		List<Vente> retour = new ArrayList<Vente>();
		for (Vente vente : ventesDB) {
			if (vente.getIdUtilisateur() == idUtilisateur)
				retour.add(vente);
		}
		return retour;
	}
	
	public Vente getVenteParId (int idVente) {
		for (Vente vente : ventesDB) {
			if (vente.getIdUtilisateur() == idVente)
				return vente;
		}
		return new Vente (0, 0, 0, "", null, 0);
	}

}
