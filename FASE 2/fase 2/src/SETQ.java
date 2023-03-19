import java.util.HashMap;

public class SETQ extends Lisp {

    /**
     * @param args HashMap que almacena las variables y sus valores
     */
    HashMap<String, String> mapa;

    /**
     * Constructor de la clase SETQ
     */
    public SETQ(){
        mapa = new HashMap<>();
    }

    /**
     * Metodo que agrega una variable y su valor al HashMap
     * @param key variable
     * @param value valor de la variable
     */
    public void agregar(String key, String value){
        if (mapa.containsKey(key)){
            mapa.remove(key);
            mapa.put(key, value);
        }else{
            mapa.put(key, value);
        }
    }

    /**
     * Metodo que busca una variable en el HashMap
     * @param key variable a buscar
     * @return true si la variable existe, false si no existe
     */
    public boolean foundValue(String key){
        if (mapa.containsKey(key)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Metodo que busca una variable en el HashMap
     * @param key variable a buscar
     * @return el valor de la variable
     */
    public V_Stack<String> buscar(V_Stack<String> stack) {
        V_Stack<String> values = new V_Stack<String>();
        String key = "";
        for(int i = 0; i < stack.size(); i++){
            key = stack.get(i);
            if (mapa.containsKey(key)){
                values.push(mapa.get(key));
            }else{
                values.push(key);
            }
        }
        return values;
    }
}
