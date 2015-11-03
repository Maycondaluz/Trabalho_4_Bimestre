package br.univel.Dao;

import java.util.List;



public interface GenDao<T> {

	public void inserir(T tipo);
	
	public void atualizar(T tipo);
	
	public void deletar(int tipo);
	
	public T buscarUm(int id);
	
	public List<T> listar();  

}
