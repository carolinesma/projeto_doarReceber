package ufba.mata55.doarReceber;

import java.util.ArrayList;
import java.util.Iterator;

import ufba.mata55.doarReceber.Pessoa.TipoPessoa;

public class Registro {
	
	private ArrayList<Pessoa> cadastro;
	
	public Registro() {
		this.cadastro = new ArrayList<Pessoa>();

	}
	public boolean Cadastro(String nomeUsuario, String senha, String email, String nome, 
			String telefone, TipoPessoa tipo) {
		
		boolean retorno = false;;
		Usuario usuario = new Usuario(nomeUsuario, senha, email);
		
		if (tipo == TipoPessoa.PessoaFisica) {
			Pessoa novoCadastro = new PessoaFisica(usuario, telefone, nome);
			retorno = salvar(novoCadastro);
		}
		else if (tipo == TipoPessoa.PessoaJuridica) {
			Pessoa novoCadastro = new PessoaJuridica(usuario, telefone, nome);
			retorno = salvar(novoCadastro);
		}
		
		return retorno;
	}
	
	//@Override
	public boolean salvar(Pessoa pessoa) {
		return cadastro.add(pessoa);
		
	}
	
	//@Override
	public Usuario buscar(String nomeUsuario) {
		Iterator<Pessoa> iterator = cadastro.iterator();
		Pessoa cadastro = iterator.next();
				
		while (iterator.hasNext()&&!(cadastro.getUsuario().getNomeUsuario().equals(nomeUsuario))) {
		cadastro = iterator.next();}
		
		Usuario usuario = cadastro.getUsuario(); 
		return usuario;
	}
	
	public boolean login(String nomeUsuario, String senha) {
		boolean login = false;
		Usuario usuario;
		usuario = buscar(nomeUsuario); 
				
		if(usuario.getSenha().equals(senha))
			login = true;
		else
			login = false;
		return login;
	}
	
	
		//@Override
	public void deletar(Pessoa pessoa) {
		cadastro.remove(pessoa);
		
	}
	
	public void listar() {
		Iterator<Pessoa> iterator = cadastro.iterator();
				
		while (iterator.hasNext()) { //&&!(cadastro.getUsuario().getNomeUsuario().equals(nomeUsuario))) {
		Pessoa cadastro = iterator.next();
		System.out.println(cadastro.getUsuario().getNomeUsuario());}
		
	}

}
