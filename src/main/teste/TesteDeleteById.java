package main.teste;

import main.model.CadastroDAO;

import java.io.IOException;

public class TesteDeleteById {
    public static void main(String[] args) throws IOException {
        CadastroDAO dao = new CadastroDAO();
        dao.deleteByNrCard(788040, "C:\\Users\\ingri\\OneDrive\\Área de Trabalho\\", "arquivo.txt");
    }
}
