package main;

import main.dominio.Socio;
import main.model.CadastroDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        // Testando cadastro sócio

        Socio socioUm = new Socio("Ingrid",12346789-2,1);
        Socio socioDois = new Socio("Caike",2222222-2,2);
        
        System.out.println("O nome do socio é: " + socioUm.getNome());

        CadastroDAO dao = new CadastroDAO();
        dao.create(socioUm);
        dao.create(socioDois);

      /*  List<Socio> socios = new ArrayList<>();

        // Adicionar sócios à lista
        socios.add(new Socio("João Silva", 123456789, 1001));
        socios.add(new Socio("Maria Santos", 987654321, 1002));
        socios.add(new Socio("Paulo Souza", 654321987, 1003));

        // Imprimir a lista de sócios
        for (Socio socio : socios) {
            System.out.println("Nome: " + socio.getNome());
            System.out.println("CPF: " + socio.getCPF());
            System.out.println("Número da Carteirinha: " + socio.getNumeroCarteirinha());
            System.out.println("---------------------");


        }

       */
    }
}


