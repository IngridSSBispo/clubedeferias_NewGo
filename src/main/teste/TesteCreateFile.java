package main.teste;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;

public class TesteCreateFile {

    public static void main(String[] args) throws IOException {


        // Testando cadastro sócio

        Socio socioUm = new Socio("Ingrid","12346789-2");
        Socio socioDois = new Socio("Caike","2222222-2");
        Socio socioTres = new Socio("Ana","1555555-5");
        Socio socioQuatro = new Socio("José","456987-5");
        System.out.println("O nome do socio é: " + socioUm.getNome());

        CadastroDAO dao = new CadastroDAO();
        dao.create(socioUm);
        dao.create(socioDois);
        dao.create(socioTres);
        dao.create(socioQuatro);

    }
}
