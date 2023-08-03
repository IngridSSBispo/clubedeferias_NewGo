package main.teste;

import main.model.CadastroDAO;

public class TesteReadFile {
    public static void main(String[] args) {
        CadastroDAO dao = new CadastroDAO();
        String path = "C:\\Users\\Ingrid Bispo\\Desktop\\";
        String name = "arquivo.txt";

        dao.read(path, name);


    }
}
