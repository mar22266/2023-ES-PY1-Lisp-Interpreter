import java.util.Vector;
public class V_Stack<I> extends Lisp implements IStack<I> {


    private Vector<I> elementos;

    /**
     * Constructor de la clase V_Stack
     */
    public V_Stack(){
        elementos = new Vector<I>();
    }

    /**
     * Metodo que agrega un elemento al Vector
     * @param item elemento a agregar
     */
    @Override
    public void push(I item) {
        elementos.add(item);
    }

    /**
     * metodo que agrega un elemento al Vector
     * @param item elemento a agregar
     */
    public boolean isInStack(String item){
        for(int i = 0; i < elementos.size(); i++){
            if(elementos.get(i).equals(item)){
                return true;
            }
        }
        return false;
    }

    /**
     * metodo que elimina el ultimo elemento del Vector
     * @return
     */
    @Override
    public I pop() {
        return elementos.remove(size()-1);
    }

    /**
     * metodo que devuelve el ultimo elemento del Vector
     * @return
     */
    @Override
    public I peek() {
        return elementos.get(size()-1);
    }

    /**
     * metodo que devuelve si esta vacio el Vector
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * metodo que elimina un elemento del Vector
     * @param item
     */
    @Override
    public void remove(I item) {
        elementos.remove(item);
    }

    /**
     * metodo que elimina el primer elemento del Vector
     */
    @Override
    public void removeFirst() {
        elementos.remove(0);
    }

    /**
     * metodo que devuelve el tamaño del Vector
     * @return
     */
    @Override
    public int size() {
        return elementos.size();
    }

    /**
     * metodo que elimina todos los elementos del Vector
     */
    @Override
    public void clear() {
        elementos.clear();
    }

    /**
     * metodo que devuelve el elemento en la posicion index
     * @param index
     * @return
     */
    @Override
    public I get(int index) {
        return elementos.get(index);
    }
}
