package br.univel;

public class Usuario {
	private int id;
	private Cliente idcliente;
	private String senha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
