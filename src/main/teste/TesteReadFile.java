package main.teste;

import main.model.CadastroDAO;

public class TesteReadFile {
    public static void main(String[] args) {
        CadastroDAO dao = new CadastroDAO();
        String path = "C:\\Users\\Ingrid Bispo\\Desktop\\";
        String name = "arquivo.txt";

        dao.readByCPF("C:\\Users\\Ingrid Bispo\\Desktop\\","arquivo.txt","1555555-5");


    }
}
