package ufba.mata55.doarReceber;

import ufba.mata55.doarReceber.Publicacao.TipoPublicacao;

public interface IPublicacao {
	void fazer (Pessoa autor, String titulo, String descricao, TipoPublicacao tag);
	void fazer (PessoaJuridica autor, String titulo, String data, String descricao, TipoPublicacao tag);
	void remover(Pessoa autor, Publicacao publicacao);
	void remover(PessoaJuridica autor, EventoSocial evento);
	void addFavorita(PessoaFisica pessoa, Publicacao publicacao);
	void removerFavorita(PessoaFisica pessoa, Publicacao publicacao);
	

}
