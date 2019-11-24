package ufba.mata55.doarReceber;

public class EventoSocial extends Publicacao {

	private String data;
		
	public EventoSocial(PessoaJuridica autor, String titulo, String data, String descricao) {
		super(autor, titulo, descricao);
		this.data = data;
	}


	public String getData() {	return data; }
	public void setData(String data) {	this.data = data; }

}
