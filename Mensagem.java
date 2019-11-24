package ufba.mata55.doarReceber;

public class Mensagem {

	private Pessoa autor;
	private String mensagem;

	public Mensagem(Pessoa autor, String mensagem) {
		this.autor = autor;
		this.mensagem = mensagem;
	}
	
	public void enviar(Pessoa destinatario, Pessoa autor, String mensagem) {
		autor.getCaixaMensagens().add(new Mensagem(destinatario, mensagem));
		destinatario.getCaixaMensagens().add(new Mensagem(autor, mensagem));
	}

	
	public Pessoa getAutor() {		return autor;}
	public String getMensagem() {	return mensagem;}
	public void setAutor(Pessoa autor) {	this.autor = autor;}
	public void setDescricao(String descricao) {	this.mensagem = descricao;}

}
