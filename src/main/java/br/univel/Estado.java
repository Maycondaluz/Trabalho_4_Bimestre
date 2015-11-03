package br.univel;


public enum Estado {

		AC("Acre"),
		AL("Alagoas"),
		AP("Amapá"),
		AM("Amazonia"),
		BA("Bahia"),
		CE("Ceará"),
		DF("Distrito Federal"),
		ES("Espírito Santo"),
		GO("Goiás"),
		MA("Maranhão"),
		MT("Mato Grosso"),
		MS("mato Grosso do Sul"),
		MG("Minas Gerais"),
		PA("Pará"),
		PB("Paraiba"),
		PR("Paraná"),
		PE("Pernambuco"),
		PI("Piauí"),
		RJ("Rio de Janeiro"),
		RN("Rio Grande do Norte"),
		RS("Rio Grande do Sul"),
		RO("Rondônia"),
		RR("Roraima"),
		SC("Santa Catarina"),
		SP("São Paulo"),
		SE("Sergipe"),
		TO("Tocantins");
		
		//criado uma nome para retorna qual o valor da sigla
		private String nome;

		//método get para retornar somente o valor
		public String getNome() {
			return nome;
		}
		
		//construtor da classe que recebe por parametro uma tipo string 
		private Estado(String nome){
			this.nome = nome;
		}
}
