package main.teste;

import main.dominio.Socio;
import main.model.CadastroDAO;

import java.io.IOException;

public class TesteCreateFile {

    public static void main(String[] args) throws IOException {


        // Testando cadastro sócio

        Socio socioUm = new Socio("Ingrid", "123456789-10");
        Socio socioDois = new Socio("Caike", "222222222-22");
        Socio socioTres = new Socio("Ana", "456789321-12");
        Socio socioQuatro = new Socio("José", "500600700-20");
        Socio socioCinco = new Socio("Marta", "333333333-33");

        System.out.println("O nome do socio é: " + socioUm.getNome());

        CadastroDAO dao = new CadastroDAO();
        dao.create(socioUm);
        dao.create(socioDois);
        dao.create(socioTres);
        dao.create(socioQuatro);
        dao.create(socioCinco);

    }
}
