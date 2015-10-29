package br.univel.Dao;

import java.util.List;

import br.univel.Cliente;

public interface ClienteDao {
	public void iserir(Cliente c);

	public void atualizar(Cliente c);

	public void excluir(Cliente c);

	public Cliente buscar(int id);

	public Cliente buscarPorExemplo(Cliente c);

	public List<Cliente> listar();
}
