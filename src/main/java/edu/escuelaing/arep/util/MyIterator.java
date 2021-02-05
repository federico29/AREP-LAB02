package edu.escuelaing.arep.util;

import java.util.Iterator;

/**
 * Un iterador sobre una colección de tipo MyArrayList, genera los elementos
 * consecutivos de la lista uno a la vez.
 * @author Federico Barrios Meneses
 */

public class MyIterator<E> implements Iterator<E>{
    private Node<E> currentNode = null;
    
    /**
     * Constructor de un iterador.
     * @param list La lista sobre la cual se hara el iterador.
     */
    public MyIterator(MyLinkedList<E> list) { 
        this.currentNode = list.getHead();
    }
    
    /**
     * Retorna true si la iteración tiene más elementos, en otras palabras,
     * retorna true si next() retorna un elemento diferente a null.
     * @return true si la iteración tiene más elementos.
     */
    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    /**
     * Retorna el elemento siguiente en la iteración.
     * @return El elemento siguiente en la iteración.
     */
    @Override
    public E next() {
        E data = currentNode.getValue(); 
        currentNode = currentNode.getNextNode(); 
        return data; 
    }
}