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


    Lisp lisp = new Lisp();
    Scanner sc = new Scanner(System.in);
    System.out.println("BIENVENIDO A LISP");
    System.out.println("Ingrese EXIT para salir");
    boolean flag = false;
    while (flag == false) {
        String code = "";
        Boolean flag2 = false;
        System.out.println("--");
        while (flag2 == false) {
            code += sc.nextLine();
            flag2 = lisp.VerifyPa(code);
            if (!flag2) {
                code += " ";
            }
        }
        if (code.equalsIgnoreCase("EXIT")){
            flag = true;
        }
        else {
            lisp.Translate(code);
        }
    }
}




}