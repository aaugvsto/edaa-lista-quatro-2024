package org.app;

import org.app.Entities.Pessoa;

import java.util.ArrayList;
import java.util.List;



public class Atividades {

    public static void Atividade1e2e3e4(){
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74, 32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52, 25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19, 33, 21, 57, 19, 55, 93, 31, 54, 31, 50, 66, 44, 54, 55, 29, 75, 43, 88, 61, 65, 49, 87, 10, 25, 33, 70, 84, 125, 345, 400, 77, 32, 41, 66, 33, 70, 84, 125, 600, 38, 43, 51, 34, 76, 25, 48, 14, 50, 71, 1, 98, 86, 38, 91, 65, 96, 60, 43, 75, 86, 59, 17, 86, 12, 10, 16, 10, 33, 15, 77, 22, 56, 4, 9, 63, 49, 80, 39, 53, 97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };
        int[] numerosParaBusca = { 55, 600, 56, 65 };

        for(int i = 0; i < numerosParaBusca.length - 1; i++){
            for (int j = 0; j < listaNumeros.length - 1; j++){
                if(numerosParaBusca[i] == listaNumeros[j]){
                    System.out.println("Indice do número: " + numerosParaBusca[i] + " é " + j);
                }
            }
        }
    }

    public static void Atividade5(){
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74, 32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52, 25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19, 33, 21, 57, 19, 55, 93, 31, 54, 31, 50, 66, 44, 54, 55, 29, 75, 43, 88, 61, 65, 49, 87, 10, 25, 33, 70, 84, 125, 345, 400, 77, 32, 41, 66, 33, 70, 84, 125, 600, 38, 43, 51, 34, 76, 25, 48, 14, 50, 71, 1, 98, 86, 38, 91, 65, 96, 60, 43, 75, 86, 59, 17, 86, 12, 10, 16, 10, 33, 15, 77, 22, 56, 4, 9, 63, 49, 80, 39, 53, 97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };
        int numeroParaBusca = 65;
        List<Integer> indicesNumeroBusca = new ArrayList<Integer>();

        for (int i = 0; i < listaNumeros.length - 1; i++){
            if(listaNumeros[i] == numeroParaBusca){
                indicesNumeroBusca.add(i);
            }
        }

        System.out.println("Os indices para o número " + numeroParaBusca + " são:" + indicesNumeroBusca.toString().replace('[', ' ').replace(']', ' '));
    }

    public static void Atividade6e7e8(){

        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);

        Pessoa[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

        for (Pessoa pessoa : listaPessoas) {

            switch (pessoa.getIdade()){
                case 100:
                    System.out.println("A pessoa com nome: " + pessoa.getNome() + "tem 100 anos!");
                    break;
                case 30:
                    System.out.println("A pessoa com nome: " + pessoa.getNome() + "tem 30 anos!");
                    break;
                case 18:
                    System.out.println("A pessoa com nome: " + pessoa.getNome() + "tem 18 anos!");
                    break;
            }

        }
    }

    public static void Atividade9Iterador(){
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        int numeroBusca = 99;
        int indiceInicio = 0;
        int indiceFinal = listaNumeros.length - 1;
        boolean encontrou = false;

        while(indiceInicio <= indiceFinal){
            int indiceMeio = (indiceInicio + indiceFinal) / 2;

            if(listaNumeros[indiceMeio] == numeroBusca){
                encontrou = true;
                System.out.println("Incide de numero é: " + indiceMeio);
                break;
            }

            if(listaNumeros[indiceMeio] < numeroBusca)
                indiceInicio = indiceMeio + 1;
            else
                indiceFinal = indiceMeio - 1;

        }

        if(!encontrou)
            System.out.println("Incide do número " + numeroBusca + " não foi encontrado.");
    }

    public void Atividade9Recursivo(){
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        int numeroBusca = 99;
        int indiceInicio = 0;
        int indiceFinal = listaNumeros.length - 1;
        boolean encontrou = false;

        long start = System.currentTimeMillis();
        int indice = this.BuscaBinariaRecursiva(listaNumeros, numeroBusca, indiceInicio, indiceFinal);
        long end = System.currentTimeMillis() - start;

        if(indice >= 0){
            System.out.println("Incide do número " + numeroBusca + " é: " + indice);
            System.out.println("Executado em: " + end / 1000);
            return;
        }

        System.out.println("Incide do número " + numeroBusca + " não foi encontrado.");
        System.out.println("Executado em: " + end);
    }

    private int BuscaBinariaRecursiva(int[] array, int key, int left, int rigth){
        if(left <= rigth){
            int mid = left + (rigth - left) / 2;

            if(array[mid] == key)
                return mid;

            if(array[mid] < key)
                return BuscaBinariaRecursiva(array, key, mid + 1, rigth);


            return BuscaBinariaRecursiva(array, key, mid + 1, rigth);
        }

        return  -1;
    }

}
