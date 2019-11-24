package ufba.mata55.doarReceber;

public interface ILogin {
	
	boolean salvar(Pessoa pessoa);
	Usuario buscar(String nome);
	void deletar(Pessoa pessoa);
	


}
