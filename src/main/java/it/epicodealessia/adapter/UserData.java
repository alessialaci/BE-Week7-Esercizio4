package it.epicodealessia.adapter;

public class UserData {

	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) { 
		nomeCompleto = ds.getNomeCompleto(); 
		eta = ds.getEta();
		
		System.out.println("Nome: " + nomeCompleto + " - Età: " + eta);
	}

}
