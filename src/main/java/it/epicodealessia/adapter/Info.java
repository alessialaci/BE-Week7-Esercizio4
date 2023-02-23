package it.epicodealessia.adapter;

import java.time.LocalDate;

public class Info {

	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	
	public Info(String nome, String cognome, LocalDate dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	
	public void DataDiNascita (LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

}
