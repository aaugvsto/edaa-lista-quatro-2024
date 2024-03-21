package org.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade 1, 2,3 e 4");
        Atividades.Atividade1e2e3e4();

        System.out.println("Atividade 5");
        Atividades.Atividade5();

        System.out.println("Atividade 6,7 e 8");
        Atividades.Atividade6e7e8();

        System.out.println("Atividade 9");
        Atividades.Atividade9Iterador();

        System.out.println("Atividade 9 - Recursiva");
        Atividades atividades = new Atividades();
        atividades.Atividade9Recursivo();
    }
}