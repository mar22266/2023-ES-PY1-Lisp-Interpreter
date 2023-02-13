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

    public List<String> elementos;

    public Stack () {
        this.elementos = new ArrayList<>();
    }

    public String pop() {
        return elementos.remove(0);
    }

    public void push(String item) {
        elementos.add(item);
    }

    public String peek() {
        return elementos.get(0);
    }

    public boolean empty() {
        return (elementos.size() == 0);
    }


}
