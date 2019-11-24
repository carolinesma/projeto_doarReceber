package ufba.mata55.doarReceber;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Pessoa {
	
	enum TipoPessoa {
		PessoaFisica("Pessoa Física"),
		PessoaJuridica("Pessoa Jurídica");
		
		private String tipo;
		
		TipoPessoa(String tipo){
			this.tipo = tipo; }
		
		public String getTipoPessoa() {
			return tipo; }
	}
	
	@SuppressWarnings("unused")
	private Usuario usuario;
	private String telefone;
	private ArrayList<Publicacao> minhasPublicacoes;
	private ArrayList<Mensagem> caixaMensagens;

	public Pessoa(Usuario usuario, String telefone) {
		this.usuario = usuario;
		this.telefone = telefone;
		this.setMinhasPublicacoes(new ArrayList<Publicacao>());
		this.caixaMensagens = new ArrayList<Mensagem>();
	}
	
	
	public void listar(Pessoa pessoa) {
		Iterator<Publicacao> iterator = pessoa.getMinhasPublicacoes().iterator();
		while (iterator.hasNext()) {
			Publicacao minhaPublicacao = iterator.next();
			System.out.println(minhaPublicacao.getTitulo()+'\n'); 
			System.out.println(minhaPublicacao.getDescricao()+'\n');
		}
	}
	
	public Usuario getUsuario() {	return usuario;}
	public String getTelefone() {	return telefone;}
	public ArrayList<Publicacao> getPublicacoesPessoais() {	return getMinhasPublicacoes();	}
	public ArrayList<Mensagem> getCaixaMensagens() {	return caixaMensagens;}
	public void setTelefone(String telefone) {	this.telefone = telefone; }
	public void setPublicacoesPessoais(ArrayList<Publicacao> publicacoesPessoais) {		this.setMinhasPublicacoes(publicacoesPessoais);}
	public void setCaixaMensagens(ArrayList<Mensagem> caixaMensagens) {	this.caixaMensagens = caixaMensagens;}
	public ArrayList<Publicacao> getMinhasPublicacoes() {	return minhasPublicacoes;}
	public void setMinhasPublicacoes(ArrayList<Publicacao> minhasPublicacoes) {		this.minhasPublicacoes = minhasPublicacoes; }
	
}


