package com.algoritmos;

public class Main {
    public static void main(String[] args) {
        Nodo primerNodo = null;
        Nodo nodofinal = null;
        primerNodo = new Nodo();
        primerNodo.cadena = "pelar papa";
        Nodo nodo2 = new Nodo();
        nodo2.cadena = "ver tele";
        primerNodo.siguiente = nodo2;
        Nodo nodo3 = new Nodo();
        nodo3.cadena = "estudiar";
        nodo2.siguiente = nodo3;

        nodofinal = new Nodo();
        nodofinal.cadena = "barrer techo";
        nodo3.siguiente = nodofinal;

        // insertar al inicio
        Nodo primeroAntiguo = primerNodo;
        primerNodo = new Nodo();
        primerNodo.cadena = "barrer";
        primerNodo.siguiente = primeroAntiguo;

        // remover el primero
        primerNodo = primeroAntiguo;
        primeroAntiguo = null;

        //insertar un elemento al final
        Nodo nodoFinalAnterior = nodofinal;
        nodofinal = new Nodo();
        nodofinal.cadena = "pelar";
        nodoFinalAnterior.siguiente = nodofinal;

        System.out.println(nodoFinalAnterior.cadena);
        System.out.println(nodofinal.cadena);

        //recorrido con un for en una lista enlazada    
        for(Nodo i = primerNodo ; i != null; i = i.siguiente){
            System.out.println(i.cadena+"\n");
        }

        

    }
}