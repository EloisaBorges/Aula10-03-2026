package DAO;

public class SistemaProdutos {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAOLista();

        dao.inserir(new Produto(1, "Teclado", 250.0));
        dao.inserir(new Produto(2, "Mouse", 150.0));

        System.out.println("Lista de Produtos");
        dao.listar().forEach(System.out::println);

        System.out.println("\n Buscando ID 1: " + dao.buscarPorId(1));

        dao.remover(1);
        System.out.println("\n Lista após remoção");
        dao.listar().forEach(System.out::println);
    }
}