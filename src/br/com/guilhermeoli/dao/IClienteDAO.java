package br.com.guilhermeoli.dao;

import br.com.guilhermeoli.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public static Boolean cadastrar(Cliente cliente) {
        return null;
    }

    Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);
    public void alterar(Cliente cliente);

    public static Cliente consultar(Long cpf) {
        return null;
    }

    Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
