package com.algoritmos;

public class PilaImpl implements Pila{
    int size = 0;
    Nodo nodoInicio = null;

    public class Nodo {
        String proceso;
        Nodo nodoSiguiente;    
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(String proceso) {
        Nodo nodoAntiguo = nodoInicio;
        nodoInicio = new Nodo();
        nodoInicio.proceso = proceso;
        nodoInicio.nodoSiguiente = nodoAntiguo;
        size++;
    }

    @Override
    public String pop() {
        String proceso = nodoInicio.proceso;
        nodoInicio = nodoInicio.nodoSiguiente;
        size--;
        return proceso;
    }
    
}
