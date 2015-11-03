package br.univel;

public enum Genero {
	M("Masculino"),
	F("Feminino");

	//criado uma variavél do tipo nome
	private String nome;

	//criado um get para retornar o valor que está atribuido ao sexo
	public String getNome() {
		return nome;
	}
	
	//construtor da classe
	private Genero(String nome){
		this.nome = nome;
	}
}
