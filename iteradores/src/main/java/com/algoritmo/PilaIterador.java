package com.algoritmo;

import java.util.Iterator;

public class PilaIterador implements Iterable<String>, Pila{

    private int numItems;
    private Node head;

    public class Node {
        String item;
        Node nextNode;
    }

    public class PilaIterador2 implements Iterator<String>{

        @Override
        public boolean hasNext() {
           return head != null;
        }

        @Override
        public String next() {
            String item = head.item;
            head = head.nextNode;
            return item;
        }
        
    }

    @Override
    public void push(String string) {
        Node nodePrev = this.head;
        this.head = new Node();
        this.head.item = string;
        this.head.nextNode = nodePrev;
        this.numItems++;
    }

    @Override
    public String pop() {
        Node delNode = this.head;
        this.head = delNode.nextNode;
        numItems--;
        return delNode.item;
    }

    @Override
    public boolean isNull() {
        return this.head == null;
    }

    @Override
    public int numItems() {
        return numItems;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new PilaIterador2();
    }
    
}


