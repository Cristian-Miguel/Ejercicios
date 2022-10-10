
package arrays;

import java.util.ArrayList;
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
        verificarPalindromo(cadena, letras);
    }
    
    private void verificarPalindromo(String cadena,  ArrayList<String> letras){
        if(letras.size()%2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
            int mitad = (letras.size()/2)+1;
            Hashtable listaLetras = new Hashtable();
            for (int i = 0; i < letras.size(); i++) {
                int ascii = letras.get(i).charAt(i);
                
                if(!listaLetras.containsKey(ascii)){
                    ArrayList<String> caracteres = new ArrayList<String>();
                    caracteres = (ArrayList<String>) listaLetras.get(ascii);
                    caracteres.add(letras.get(i));
                    listaLetras.put(ascii, caracteres);
                }else{
                    ArrayList<String> caracteres = new ArrayList<String>();
                    caracteres.add(letras.get(i));
                    listaLetras.put(i, caracteres);
                    
                }
            }
            
//            for (int i = 0; i < 10; i++) {
//                listaLetras.
//            }
        }
    }
    
    public void crearPalindromos(Hashtable listaLetras){
        
    }
}
