import java.util.List;

public class FiltreNom implements IFiltreStrategie {
	
	private String nom;
	
	
	
	public FiltreNom(String nom) {
		super();
		this.nom = nom;
	}



	@Override
	public String Filtrer() {
		return "Ceci est la partie de la requ�te correspondant au nom pass� en param�tre";
		
	}

}
