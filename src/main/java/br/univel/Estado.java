package br.univel;


public enum Estado {

	PR("Paraná"), //
	SP("São Paulo"), //
	SC("Santa Catarina"),//
	RN("Recem nascido"),//
	RJ("Rio de Janeiro");

	private String nome;

	public String getNome() {
		return nome;
	}

	private Estado(String nome) {
		this.nome = nome;
	}
	
	public Estado valida(Object o){
		if(o.toString().equals(PR.nome))
			return Estado.PR;
		else if(o.toString().equals(SP.nome))
			return Estado.SP;
		else if(o.toString().equals(SC.nome))
				return Estado.SC;
		else if(o.toString().equals(RN.nome))
				return Estado.RN;
		else if(o.toString().equals(RJ.nome))
				return Estado.RJ;
		return null;
	}
}
