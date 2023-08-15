package main.teste;

import main.model.CadastroDAO;

public class TesteReadFile {
    public static void main(String[] args) {
        CadastroDAO dao = new CadastroDAO();
        dao.findByInfo("1555555-5", "cpf");


    }
}
