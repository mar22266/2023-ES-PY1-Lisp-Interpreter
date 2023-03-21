public class Predicados {

    /**
     * metodo que devuelve si es un predicado atom
     * @param request
     * @return el tipo de operacion dependiendo lo que el usuario escriba como predicado
     */
    public String Procesador(String request) {

        String ask = "";
        /**
         * variables que se usan para saber que tipo de predicado
         * es el que el usuario ingreso
         * @param request
         * @return
         */
        boolean atom = false;
        boolean equal = false;
        boolean GreaterThan = false;
        boolean LessThan = false;
        boolean list = false;

        /**
         * se eliminan los espacios en blanco
         * @param request
         */
        String[] avoidBlank = request.split(" ");
        String AfterBlank = "";

        /**
         * se une el array de String
         * @param request
         */
        AfterBlank = String.join(" ", avoidBlank);

        /**
         * se obtiene la primera letra del predicado
         * @param request
         */
        String firstLetter = AfterBlank.substring(0, 1);

        /**
         * se verifica que tipo de predicado es
         *  @param request
         */
        if (firstLetter.equalsIgnoreCase("a")) {
            atom = true;
        }
        if (firstLetter.equalsIgnoreCase("e")) {
            equal = true;
        }
        if (firstLetter.equalsIgnoreCase(">")) {
            GreaterThan = true;
        }
        if (firstLetter.equalsIgnoreCase("<")) {
            LessThan = true;
        }
        if (firstLetter.equalsIgnoreCase("l")) {
            list = true;
        }
        if (firstLetter.equalsIgnoreCase("=")) {
            equal = true;
        }

        /**
         * se verifica que tipo de predicado es y se hace la operacion correspondiente
         * operacion atom
         * @param request
         */
        if(atom == true){
            String[] atomSplit = AfterBlank.split(" ");
            if(atomSplit.length <= 2){
                ask = "VERDADERO";
            }else{
                ask = "FALSO";
            }
        }
        /**
         * se verifica que tipo de predicado es y se hace la operacion correspondiente
         * operacion equal
         * @param request
         */
        if(equal == true){
            String[] equalSplit = AfterBlank.split(" ");
            if(equalSplit.length<=2){
                System.out.println("Tienen que haber mas paramteros");
            }
            else{
                if(equalSplit[1].equalsIgnoreCase(equalSplit[2])){
                    ask = "VERDADERO";
            }
            else{
                ask = "FALSO";
            }
            }
        }
        /**
         * se verifica que tipo de predicado es y se hace la operacion correspondiente
         * operacion greater than\
         * @param request
         */
        if(GreaterThan == true){
            String[] GreaterThanSplit = AfterBlank.split(" ");
            if(GreaterThanSplit.length<=2){
                System.out.println("Tienen que haber mas paramteros");
            }
            else{
                int FirstDigit = Integer.parseInt(GreaterThanSplit[1]);
                int SecondDigit = Integer.parseInt(GreaterThanSplit[2]);

                if(FirstDigit > SecondDigit){
                    ask = "VERDADERO";
                }
                else{
                    ask = "FALSO";
                }
            }
        }
        /**
         * se verifica que tipo de predicado es y se hace la operacion correspondiente
         * operacion lessthan
         */
        if(LessThan == true){
            String[] LessThanSplit = AfterBlank.split(" ");
            if(LessThanSplit.length<=2){
                System.out.println("Tienen que haber mas paramteros");
            }
            else{
                int FirstDigit = Integer.parseInt(LessThanSplit[1]);
                int SecondDigit = Integer.parseInt(LessThanSplit[2]);

                if(FirstDigit < SecondDigit){
                    ask = "VERDADERO";
                }
                else{
                    ask = "FALSO";
                }
            }
        }

        /**
         * se verifica que tipo de predicado es y se hace la operacion correspondiente
         * operacion list
         * @param request
         * @return
         */
        if(list==true){
            System.out.print("[");

            for (int i = 1; i <= (avoidBlank.length - 1); i++) {
                if (i < (avoidBlank.length - 1)) {
                    System.out.print(avoidBlank[i] + ", ");

                } else {
                    System.out.print(avoidBlank[i]);
                }
            }

            System.out.print("]");
        }


    return ask;
    }
}
