import java.util.List;

public class FiltreVille implements IFiltreStrategie {
	
	private String ville;
	
	
	public FiltreVille(String ville) {
		super();
		this.ville = ville;
	}


	@Override
	public String Filtrer() {
		return "Ceci est la partie de la requête correspondant à la ville en paramètre";
		
	}

}
