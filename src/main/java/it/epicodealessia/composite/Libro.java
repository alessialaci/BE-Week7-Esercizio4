package it.epicodealessia.composite;

import java.util.List;

public class Libro implements Elemento {
	
	private List<Autore> autori;
	private int prezzo;
	List<Sezione> sezioni;
	
	public Libro(List<Autore> autori, int prezzo, List<Sezione> sezioni) {
		this.autori = autori;
		this.prezzo = prezzo;
		this.sezioni = sezioni;
	}

	@Override
	public void stampa() {
		System.out.println("Questo libro è formato da " + getNPagineSezioni() + " pagine");
	}
	
	public int getNPagineSezioni() {
		int nPagineSezioni = 0;
		
		for(Sezione s : sezioni) {
			nPagineSezioni += s.getNPagineSottosezioni();
		}
		
		return nPagineSezioni;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public List<Autore> getAutori() {
		return autori;
	}

	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}

}
