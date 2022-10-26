/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package group.lambda;

import java.util.Scanner;

/**
 *
 * @author David
 */
public abstract class Lambda  implements Calculadora{

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("0.salir\n1.potencia\n2.suma\n3.resta\n4.multiplicacion\n5.division\n");
        int opcion=entrada.nextInt();
        
        while (opcion >= 1 && opcion <= 5) {
            System.out.print("ingrese número 1: ");
            float num1=entrada.nextFloat();
            System.out.print("ingrese número 2: ");
            float num2=entrada.nextFloat();
            
            Calculadora ope = null;
            
            if (opcion == 1) {
                ope = (a, b) -> (float) (Math.pow(a, b));
            }
            if (opcion == 2) {
                ope = (a, b) -> (a + b);
            }
            if (opcion == 3) {
                ope = (a, b) -> (a - b);
            }
            if (opcion == 4) {
                ope = (a, b) -> (a * b);
            }
            if (opcion == 5) {
                ope = (a, b) -> (a / b);
            }
            
            float res = ope.calcular(num1, num2);
            System.out.print("\nresultado: " + res + "\n");
            
            System.out.print("\n0.salir\n1.potencia\n2.suma\n3.resta\n4.multiplicacion\n5.division\n");
            opcion=entrada.nextInt();
        }
    }
}
