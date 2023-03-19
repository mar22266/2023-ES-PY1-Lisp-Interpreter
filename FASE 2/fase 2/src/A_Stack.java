import java.util.ArrayList;

public class A_Stack<I> implements IStack<I>{


    public ArrayList<I> elementosA;

    /**
     * Constructor de la clase A_Stack
     */
    public A_Stack(){
        elementosA = new ArrayList<I>();
    }
    /**
     * Metodo que agrega un elemento al ArrayList
     * @param item elemento a agregar
     */
    @Override
    public void push(I item) {
        elementosA.add(item);
    }

    /**
     * metodo que elimina el ultimo elemento del ArrayList
     * @return
     */
    @Override
    public I pop() {
        return elementosA.remove(size()-1);
    }

    /**
     * metodo que devuelve el ultimo elemento del ArrayList
     * @return
     */
    @Override
    public I peek() {
        return elementosA.get(size()-1);
    }

    /**
     * metpdo que devuelve si esta vacio el ArrayList
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * metodo que elimina un elemento del ArrayList
     * @param item
     */
    @Override
    public void remove(I item) {
        elementosA.remove(item);
    }

    /**
     * metodo que elimina el primer elemento del ArrayList
     */
    @Override
    public void removeFirst() {
        elementosA.remove(0);
    }

    /**
     * metodo que devuelve si el elemento esta en el ArrayList
     * @param item
     * @return
     */
    public boolean isInStack(String item){
        for(int i = 0; i < elementosA.size(); i++){
            if(elementosA.get(i).equals(item)){
                return true;
            }
        }
        return false;
    }
    /**
     * metodo que devuelve el tamaño del ArrayList
     * @return
     */
    @Override
    public int size() {
        return elementosA.size();
    }

    /**
     * metodo que elimina todos los elementos del ArrayList
     */
    @Override
    public void clear() {
        elementosA.clear();
    }

    /**
     * metodo que devuelve el elemento en la posicion index
     * @param index
     * @return
     */
    @Override
    public I get(int index) {
        return elementosA.get(index);
    }
}
