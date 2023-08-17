package main.test;

import infrastructure.Socio;
import domain.CadastroDAO;

import java.io.IOException;

public class TesteUpdateFile {

    public static void main(String[] args) throws IOException {

        CadastroDAO dao = new CadastroDAO();
        Socio socio = new Socio("Vivian","123456789-23","45789321-5");
        dao.atualizaByNrCard(
                2,socio);

    }
}