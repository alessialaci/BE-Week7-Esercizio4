package it.epicodealessia.chain_of_responsibility;

public class Maggiore extends Ufficiale {

	public Maggiore(Ufficiale ufficiale) {
		super(ufficiale);
		stipendio = 2000;
	}

}
