package main.io;
import java.io.*;
import java.util.Scanner;

/**
 * Responsável por manipular os arquivos de texto*
 **/
public class Arquivo {

    public void create(String path, String content) throws IOException {
        FileWriter escritor = new FileWriter(path, true);
        escritor.write(content);
        escritor.write("; \n");
        escritor.close();
    }


    public String read(String path, String file) {

        //Abrir arquivo e imprimir cada uma das linhas
        File leitor = new File(path + file);

        Scanner sc = null;
        String conteudo = "";
        try {
            sc = new Scanner(leitor);
            while (sc.hasNextLine()) {
                conteudo += sc.nextLine();
                conteudo += "\n";
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            if (sc != null) {
                sc.close();
            }
        }


        return conteudo;

    }

    public void delete(String path, String file) {
        File myObj = new File(path + file);
        if (!myObj.delete()) {

            System.out.println("Falha em apagar o arquivo");
        }

    }
}
