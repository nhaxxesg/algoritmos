package com.algoritmos;

//implementacion de listas enlazadas en las colas
public class ColaImpl implements Cola {

    private Nodo cabeza;
    private Nodo cola;

    public class Nodo {
        String valor;
        Nodo siguiente;
    }

    @Override
    public boolean isEmpty() {
        return this.cabeza == null;
    }

    @Override
    public void enQueue(String valor) {
        Nodo colaAntigua = cola;
        cola = new Nodo();
        cola.valor = valor;
        cola.siguiente = null;
        if (isEmpty()) {
            cabeza = cola;
        }else{
            colaAntigua.siguiente = cola;
        }
    }

    @Override
    public String deQueue() {
        String valorCabezaEliminar = cabeza.valor;
        cabeza = cabeza.siguiente;
        return valorCabezaEliminar;
    }

}
