public class Operaciones extends Lisp {

    public String Operando(String expresion) {
        V_Stack<Double> stack = new V_Stack<Double>();
        String resultado = "";
        String pre = expresion.replace("(", "");
        pre = pre.replace(")", "");
        for(int i = pre.length() -1; i >= 0; i--) {
            String aString = Character.toString(pre.charAt(i));
            try
            {

                stack.push(Double.parseDouble(aString));
            }
            catch (Exception e)
            {
                double x = 0;
                double y = 0;

                try {
                    x = stack.pop();
                    y = stack.pop();
                } catch (Exception exception) {
                    return "ERROR";
                }

                if(aString.equals("+")) {

                    double suma = x + y;
                    stack.push(suma);
                } if(aString.equals("*")) {

                double mul = x * y;
                stack.push(mul);

            } if(aString.equals("-")) {

                double resta = x - y;
                stack.push(resta);

            } if(aString.equals("/")) {

                double Div = x / y;
                stack.push(Div);

            }
            else{
                return "ERROR";
            }

            }
        }

        double peek = stack.peek();
        resultado = Double.toString(peek);
        return resultado;
    }

    public String Calc(String expresion) {

        V_Stack<Double> stack = new V_Stack<Double>();
        String resp = "";


        String pre = expresion.replace("(", "");
        pre = pre.replace(")", "");


        String[] lista = pre.split(" ");

        for(int i = lista.length -1; i >= 0; i--) {

            String aString = lista[i];

            try
            {
                stack.push(Double.parseDouble(aString));
            }
            catch (Exception e)
            {
                double x = 0;
                double y = 0;
                try {
                    x = stack.pop();
                    y = stack.pop();
                } catch (Exception exception) {
                    return "ERROR";
                }

                if(aString.equals("+")) {

                    double suma = x + y;
                    stack.push(suma);
                } if(aString.equals("*")) {

                double mul = x * y;
                stack.push(mul);

            } if(aString.equals("-")) {

                double resta = x - y;
                stack.push(resta);

            } if(aString.equals("/")) {

                double Div = x / y;
                stack.push(Div);
            }
            }
        }

        double peek = stack.peek();
        resp = Double.toString(peek);
        return resp;
    }

}