package br.univel;

import java.math.BigDecimal;

public class Produto {
	
	private int id;
	private int cod;
	private String categoria;
	private String descricao;
	private String unidade;
	private BigDecimal custo;
	private BigDecimal lucro;
	//Construtores da classe
		public Produto(){}

		public Produto(int id, int codBarra, String categoria,
				String descricao, String unidade, BigDecimal custo,
				BigDecimal margenLucro) {
			this.id = id;
			this.cod = codBarra;
			this.categoria = categoria;
			this.descricao = descricao;
			this.unidade = unidade;
			this.custo = custo;
			this.lucro = margenLucro;
		}

		public Produto(int codBarra, String categoria, String descricao,
				String unidade, BigDecimal custo, BigDecimal margenLucro) {
			this.cod = codBarra;
			this.categoria = categoria;
			this.descricao = descricao;
			this.unidade = unidade;
			this.custo = custo;
			this.lucro = margenLucro;
		}

		// criação dos geters e seters
		public int getCod() {
			return id;
		}

		public void setCod(int id) {
			this.id = id;
		}

		public int getCodBarra() {
			return cod;
		}

		public void setCodBarra(int codigo) {
			this.cod = codigo;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getUnidade() {
			return unidade;
		}

		public void setUnidade(String unidade) {
			this.unidade = unidade;
		}

		public BigDecimal getCusto() {
			return custo;
		}

		public void setCusto(BigDecimal custo) {
			this.custo = custo;
		}

		public BigDecimal getMargenLucro() {
			return lucro;
		}

		public void setMargenLucro(BigDecimal margenLucro) {
			this.lucro = margenLucro;
		}
}
