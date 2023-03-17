import java.util.ArrayList;

public class A_Stack<I> implements IStack<I>{


    public ArrayList<I> elementosA;

    public A_Stack(){
        elementosA = new ArrayList<I>();
    }
    @Override
    public void push(I item) {
        elementosA.add(item);
    }

    @Override
    public I pop() {
        return elementosA.remove(size()-1);
    }

    @Override
    public I peek() {
        return elementosA.get(size()-1);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void remove(I item) {
        elementosA.remove(item);
    }

    @Override
    public void removeFirst() {
        elementosA.remove(0);
    }

    @Override
    public int size() {
        return elementosA.size();
    }

    @Override
    public void clear() {
        elementosA.clear();
    }

    @Override
    public I get(int index) {
        return elementosA.get(index);
    }
}
