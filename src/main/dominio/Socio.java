package main.dominio;

import java.util.HashSet;
import java.util.Set;

public class Socio {

    private String nome;
    private String numeroCPF;
    private String RG;

    public Socio(String nome, String numeroCPF, String RG) {
        this.nome = nome;
        this.RG = RG;
        if (isValidCPF(numeroCPF)) {
            this.numeroCPF = numeroCPF;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public String getNumeroRG() {
        return RG;
    }

    public void setNumeroRG(String numeroRG) {
        this.RG = numeroRG;
    }


    private boolean isValidCPF(String numeroCPF) {

        // Remove caracteres não numéricos
        numeroCPF = numeroCPF.replaceAll("[^0-9]", "");

        if (numeroCPF.length() != 11) {
            return false;
        }

        return true;
    }
}

