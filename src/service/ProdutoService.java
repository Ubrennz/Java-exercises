package service;

import model.Produto;

import java.io.*;

public class ProdutoService {
    private final String OUTPUT_PATH = "src/out/summary.csv";

    public static void adicionarDados(Produto produto, String path, boolean append) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, append))) {
            bf.write(produto.getNome() + "," + produto.getPreco() + "," + produto.getQuantidade());
            bf.newLine();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
