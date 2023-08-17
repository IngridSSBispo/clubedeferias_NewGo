package main.teste;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;

public class TesteUpdateFile {

    public static void main(String[] args) throws IOException {

        CadastroDAO dao = new CadastroDAO();
        Socio socio = new Socio("Vivian","123456789-23","45789321-5");
        dao.atualizaByNrCard(
                2,socio);

    }
}