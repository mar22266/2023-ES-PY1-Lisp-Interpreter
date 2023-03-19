
public class Lisp extends Main {

    V_Stack<String> stack = new V_Stack<>();
    V_Stack<String> Rstack = new V_Stack<String>();
    V_Stack<String> Cstack = new V_Stack<String>();
    Operaciones aritmeticas = new Operaciones();
    SETQ setq = new SETQ();
    QUOTE quote = new QUOTE();
    Predicados predicados = new Predicados();
    A_Stack<Funciones> funciones = new A_Stack<>();
    

    public V_Stack<String> Cparameter(V_Stack<String> stack, String parametro, String valor) {
        V_Stack<String> valores = new V_Stack<String>();
        for(int i = 0; i< stack.size(); i++) {
            String llave = stack.get(i);
            if(llave.equals(parametro)) {
                valores.push(valor);
            } else{
                valores.push(llave);
            }
        }
        return valores;
    }
    public void VerifyCode(String linea){
        String newLine = linea.replace("(", "");
        newLine = newLine.replace(")", "");
        String[] splitting = newLine.split(" ");
        for(int i = 0; i < splitting.length; i++){
            stack.push(splitting[i]);
        }
    }

    public boolean VerifyPa(String request){
        int contadora = 0;
        int contadorc = 0;
        for(int i = 0; i < request.length(); i++){
            if(request.charAt(i) == '('){
                contadora++;
            }
            else if(request.charAt(i) == ')'){
                contadorc++;
            }
        }
        if(contadora == contadorc){
            return true;
        }
        return false;
    }

    public String VerifyFun(String name){
        for(int i = 0; i < funciones.size(); i++){
            if(name.equals(funciones.get(i).getNombre())){
                return funciones.get(i).getCodigo();
            }
        }
        return "null";
    }

    public String RFunc(String name){

        for(int i = 0; i < funciones.size(); i++){
            if(name.equals(funciones.get(i).getNombre())){
                return funciones.get(i).getCodigoCompleto();
            }
        }
        return "null";
    }

    public String Rparameter(String name){

        for(int i = 0; i < funciones.size(); i++){
            if(name.equals(funciones.get(i).getNombre())){
                return funciones.get(i).getParametro();
            }
        }

        return "null";
    }
    
    public void FlagV(String linearequest){
        stack.clear();
        String asking = "";
        String newLine = linearequest.replace("(", "( ");
        newLine = newLine.replace(")", " )");
        String[] splitting = newLine.split(" ");

        V_Stack<String> vector = new V_Stack<String>();

        for(int i = 0; i < splitting.length; i++){
            vector.push(splitting[i]);
        }
        int ContA = 0;
        int ContB = 0;
        for(int i = 0; i< vector.size(); i++) {

            String llave = vector.get(i);
            if(llave.equals("(")) {
                ContA++;
            }
            else if(llave.equals(")")){
                ContB++;
            }
            if(ContA == 5 && ContB != 5 && (llave.equals("(") == false) && (llave.equals(")") == false)){
                asking += llave;
                asking += " ";
            }
        }
        VerifyCode(asking);
    }

    public void FlagF(String linearequest){
        stack.clear();
        String asking = "";
        String newLine = linearequest.replace("(", "( ");
        newLine = newLine.replace(")", " )");
        String[] splitting = newLine.split(" ");
        V_Stack<String> vector = new V_Stack<String>();
        for(int i = 0; i < splitting.length; i++){
            vector.push(splitting[i]);
        }
        int ContA = 0;
        int ContB = 0;
        for(int i = 0; i< vector.size(); i++) {
            String llave = vector.get(i);
            if(llave.equals("(")) {
                ContA++;
            }
            else if(llave.equals(")")){
                ContB++;
            }
            if(ContA >= 6 &&ContB != 6 && (llave.equals("(") == false) && (llave.equals(")") == false)){
                asking += llave;
                asking += " ";
            }
        }
        VerifyCode(asking);
    }

