package main.dominio;

import java.util.HashSet;
import java.util.Random;
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
        this.numeroCarteirinha = gerarNumeroCarteirinhaUnico();
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

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }


    public int getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public void setNumeroCarteirinha(int numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
    }


    private int gerarNumeroCarteirinhaUnico() {
        Random random = new Random();
        int numero;
        do {
            numero = random.nextInt(100000) + 1; // Gera um número entre 1 e 100000
        } while (numerosCarteirinhaGerados.contains(numero));

        numerosCarteirinhaGerados.add(numero);
        return numero;
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

