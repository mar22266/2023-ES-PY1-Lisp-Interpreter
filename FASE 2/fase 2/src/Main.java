import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * FASE 2 PROYECTO 1
 * ALGORITMOS Y ESTRUCTURA DE DATOS
 * ANDRE MARROQUIN
 * ANDY FUENTES
 * GABRILE PAZ
 */
public class Main {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n------Bienvenido al interprete de LISP------\n");
        String menu = "1. Calculadora arimetrica \n2. Funciones Fib,Fac,Ftoc \n3. Salir";
        System.out.println(menu);
        System.out.println("Ingrese una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            /**
             * Calculadora arimetrica
             */
            case 1:
                try {
                    /**
                     * Se lee el archivo arimetrica.txt
                     */
                    BufferedReader reader = new BufferedReader(new FileReader("arimetrica.txt"));
                    String line;
                    int cont = 1;
                    System.out.println("\nEstas son las operaciones que se realizaran con su respectivo resultado:\n");
                    while ((line = reader.readLine()) != null) {
                        Transformador TR = new Transformador(line);
                        double result = TR.evaluate();
                        System.out.println("Operacion: "+ cont+"\t"+ line + " = " + result);
                        cont++;
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
                break;


            case 2:
                /**
                 * Funciones Fib,Fac,Ftoc
                 */
                System.out.println("Ingrese una expresión en el formato '(factorial n)': ");
                String input = sc.nextLine();
                Tokenizer tokenizer = new Tokenizer(input);
                tokenizer.calculateFactorial();
                break;
            case 3:
                /**
                 * Salir
                 */
                System.out.println("Gracias por usar el programa");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}