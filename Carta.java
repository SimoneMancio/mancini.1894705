package quinta_lezione;

public class Carta {

	public enum SemeCarte
	{
		QUADRI,
		CUORI,
		FIORI,
		PICCHE
	}
	
	public enum ValoreCarta
	{
		ASSO,
		DUE,
		TRE,
		QUATTRO,
		CINQUE,
		SEI,
		SETTE,
		OTTO,
		NOVE,
		DIECI,
		JACK,
		DONNA,
		RE
	}
	
	private SemeCarte seme;
	private ValoreCarta valore;
	
	Carta(SemeCarte seed, ValoreCarta value)
	{
		seme = seed;
		valore = value;
	}
	
	public String getCarta()
	{
		return valore + " DI " + seme;
	}
	
}
