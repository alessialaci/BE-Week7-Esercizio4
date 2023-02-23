package it.epicodealessia.composite;

import java.util.List;

public class Sezione implements Elemento {
	
	List<Sottosezione> sottosezioni;
	
	public Sezione(List<Sottosezione> sottosezioni) {
		this.sottosezioni = sottosezioni;
	}

	@Override
	public void stampa() {
		System.out.println("Questa sezione è formata da " + getNPagineSottosezioni() + " pagine");
	}
	
	public int getNPagineSottosezioni() {
		int nPagineSottosezioni = 0;
		
		for(Sottosezione s : sottosezioni) {
			nPagineSottosezioni += s.getnPagine();
		}
		
		return nPagineSottosezioni;
	}
	
}
