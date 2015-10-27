package br.univel;

public enum Genero {
	
	M("Paraná"), //
	F("São Paulo"), //
	I("Santa Catarina");//
	

	private String nome;

	public String getNome() {
		return nome;
	}

	private Genero(String nome) {
		this.nome = nome;
	}
	
	public Genero valida(Object o){
		if(o.toString().equals(M.nome))
			return Genero.M;
		else if(o.toString().equals(F.nome))
			return Genero.F;
		else if(o.toString().equals(I.nome))
				return Genero.I;
		return null;
	}

}
