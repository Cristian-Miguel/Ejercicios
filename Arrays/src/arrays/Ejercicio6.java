
package arrays;
/*
    implementar una funcion para 
    leer la una cadena y leer las
    repeticione de cada letra que 
    esten juntas.
*   Condiciones:
        -Que el output sea menor en tamaño que el input
        -Puedes asumir que la cadena original puede ser mayusculas o minusculas
        -Retornar el string original si no es menor el output
*   Ejemplo:
        -Input;  aabcccccaaa
        -Output; a2b1c5a3
*/
public class Ejercicio6 {
    
    public String verificarString(String original){
        String resultado = "";
        for (int i = 0; i < original.length(); i++) {
            int contador = 0;
            int j = i;
            System.out.println("posicion = " + i);
            while(j < original.length()) {
                if ( original.charAt(i) == original.charAt(j) ) {
                    contador++;
                     j++;
                     if(j >= original.length()){
                         resultado = resultado + original.charAt(i) + contador;
                         i = j+1;
                     }
                } else {
                    resultado = resultado + original.charAt(i) + contador;
                    i = j-1;
                    j += original.length();
                }
            }
        }
        
        if(original.length() < resultado.length())
            resultado = original;
        
        return resultado;
    }
    
}
