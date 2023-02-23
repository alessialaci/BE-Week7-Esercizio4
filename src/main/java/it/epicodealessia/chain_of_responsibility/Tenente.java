package it.epicodealessia.chain_of_responsibility;

public class Tenente extends Ufficiale {

	public Tenente(Ufficiale ufficiale) {
		super(ufficiale);
		stipendio = 3000;
	}

}
