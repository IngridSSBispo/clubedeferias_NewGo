package main.test;

import domain.CadastroDAO;

public class TesteReadFile {
    public static void main(String[] args) {
        CadastroDAO dao = new CadastroDAO();
        dao.findByInfo("1555555-5", "cpf");


    }
}
