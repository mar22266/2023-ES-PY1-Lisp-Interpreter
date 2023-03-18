public class Lisp {

    Operaciones arimetricas = new Operaciones();
    SETQ setq = new SETQ();
    QUOTE quote = new QUOTE();
    Predicados predicados = new Predicados();
    V_Stack<String> stack = new V_Stack<String>();
    V_Stack<String> Rstack = new V_Stack<String>();
    V_Stack<String> Cstack = new V_Stack<String>();
    //falta funciones


    /**
     * Metodo que se encarga de verificar si cumple la sintaxis de Lisp
     * @param Line lo que se ingresara
     */
    public void Verify (String Line){
        String NewLine = Line.replace("(", "");
        NewLine = NewLine.replace(")", "");
        String[] words = NewLine.split(" ");
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
    }

    //falta funcion clase
    public String Rparameter(String NombreFunc) {
return null;
    }
    public void Translate(String request){
        Verify(request);

        boolean rec = false;
        boolean cond = false;
        String ValorFunc = "";
        String NombreFunc = "";
        int cont = -1;
        int cont2 = -2;
        boolean flag = false;

        while (flag == false){
            /**
             * Verifica si es un QUOTE
             */
            char[] chars = request.toCharArray();
            char character = chars[0];
            String code = Character.toString(character);
        }

        if(rec && cond == true){
            stack = Rstack;
        }
        if (cond == false && rec == true){
           // String parameter
            //falta funcion clase
        }
    }

}
