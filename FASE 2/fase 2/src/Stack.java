import java.util.List;
import java.util.ArrayList;

/**
 * FASE 2 PROYECTO 1
 * ALGORITMOS Y ESTRUCTURA DE DATOS
 * ANDRE MARROQUIN
 * ANDY FUENTES
 * GABRILE PAZ
 */
public class Stack<String> {

   ArrayList<String> elementos = new ArrayList<String>();

    public Stack () {
        this.elementos = new ArrayList<>();
    }

    public String pop() {
        return elementos.remove(elementos.size()-1);
    }

    public void push(String item) {
        elementos.add(item);
    }

    public int size() {
        return elementos.size();
    }


    public String peek() {
        int dat = elementos.size();
        return elementos.get(dat-1);
    }

    public boolean empty() {
        if (this.elementos.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }


}
