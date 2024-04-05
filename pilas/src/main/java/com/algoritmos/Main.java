package com.algoritmos;

public class Main {
    public static void main(String[] args) {
        Pila pilaProcesos = new PilaImpl();

        pilaProcesos.push("mariadb");
        pilaProcesos.push("bluetooth");

        System.err.println(pilaProcesos.isEmpty());
        System.out.println(pilaProcesos.pop());
        System.out.println(pilaProcesos.pop());
        System.err.println(pilaProcesos.isEmpty());
        


    }
}