package com.algoritmo;

public class Main {
    public static void main(String[] args) {
        PilaIterador pilaImpl = new PilaIterador();

        pilaImpl.push("tarea1");
        pilaImpl.push("tarea2");
        pilaImpl.push("tarea3");
        pilaImpl.push("tarea4");
        pilaImpl.push("tarea5");
        System.out.println(pilaImpl.iterator());

        for (String string : pilaImpl) {
            System.out.println(string);
        }
    }
}