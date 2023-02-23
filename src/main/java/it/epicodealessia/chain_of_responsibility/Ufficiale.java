package it.epicodealessia.chain_of_responsibility;

public abstract class Ufficiale {
	
	protected Ufficiale responsabile;
	protected int stipendio;
	
	public Ufficiale(Ufficiale ufficiale) {
		this.responsabile = ufficiale;
	}

	public Ufficiale getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(Ufficiale responsabile) {
		this.responsabile = responsabile;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
}