    public boolean IsNum(String item) {
        try {
            int valor = Integer.parseInt(item);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public void Translate(String request){
        VerifyCode(request);
        String name = "";
        String value = "";
        int contadorA = -1;
        int contadorB = -2;
        boolean rec = false;
        boolean condi = true;
        boolean flag = false;
        while(flag == false){


            char[] characters = request.toCharArray();
            char character = characters[0];
            String sign = Character.toString(character);


            if(rec && condi == true){
                stack = Cstack;
            }

            if(rec == true && condi == false){
                String parametro = Rparameter(name);
                String valor = String.valueOf(contadorA);
                stack = Cparameter(stack, parametro, valor);
                int canti = 0;
                V_Stack<String> valores = new V_Stack<>();
                int position = -5;
                for(int i = 0; i < stack.size(); i++) {
                    String llave = stack.get(i);

                    if(llave.equals(name)) {
                        valores.push(Rstack.get(canti));
                        position = i;
                        canti++;
                    }

                    if(i != (position + 1) && i != (position + 2) && i != (position + 3) && i != position){
                        valores.push(llave);
                    }

                }
                stack = valores;
            }
            String code = stack.get(0);

            if(code.equals("-") || code.equals("+") || code.equals("*") || code.equals("/")){

                stack = setq.buscar(stack);
                String expresion = "";
                for(int i = 0; i < stack.size(); i++){
                    expresion += stack.get(i);
                    expresion += " ";
                }

                if(expresion.contains(" ")) {
                    String resultado = aritmeticas.Calc(expresion);
                    if(rec){
                        Rstack.removeFirst();
                        Rstack.push(resultado);
                        condi = true;
                        if(contadorA == contadorB){
                            System.out.println(resultado);
                        }
                    }
                    else if(!rec){
                        System.out.println(resultado);
                    }
                    flag = true;
                }
                else {
                    String resultado = aritmeticas.Operando(expresion);

                    if(rec){
                        Rstack.removeFirst();
                        Rstack.push(resultado);
                        condi = true;
                        if(contadorA == contadorB){
                            System.out.println(resultado);
                        }
                    }
                    else if(!rec){
                        System.out.println(resultado);
                    }
                    flag = true;
                }
            }

            else if(code.equalsIgnoreCase("Setq")){

                if(stack.size() > 3){
                    System.out.println("ERROR");
                }
                else{
                    setq.agregar(stack.get(1), stack.get(2));
                }
                flag = true;
            }

            else if(code.equals("defun")){

                String RFunc = request;

                if(!(stack.size() >= 4)){
                    System.out.println("ERROR");
                }
                else{
                    String expresion = "";
                    for(int i = 3; i < stack.size(); i++){
                        expresion += stack.get(i);
                        expresion += " ";
                    }

                    Funciones nuevaFuncion = new Funciones(stack.get(1), stack.get(2), expresion, RFunc);

                    funciones.push(nuevaFuncion);
                }

                flag = true;
            }

            else if(sign.equals("'")){

                char[] charac = request.toCharArray();

                String expresion = "";
                for (char c : charac) {
                    String caracter = Character.toString(c);
                    if(!caracter.equals("'")){
                        expresion += c;
                    }
                }

                quote.ReturnQuote(expresion);
                flag = true;
            }

            else if(code.equalsIgnoreCase("Quote")){

                String expresion = "";
                String newLine = request.replace("(", "( ");
                newLine = newLine.replace(")", " )");
                String[] splitting = newLine.split(" ");
                for(int i = 0; i < splitting.length; i++){
                    if(!splitting[i].equalsIgnoreCase("QUOTE") && i != 0 && i != splitting.length - 1){
                        expresion += splitting[i];
                        expresion += " ";
                    }
                }

                quote.ReturnQuote(expresion);
                flag = true;
            }

            else if(code.equalsIgnoreCase("cond")){

                if(rec){
                    String parametro = Rparameter(name);
                    stack = Cparameter(stack, parametro, String.valueOf(contadorA));
                }
                stack = setq.buscar(stack);

                String expresion = "";
                for(int i = 1; i <= 3; i++){
                    expresion += stack.get(i);
                    expresion += " ";
                }

                String respuesta = predicados.Procesador(expresion);

                if(stack.size() == 4){
                    System.out.println(respuesta);
                    flag = true;
                }
                else{
                    if(respuesta.equals("true")){
                        FlagV(RFunc(name));
                        if(stack.size() == 1){
                            String respuestafinal = stack.get(0);
                            if(IsNum(respuestafinal)){
                                if(rec){
                                    if(contadorB == contadorA){
                                        System.out.println(respuestafinal);
                                    }
                                    Rstack.push(respuestafinal);
                                    flag = true;
                                }
                                else{
                                    System.out.println(respuestafinal);
                                    flag = true;
                                }
                            }
                            else{
                                if(respuestafinal.equals(Rparameter(name))){
                                    if(rec){
                                        if(contadorA == contadorB){
                                            System.out.println(contadorA);
                                        }
                                        Rstack.push(String.valueOf(contadorA));
                                        flag = true;
                                    }
                                    else{
                                        System.out.println(value);
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                    else if(respuesta.equals("false")){
                        FlagF(RFunc(name));
                        condi = false;
                    }
                }
            }

            else if(code.equalsIgnoreCase("list")){

                String expresion = "";
                for(int i = 0; i < stack.size(); i++){
                    expresion += stack.get(i);
                    expresion += " ";
                }

                String respuesta = predicados.Procesador(expresion);
                System.out.println(respuesta);
                flag = true;
            }

            else if(code.equalsIgnoreCase("atom")){

                String expresion = "";
                for(int i = 0; i < stack.size(); i++){
                    expresion += stack.get(i);
                    expresion += " ";
                }

                String respuesta = predicados.Procesador(expresion);
                System.out.println(respuesta);
                flag = true;
            }

            else if(setq.foundValue(code)){
                stack = setq.buscar(stack);
                String expresion = "";
                for(int i = 0; i < stack.size(); i++){
                    expresion += stack.get(i);
                    expresion += " ";
                }
                System.out.println(expresion);
                flag = true;
            }
            else if(!VerifyFun(code).equals("null")){
                name = code;
                String valor = stack.get(1);
                value = valor;
                String asking = VerifyFun(code);
                stack.clear();
                VerifyCode(asking);
                if(!stack.isInStack(name)){
                    String parametro = Rparameter(code);
                    stack = Cparameter(stack, parametro, valor);
                }
                else{
                    rec = true;
                    Cstack = stack;
                    contadorB = Integer.parseInt(valor);
                }
            }
            else{
                System.out.println("ERROR");
                flag = true;
            }

            if(rec && (contadorB != contadorA) && (contadorB != -2)){
                flag = false;
            }

            if(rec && (contadorB != contadorA) && (contadorB != -2) && condi == true){

                contadorA++;
            }
        }
        stack.clear();
        Rstack.clear();
        Cstack.clear();
    }


}