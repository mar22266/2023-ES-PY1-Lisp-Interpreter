public interface IStack<I> {

    /**
     * Agrega un elemento al final de la pila.
     * @param item el elemento a agregar.
     */
    void push(I item);

    /**
     * Elimina el último elemento de la pila.
     * @return el elemento eliminado.
     */
    public I pop();
    /**
     * Devuelve el último elemento de la pila.
     * @return el último elemento de la pila.
     */
    public I peek();
    /**
     * Devuelve el tamaño de la pila.
     * @return el tamaño de la pila.
     */
    public boolean isEmpty();
    /**
     * Elimina todos los elementos de la pila.
     */
    public void remove(I item);
    /**
     * Elimina el primer elemento de la pila.
     */
    public void removeFirst();

    /**
     * Devuelve el tamaño de la pila.
     * @return
     */
    public int size();
    /**
     * Elimina todos los elementos de la pila.
     */
    public void clear();

    /**
     * Devuelve el elemento en la posición index.
     * @param index la posición del elemento a devolver.
     * @return el elemento en la posición index.
     */
    public I get(int index);

}
