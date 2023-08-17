package main.teste;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;

public class TesteUpdateFile {

    public static void main(String[] args) throws IOException {

        CadastroDAO dao = new CadastroDAO();
        dao.atualizaByNrCard(
                2,
                "Vivian",
                "123456888-25",
                "23456765-9");
    }
}