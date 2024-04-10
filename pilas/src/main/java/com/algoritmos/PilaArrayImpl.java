package com.algoritmos;


public class PilaArrayImpl implements Pila{

    private Object[] arrayObjetos;
    private int head;

    public PilaArrayImpl() {
    }

    public PilaArrayImpl(Integer ancho) {
        this.arrayObjetos = new Object[ancho];
        this.head = 0;
    }

    @Override
    public boolean isEmpty() {
        return arrayObjetos[0] == null;
    }

    @Override
    public void push(String proceso) {
        //cuando por ejemplo se ingresa 1 y ya no se quieren ingresar mas elementos el head estara con valor 2
        //asi se veria cuando ingresemos un array [elemento ingresado, null] <- es null ya que el head avanzo una vez que se ingreso un elemento
        arrayObjetos[head++]=proceso;
    }

    @Override
    public String pop() {
        // con la explicacion anterior el head debe decrementarse previamente o nos mostrara un elemento nullz
        Object objeto = arrayObjetos[--head];
        //arrayObjetos[head--] = null;
        return (String)objeto;
    }

    public int elements(){
        return head;
    }

}
