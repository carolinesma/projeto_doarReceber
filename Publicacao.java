package ufba.mata55.doarReceber;

public abstract class Publicacao implements IPublicacao{
	
	enum TipoPublicacao {
		DOAR("Doar"),
		RECEBER("Receber"),
		EVENTO("Evento Social");
		
		private String tag;
		
		TipoPublicacao(String tag){
			this.tag = tag; }
		
		public String getTipoUPublicacao() {
			return tag; }
	}

	private Pessoa autor;
	private String titulo;
	private String descricao;
	
	public Publicacao(Pessoa autor, String titulo, String descricao) {
		this.autor = autor;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	@Override
	public void fazer(Pessoa autor, String titulo, String descricao, TipoPublicacao tag) {
		Publicacao publicacao;
		
		if (tag == TipoPublicacao.DOAR) {
			publicacao = new Doar(autor, titulo, descricao);
			Classificados.add(publicacao); 
			autor.getPublicacoesPessoais().add(publicacao);}
		
		else if(tag == TipoPublicacao.RECEBER) {
			publicacao = new Receber(autor, titulo, descricao);
			Classificados.add(publicacao); 
			autor.getPublicacoesPessoais().add(publicacao);}
	}
	
	@Override
	public void fazer(PessoaJuridica autor, String titulo, String data, String descricao, TipoPublicacao tag) {
		EventoSocial evento;
		
		if (tag == TipoPublicacao.EVENTO) {
			evento = new EventoSocial(autor, titulo, data, descricao);
			Classificados.add(evento); 
			autor.getMeusEventos().add(evento); }
		
	}
	
	@Override
	public void remover(Pessoa autor, Publicacao publicacao) {
		autor.getMinhasPublicacoes().remove(publicacao);
		Classificados.remover(publicacao);
				
	}
	
	@Override
	public void remover(PessoaJuridica autor, EventoSocial evento) {
		autor.getMeusEventos().remove(evento);
		Classificados.remover(evento);
				
	}
	
	@Override
	public void addFavorita(PessoaFisica pessoa, Publicacao publicacao) {
		pessoa.getPublicacoesFavoritas().add(publicacao);
		
	}
	
	@Override
	public void removerFavorita(PessoaFisica pessoa, Publicacao publicacao) {
		pessoa.getPublicacoesFavoritas().remove(publicacao);
	
	}

		
	public Pessoa getAutor() {	return autor; }
	public String getTitulo() {	return titulo; }
	public String getDescricao() {	return descricao; }
	public void setAutor(Pessoa autor) {	this.autor = autor; }
	public void setTitulo(String titulo) {	this.titulo = titulo; }
	public void setDescricao(String descricao) {	this.descricao = descricao; }

}
