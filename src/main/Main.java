package main;

import main.dominio.Socio;
import main.model.CadastroDAO;

public class Main {

    public static void main(String[] args) {


        // Testando cadastro sócio

        Socio socioUm = new Socio("Ingrid",12346789-2,1);
        Socio socioDois = new Socio("Caike",2222222-2,2);
        System.out.println("O nome do socio é: " + socioUm.getNome());

        CadastroDAO dao = new CadastroDAO();
        dao.create(socioUm);
        dao.create(socioDois);




    }
}