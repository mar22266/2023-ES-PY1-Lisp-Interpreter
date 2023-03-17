import java.util.Vector;
public class V_Stack<I> implements IStack<I> {

    private Vector<I> elementos;

    public V_Stack(){
        elementos = new Vector<I>();
    }

    @Override
    public void push(I item) {
        elementos.add(item);
    }

    @Override
    public I pop() {
        return elementos.remove(size()-1);
    }

    @Override
    public I peek() {
        return elementos.get(size()-1);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void remove(I item) {
        elementos.remove(item);
    }

    @Override
    public void removeFirst() {
        elementos.remove(0);
    }

    @Override
    public int size() {
        return elementos.size();
    }

    @Override
    public void clear() {
        elementos.clear();
    }

    @Override
    public I get(int index) {
        return elementos.get(index);
    }
}
