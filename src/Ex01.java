import model.Produto;
import service.ProdutoService;

public class Ex01 {
    public static void main(String[] args) {
        ProdutoService.adicionarDados(new Produto("Banana", 11.00, 4), "src/arquivo.csv", true);
    }
}
