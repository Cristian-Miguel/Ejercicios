
package arrays;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Ejercicio4 {
    
    public void permutacionPalindromo(String cadena){
        ArrayList<String> letras = new ArrayList<String>(); 
        for(int i = 0; i < cadena.length(); i++) {
            int asciiCaracter = cadena.charAt(i);
            if((asciiCaracter<91 && asciiCaracter>64) || (asciiCaracter<123 && asciiCaracter>96)){
                char letra = cadena.charAt(i);
                letras.add(String.valueOf(letra));
            }
        }
        agruparLetras(cadena, letras);
    }
    
    private void agruparLetras(String cadena,  ArrayList<String> letras){
        if(letras.size()%2 == 0){
            System.out.println("par");
        }else{
//            System.out.println("impar");
//            int mitad = (letras.size()/2)+1;
            Hashtable listaLetras = new Hashtable();
            for (int i = 0; i < letras.size(); i++) {
                int ascii = letras.get(i).charAt(0);
                
                if(listaLetras.containsKey(ascii)){
                    
                    ArrayList<String> caracteres = new ArrayList<String>();
                    caracteres = (ArrayList<String>) listaLetras.get(ascii);
                    String caracter = letras.get(i);
                    caracteres.add(caracter);
                    listaLetras.put(ascii, caracteres);
                    
                } else {
                    
                    ArrayList<String> caracteres = new ArrayList<String>();
                    caracteres.add(letras.get(i));
                    listaLetras.put(ascii, caracteres);
                    
                }
            }
            int par = 0, impar = 0;
            Enumeration e = listaLetras.keys();
            int clave;
            ArrayList<String> valor = new ArrayList<String>();
            while( e.hasMoreElements() ) {
                clave = (int) e.nextElement();
                valor = (ArrayList<String>) listaLetras.get( clave );
                if (valor.size() % 2 == 0) {
                    par++;
//                    System.out.println( "Clave : " + clave + " - Valor : " + valor + " - tipo : par");
                } else {
                    impar++;
//                    System.out.println( "Clave : " + clave + " - Valor : " + valor + " - tipo : impar");
                }
            }
            
            if (impar > 1){
                System.out.println("No es compatible con convinaciones palindromas");
            } else {
                crearPalindromos(listaLetras, false);
            }
         
        }
    }
    
    public void crearPalindromos(Hashtable listaLetras, boolean par){
       
    }
}
