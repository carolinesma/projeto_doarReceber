package ufba.mata55.doarReceber;

public class Usuario extends Registro {

	protected String nomeUsuario;
	private String senha;
	private String email;
	
	public Usuario(String nomeUsuario, String senha, String email) {
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
	}
	
	public void setSenha(String senha) {	this.senha = senha;}
	public String getSenha() {	return senha;  }
	public void setNomeUsuario(String nomeUsuario) {	this.nomeUsuario = nomeUsuario;}
	public void setEmail(String email) {	this.email = email;}
	public String getNomeUsuario() {	return nomeUsuario;}
	public String getEmail() {	return email;}

}
