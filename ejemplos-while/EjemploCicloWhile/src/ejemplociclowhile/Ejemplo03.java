/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextInt();
            suma = suma + valor_ingresado;
            System.out.printf("Valor ingresado %d\n", valor_ingresado);
            contador = contador + 1;
        }

        System.out.printf("La suma final es %d\n", suma);
        /*
        al incio se esta declarando 4 variables, dos para definir el rango que 
        se usara en el while, 1 para guardar el valor ingresado por pantalla,1 
        para acumular la suma de los valores ingresados en el rango definido por
        las dos variables usadas para esto exactamente
        el codigo hace un rango del 1 al 5 donde por cada uno se ira sumando un
        numero que se ingresara por pantalla, en una variable se esta sumando
        el valor de cada numero ingresado, al ginal se presenta la suma total
        de los cinco valores ingresados
        */

    }
}
