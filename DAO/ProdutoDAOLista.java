package DAO;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOLista implements ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void inserir(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public List<Produto> listar() {
        return produtos;
    }

    @Override
    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remover(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
}