package ufba.mata55.doarReceber;

import java.util.ArrayList;
import java.util.Iterator;

public class PessoaFisica extends Pessoa {
	
	String nome;
	private ArrayList<Publicacao> publicacoesFavoritas;
	
	public PessoaFisica(Usuario usuario, String telefone, String nome) {
		super(usuario, telefone);
		this.nome = nome;
		this.publicacoesFavoritas = new ArrayList<Publicacao>();
	}

	public void verPublicacoesFavoritas() {
		Iterator<Publicacao> iterator = publicacoesFavoritas.iterator();
		while (iterator.hasNext()) {
			Publicacao favorita = iterator.next();
			System.out.println(favorita.getTitulo()+'\n'); 
			System.out.println(favorita.getDescricao()+'\n');
		}
	}
	
	
	public ArrayList<Publicacao> getPublicacoesFavoritas() {
		return publicacoesFavoritas;
	}

	public void setPublicacoesFavoritas(ArrayList<Publicacao> publicacoesSalvas) {
		this.publicacoesFavoritas = publicacoesSalvas;
	}

}
