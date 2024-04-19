package com.algoritmos;

public class Main {
    public static void main(String[] args) {
        // === PRUEBA DE IMPLEMENTACION DE UNA PILA CON LISTAS ENLAZADAS ===
        /*Pila pilaProcesos = new PilaImpl();

        pilaProcesos.push("mariadb");
        pilaProcesos.push("bluetooth");

        System.err.println(pilaProcesos.isEmpty());
        System.out.println(pilaProcesos.pop());
        System.out.println(pilaProcesos.pop());
        System.err.println(pilaProcesos.isEmpty());*/

        // === PRUEBA DE IMPLEMENTACION DE UNA PILA CON UN ARRAY ===
        /*PilaArrayImpl pilaArrayImpl = new PilaArrayImpl(10);
        pilaArrayImpl.push("hola");
        pilaArrayImpl.push("soy");
        pilaArrayImpl.push("el");
        pilaArrayImpl.push("mejor");
        System.out.println(pilaArrayImpl.elements());
        int a = 4;
        System.out.println(--a);
        System.out.println(--a);
       System.out.println( pilaArrayImpl.isEmpty());
        System.out.println(pilaArrayImpl.pop());
        System.out.println(pilaArrayImpl.pop());
        System.out.println(pilaArrayImpl.pop());
        System.out.println(pilaArrayImpl.pop());*/

        // =========== PRUEBA DE IMPLEMENTACION DE UNA PILA CON LISTAS ENLAZADAS ================
        ColaImpl cola =new ColaImpl();
        cola.enQueue("hola");
        cola.enQueue("mundo");

        System.out.println(cola.deQueue());
        


    }
}