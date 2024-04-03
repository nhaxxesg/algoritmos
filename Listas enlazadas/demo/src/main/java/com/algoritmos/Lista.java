package com.algoritmos;

public class Lista {
    int nroNodos;
    Nodo primerNodo;
    
    public class Nodo{
        String tarea;
        Nodo nodoSiguiente;
    }

    /*
     * agregar item
     * 
    */

    public void agregarItemAlFinal(String item, Nodo nodo){
        // si el primer nodo esta vacio primero llenamos este
        if(primerNodo == null){
            primerNodo = new Nodo();
            primerNodo.tarea = item;
        }else{
            //caso base en el que el nodo pasado sea igual a null
            if(nodo == null){
                nodo = new Nodo();
                nodo.tarea = item;
            }else{//caso recursivo donde si el nodo que se paso no sea null
                agregarItemAlFinal(item, primerNodo.nodoSiguiente);
            }
        }
    }

    /*public Nodo recorrerLista(){
        if()
    }*/



}
