package edu.escuelaing.arep.util;

/**
 * La clase Node funciona como contenedor para un solo objeto dentro de un
 * arreglo, tiene un valor y hace referencia al nodo siguiente dentro del mismo
 * arreglo.
 *
 * @author Federico Barrios Meneses
 */
public class Node<E> {

    private final E value;
    private Node<E> nextNode = null;

    /**
     * Construye un nodo con el valor dado.
     *
     * @param value El valor dado al nodo.
     */
    public Node(E value) {
        this.value = value;
    }

    /**
     * Retorna el valor del nodo.
     *
     * @return El valor del nodo.
     */
    public E getValue() {
        return this.value;
    }

    /**
     * Retorna la instancia del nodo siguiente.
     *
     * @return El nodo siguiente.
     */
    public Node<E> getNextNode() {
        return this.nextNode;
    }

    /**
     * Se referencia al nodo siguiente en el arreglo.
     *
     * @param nextNode El nodo siguiente en el arreglo.
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
