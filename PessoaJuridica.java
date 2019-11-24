package ufba.mata55.doarReceber;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa {
	
	String nomeFantasia;
	private ArrayList<EventoSocial> meusEventos;
	
	public PessoaJuridica(Usuario usuario, String telefone, String nomeFantasia) {
		super(usuario, telefone);
		this.nomeFantasia = nomeFantasia;
		this.meusEventos = new ArrayList<EventoSocial>();
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public ArrayList<EventoSocial> getMeusEventos() {
		return meusEventos;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setMeusEventos(ArrayList<EventoSocial> meusEventos) {
		this.meusEventos = meusEventos;
	}


}
