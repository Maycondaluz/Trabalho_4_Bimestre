package br.univel;

public class Usuario {
	private int id;
	private int idCliente;
	private String cliente;
	private String senha;
	
	//Contrutores da classe Usuario
	public Usuario(){}	
	//métodos geters e serts necessários para o usuário
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
