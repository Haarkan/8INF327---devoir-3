import java.util.Date;
import java.util.List;

public class FiltreDate implements IFiltreStrategie{

	private Date date;
	
	
	public FiltreDate(Date date) {
		super();
		this.date = date;
	}


	@Override
	public String Filtrer() {
		return "Ceci est la requête correspondant à la date donnée au constructeur";
		
	}

}
