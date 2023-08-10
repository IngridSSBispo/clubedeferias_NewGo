package main.teste;

import main.model.CadastroDAO;

public class TesteReadFile {
    public static void main(String[] args) {
        CadastroDAO dao = new CadastroDAO();
        dao.readByCPF("1555555-5");


    }
}
