package quinta_lezione;

import quinta_lezione.Carta.SemeCarte;
import quinta_lezione.Carta.ValoreCarta;
import java.util.Random;

public class MazzoDiCarte {
	
	private Carta[] mazzo = new Carta[52];
	private int prossimaCarta = 0;
	
	
	
	public MazzoDiCarte()
	{
		int countMazzo = 0;
		SemeCarte[] semi = SemeCarte.values();
		ValoreCarta[] valori = ValoreCarta.values();
		
		prossimaCarta = 0;
		
		
		for (int i = 0; i < semi.length; i++)
		{
			for (int j = 0; j < valori.length; j++)
			{
				mazzo[countMazzo] = new Carta(semi[i], valori[j]);
				countMazzo +=1;
			}
		}
	}
	
	public void mescola()
	{
		Random rgen = new Random();
		
		for (int i = 0; i < mazzo.length; i++)
		{
			int randomIndexToSwap = rgen.nextInt(mazzo.length);
			Carta temp = mazzo[randomIndexToSwap];
			mazzo[randomIndexToSwap] = mazzo[i];
			mazzo[i] = temp;
		}
	}
	
	public void distribuisci()
	{
		System.out.println(mazzo[prossimaCarta].getCarta());
		
		if (prossimaCarta <=52) prossimaCarta +=1;
		else System.out.println("Carte finite");
	}
	
	public static void main(String[] args)
	{
		MazzoDiCarte prova = new MazzoDiCarte();
		
		prova.mescola();
		for (int i = 0; i < 52; i++)
			prova.distribuisci();
	}
	
	
}
