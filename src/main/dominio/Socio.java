package main.dominio;

public class Socio {

    private String nome;
    private int CPF;
    private int numeroCarteirinha;

    public Socio(String nome, int CPF, int numeroCarteirinha) {
        this.nome = nome;
        this.CPF = CPF;
        this.numeroCarteirinha = numeroCarteirinha;
    }

    public Socio(String nome, String numeroCPF, int numeroCarteirinha) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getNumeroCarteirinha() {
        return numeroCarteirinha;
    }

    public void setNumeroCarteirinha(int numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
    }


    }

