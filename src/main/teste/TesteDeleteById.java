package main.teste;

import main.model.CadastroDAO;

import java.io.IOException;

public class TesteDeleteById {
    public static void main(String[] args) throws IOException {
        CadastroDAO dao = new CadastroDAO();
        dao.deleteByNrCard(289187,"C:\\Users\\Ingrid Bispo\\Desktop\\", "arquivo.txt");
//        dao.delete(660486);
//        dao.clearFile("\"C:\\Users\\Ingrid Bispo\\Desktop\\","arquivo.txt");

    }


}
