package main.model;
import main.dominio.Socio;
import main.io.Arquivo;
import java.io.*;
import java.util.ArrayList;
public class CadastroDAO {

    String path = "C:\\Users\\ingri\\OneDrive\\Área de Trabalho\\";
    String fileName = "arquivo.txt";

    public void create(Socio socio) throws IOException {
        System.out.println("nome: " + socio.getNome());
        System.out.println("CPF: " + socio.getNumeroCPF());
//      System.out.println("Nº da carteirinha: " + socio.getNumeroCarteirinha());


        System.out.println("Cadastro realizado com sucesso!");


        //escrever o arquivo de texto

        Arquivo arquivo = new Arquivo();
        String content = "";
        content = "Nome: " + socio.getNome() + " | CPF: " + socio.getNumeroCPF() + " | Nª carteirinha: " + getNextID();
        System.out.println("-------------" + content);
        arquivo.create(path + fileName, content);


    }

    public int getNextID() {
        int resultado = 0;
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, fileName);

        //Para separar as linhas do arquivo com ";"
        String[] textoSeparado = conteudo.split(";");

        for (String linha : textoSeparado) {
            resultado++;
        }


        return resultado;

    }

    /**
     * procura de acordo com o parametro informado
     *
     * @param info qualquer informacao que esteja contida no arquivo de texto
     **/
    public boolean findByInfo(String info, String chave) {
        boolean resultado;
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, fileName);

        //Para separar as linhas do arquivo com ";"
        String[] textoSeparado = conteudo.split(";");
        String socio = "";
        String busca = "";
        if(chave.equals("cpf")){
            busca = "CPF: " + info;
        } else if(chave.equals("carteirinha")){
            busca = "Nª carteirinha: " + info;
        } else {
            busca = "asdasd";
        }

        System.out.println("-------------"+ busca);
        for (String linha : textoSeparado) {
            if (linha.contains(busca)) {
                socio = linha;
            }
        }

        if (socio != "") {
            System.out.print("Sócio encontrado: " + socio);
            resultado = true;
        } else {
            System.out.println("Sócio não encontrado");
            resultado = false;
        }
        return resultado;

    }

    public void deleteByNrCard(int numeroCarteirinha, String path, String file) throws IOException {
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, file);

        String[] textoSeparado = conteudo.split(";");
        ArrayList<String> newContentFile = new ArrayList<String>();

        String nrCart = String.valueOf(numeroCarteirinha);
        boolean encontrado = false;
        for (String line : textoSeparado) {
            if (!line.contains(" Nª carteirinha: " + nrCart) && line.contains("Nome") ) {
                newContentFile.add(line.replaceAll("\\n",""));


            } else if(line.contains(" Nª carteirinha: " + nrCart)){
                encontrado = true;
                System.out.println("Sócio apagado com sucesso!");
            }

        }

        arquivo.delete(path, file);

        if(!encontrado){
            System.out.println("Sócio não encontrado");
        }

        for (String line : newContentFile) {
            arquivo.create(path + file, line);
        }

    }


    public void atualizaByNrCard(int numeroCarteirinha, String path, String file, String nmSocio, String cpfSocio) throws IOException {
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.read(path, file);

        String[] textoSeparado = conteudo.split(";");

        ArrayList<String> newContentFile = new ArrayList<String>();

        String nrCart = String.valueOf(numeroCarteirinha);

        for (String linha : textoSeparado) {
            if (linha.contains(" Nª carteirinha: " + nrCart)) {
                // Atualizar os dados do sócio na linha correspondente
                String novoConteudo = "Nome: " + nmSocio + " | CPF: " + cpfSocio + "| Nª carteirinha: " + numeroCarteirinha;

                newContentFile.add(novoConteudo);
            } else {
                newContentFile.add(linha);
            }
        }

        // Limpar e reescrever o arquivo
        arquivo.delete(path, file);

        for (String line : newContentFile) {
            arquivo.create(path + file, line);
        }

        System.out.println("Sócio atualizado com sucesso!");
    }


}


