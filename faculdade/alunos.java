package faculdade;

import java.util.ArrayList; // Importação da Biblioteca ArrayList

public class alunos {

    public static void main (String[] args){
        ArrayList<String> alunos = new ArrayList<String>();// Criaçao do ArrayList

        alunos.add("Alexandre");
        alunos.add("Amanda");
        alunos.add("Aloísio");
        alunos.add("Alonso");
        alunos.add("Adriano");
        alunos.add("Adriana");
        alunos.add("Alisson");
        alunos.add("Alex");
        alunos.add("Alexia");
        alunos.add("Arthur");
        alunos.add("Alice");
        alunos.add("Alberto");
        alunos.add("Alessandra"); //Quantidade de dados inicial = 25 alunos
        alunos.add("Alvina");
        alunos.add("Bruno");
        alunos.add("Bárbara");
        alunos.add("Belisa");
        alunos.add("Betânia");
        alunos.add("Betina");
        alunos.add("Bruna");
        alunos.add("Carlos");
        alunos.add("Caique");
        alunos.add("César");
        alunos.add("Diego");
        alunos.add("Edson");

        System.out.println(alunos); //Imprime os dados contidos no ArrayList

        System.out.println(alunos.size());// Imprime o tamanho  do ArrayList

        System.out.println(alunos.toArray().length); //Imprime a capacidade do ArrayList



    }
}