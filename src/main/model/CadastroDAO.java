package main.model;

import main.dominio.Socio;

public class CadastroDAO implements InterfaceDAO{

    @Override
    public void create(Socio socio) {
        System.out.println("nome: " + socio.getNome());
        System.out.println("CPF: " + socio.getCPF());
        System.out.println("Nº da carteirinha: " + socio.getNumeroCarteirinha());

        System.out.println("Cadastro realizado com sucesso!");


        //escrever o arquivo de texto


    }

    @Override
    public void read(Socio socio) {

    }

    @Override
    public void update(Socio socio) {

    }

    @Override
    public void delete(Socio socio) {

    }
}
