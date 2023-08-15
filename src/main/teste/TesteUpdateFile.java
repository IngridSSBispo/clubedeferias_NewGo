package main.teste;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;

public class TesteUpdateFile {

    public static void main(String[] args) throws IOException {

        CadastroDAO dao = new CadastroDAO();
        dao.atualizaByNrCard(
                905321,
                "C:\\Users\\ingri\\OneDrive\\Área de Trabalho\\",
                "arquivo.txt",
                "Vivian",
                "789456");
    }
}