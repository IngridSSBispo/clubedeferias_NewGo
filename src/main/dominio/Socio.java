package main.dominio;

public class Socio {

    private String nome;
    private String numeroCPF;
    private String RG;

    public Socio(String nome, String numeroCPF, String RG) {


        if (isValidCPF(numeroCPF)) {
            this.numeroCPF = numeroCPF;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
        setNome(nome);
        setNumeroRG(RG);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.matches("[\\p{L}\\s]+")) {
            throw new IllegalArgumentException("Nome deve conter apenas caracteres alfabéticos");
        }
        this.nome = nome;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public String getNumeroRG() {
        return RG;
    }

    public void setNumeroRG(String numeroRG) {
        if (!isValidRG(numeroRG)) {
            throw new IllegalArgumentException("RG inválido");
        }
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

    private boolean isValidRG(String numeroRG) {

        numeroRG = numeroRG.replaceAll("[^0-9]", "");

        if (numeroRG.length() != 9 &&numeroRG.length() !=12) {
            return false;
        }
        return true;

    }

}
