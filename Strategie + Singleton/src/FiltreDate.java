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
		return "Ceci est la requ�te correspondant � la date donn�e au constructeur";
		
	}

}
