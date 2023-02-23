package it.epicodealessia.chain_of_responsibility;

public class Generale extends Ufficiale {

	public Generale(Ufficiale ufficiale) {
		super(ufficiale);
		stipendio = 5000;
	}

}
