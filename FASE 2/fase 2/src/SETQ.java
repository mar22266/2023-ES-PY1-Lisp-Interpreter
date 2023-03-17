import java.util.HashMap;

public class SETQ {

    HashMap<String, String> mapa;

    public SETQ(){
        mapa = new HashMap<>();
    }

    public void agregar(String key, String value){
        if (mapa.containsKey(key)){
            mapa.remove(key);
            mapa.put(key, value);
        }else{
            mapa.put(key, value);
        }
    }

    public boolean foundValue(String key){
        if (mapa.containsKey(key)){
            return true;
        }else{
            return false;
        }
    }
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
