package edu.escuelaing.arep.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implementación redimensionable de la interfaz List. Implementa 5 de todas las
 * operaciones opcionales de dicha interfaz, que son indispensables para su
 * funcionamiento.
 * @author Federico Barrios Meneses
 */
public class MyLinkedList<E> implements List<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private Integer size = 0;

    /**
     * Inserta el elemento específico en la última posición de la lista.
     * @param e Elemeto a insertar.
     * @return True.
     */
    @Override
    public boolean add(E e) {
        Node node = new Node(e);
        if (this.size == 0){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.setNextNode(node);
            this.tail = node;
        }
        this.size = this.size + 1;
        return true;
    }

    /**
     * Retorna la referencia al primer elemnto de esta lista.
     * @return El primer elemento de la lista.
     */
    public Node<E> getHead(){
        return this.head;
    }
    
    /**
     * Retorna la referencia al último elemnto de esta lista.
     * @return El último elemento de la lista.
     */
    public Node<E> getTail(){
        return this.tail;
    }
    
    /**
     * Retorna el número de elementos en esta lista.
     * @return El número de elementos en la lista.
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Retorna true si la lista no tiene elementos.
     * @return true si la lista no tiene elementos.
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    /**
     * Retorna un iterador sobre los elementos de la lista en orden apropiado.
     * @return Un iterador sobre los elementos de la lista en orden apropiado.
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>(this);
    }
    
    /**
     * Retorna una representación en cadela de esta lista.
     * @return Una representación en cadela de esta lista.
     */
    @Override
    public String toString(){
        MyIterator<E> iterator = new MyIterator<E>(this);
        String linkedList = "[";
        for (int i = 0; i < this.size; i++){
            if (i != this.size -1){
                linkedList = linkedList + iterator.next()+", ";
            }else{
                linkedList = linkedList + iterator.next()+"]";
            }
        }
        return linkedList;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}