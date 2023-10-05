
package arrays;

import java.util.Hashtable;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        
//        String cadena [] = {"c","o","m","p","r","a","r"};
//        Ejercicio1 llamar = new Ejercicio1();
//        llamar.Transformacion(cadena);
        
//        String cadena1 = "ccc", cadena2 = "acccvddccc";
//        String cadena1 = "abc", cadena2 = "cca";
//        Ejercicio2 Ej2 = new Ejercicio2();
//        Ej2.permutaciones(cadena1, cadena2);
        
//        String cadena = "Mr John Smith    ";
//        Ejercicio3 Ej3 = new Ejercicio3();
//        Ej3.cambiarEspacios(cadena);

//        String cadena = "t act co a";
//        Ejercicio4 Ej4 = new Ejercicio4();
//        Ej4.permutacionPalindromo(cadena);
//        String cadenaOriginal = "pale";
//        String cadenaDiferente = "pal";

//        String original = "pale";
//        String modificada = "baler";
//        Ejercicio5 ejercicio5 = new Ejercicio5();
//        boolean valido = ejercicio5.checador(original, modificada);
//        System.out.println("original = " + original + " --- modificada = " + modificada);
//        System.out.println("fue modificado = "+valido);

        String original = "aabcccccaaab";
        Ejercicio6 ejercicio6 = new Ejercicio6();
        String resultado = ejercicio6.verificarString(original);
        if( resultado.equals(original) ){
            System.out.println( "El resultado es mayor al orinal" );
        } else {
            System.out.println( "El resultado es menor y su cadena es: " + resultado );
        }
        
    }
    
}
