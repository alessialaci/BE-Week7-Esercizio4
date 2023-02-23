package it.epicodealessia.composite;

public class Sottosezione implements Elemento {
	
	private int nPagine;

	public Sottosezione(int nPagine) {
		this.nPagine = nPagine;
	}

	@Override
	public void stampa() {
		System.out.println("Questa sottosezione è formata da " + getnPagine() + " pagine");
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}

}
