package it.epicodealessia.chain_of_responsibility;

public class Capitano extends Ufficiale {

	public Capitano(Ufficiale ufficiale) {
		super(ufficiale);
		stipendio = 1000;
	}
	
}
