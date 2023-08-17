package main.test;

import domain.CadastroDAO;

import java.io.IOException;

public class TesteDeleteById {
    public static void main(String[] args) throws IOException {
        CadastroDAO dao = new CadastroDAO();
        dao.deleteByNrCard(5);
    }
}
