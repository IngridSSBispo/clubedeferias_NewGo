package main.dominio;
import java.util.HashSet;
import java.util.Set;

public class Socio {

    private String nome;
    private String numeroCPF;
    private int numeroCarteirinha;
    private static Set<Integer> numerosCarteirinhaGerados = new HashSet<>();


    public Socio(String nome, String numeroCPF) {
        this.nome = nome;
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


    private boolean isValidCPF(String numeroCPF) {

        // Remove caracteres não numéricos
        numeroCPF = numeroCPF.replaceAll("[^0-9]", "");

        if (numeroCPF.length() != 11) {
            return false;
        }

        return true;
    }
}

