
package arrays;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Ejercicio4 {
     Stack asciiLetras = new Stack(); 
     Stack espacios = new Stack();
     Hashtable listaLetras = new Hashtable();
     private static int imparAscii = 0, impar = 0;
     private static String imparLetra;
    
    public void permutacionPalindromo(String cadena){
        //identificamos los espacios para bloquearlos
        agruparLetras(cadena);
        if(esPalindromo()){
//            System.out.println("espacios = " + espacios.size());
//            espacios.forEach(System.out::println);
            Stack combinaciones = primeraCadenaPalindroma();
            Stack palindromos = generacionPalindromos(combinaciones, cadena);
            palindromos.forEach(System.out::println);
        } else {
            System.out.println("No es palindromo");
        }
    }
    
    public void agruparLetras(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' ')
                espacios.add(i);
            else {
                int ascii = cadena.charAt(i);
                String cantidad = (String) listaLetras.get(ascii);
                if(cantidad == null){
                    listaLetras.put(ascii, "1");
                    asciiLetras.add(ascii);
                } else {
                    int numero = Integer.parseInt(cantidad);
                    numero++;
                    listaLetras.put(ascii,String.valueOf(numero));
                }
            }
        }
    }
    
    public boolean esPalindromo(){
        int i = 0;
        while(i < asciiLetras.size()){
            int ascii = (int) asciiLetras.get(i);
            int cantidad = Integer.parseInt((String) listaLetras.get(ascii));
            if(cantidad%2 != 0){
                impar++;
                imparLetra = String.valueOf((char) ascii);
                if(impar > 1)
                    return false;
                imparAscii = i;
                imparLetra = String.valueOf((char) ascii);
            }
            i++;
        }
        return true;
    }
    
    public Stack primeraCadenaPalindroma() {
        Stack combinaciones = new Stack();
        asciiLetras.remove(imparAscii);
        for (int i = 0; i < asciiLetras.size(); i++) {
            //hacemos el intercambio del primer caracter a donde este i
            ArrayList<String> tempLetras = new ArrayList<String>();
            asciiLetras.forEach((element) -> { 
                int ascii = (int) element;
                tempLetras.add(String.valueOf((char) ascii)); 
            });
            String caracter1 = tempLetras.get(0);
            String caracter2 = tempLetras.get(i);
            tempLetras.set(0, caracter2);
            tempLetras.set(i, caracter1);
            combinaciones.add(tempLetras);
            
            //guardamos sus diferentes combinaciones
            for (int j = 1; j < tempLetras.size(); j++) {
                for (int k = j+1; k < tempLetras.size(); k++) {
                    ArrayList<String> tempLetrasBusqueda = new ArrayList<String>(); 
                    tempLetras.forEach((element) -> {
                        tempLetrasBusqueda.add(element);
                    });
                    String moveChar1 = tempLetras.get(j);
                    String moveChar2 = tempLetras.get(k);
                    tempLetrasBusqueda.set(k, moveChar1);
                    tempLetrasBusqueda.set(j, moveChar2);
                    
                    combinaciones.add(tempLetrasBusqueda);
                }
            }
        }
        return combinaciones;
    }

    public Stack generacionPalindromos(Stack combinaciones, String cadena){
        Stack palindromos = new Stack();
        int i = 0;
        while(!combinaciones.empty()){
            //genera el palindromo
            ArrayList<String> tempCombinaciones = (ArrayList<String>) combinaciones.pop();
            ArrayList<String> tempEspejoLetras = new ArrayList<String>();
            for (int j = tempCombinaciones.size()-1; j > -1; j--)
                tempEspejoLetras.add(tempCombinaciones.get(j));
            
            ArrayList<String> temp = new ArrayList<String>();
            tempCombinaciones.forEach((elemento) -> { temp.add(elemento); });
            if(impar == 1)
                temp.add(imparLetra);
            tempEspejoLetras.forEach((elemento) -> { temp.add(elemento); });
            
            //poner los espacios
            if(!espacios.isEmpty()){
                ArrayList<String> ponerSpacios = new ArrayList<String>();
                int iterar = 0, iterarCaracteres = 0;
                while(iterar < cadena.length()){
                    char caracter = cadena.charAt(iterar);
                    if(caracter == ' ')
                        ponerSpacios.add(" ");
                    else{
                        ponerSpacios.add( temp.get(iterarCaracteres) );
                        iterarCaracteres++;
                    }
                    iterar++;
                }
                palindromos.add(ponerSpacios);
            }
            else
                palindromos.add(temp);
            i++;        
        }
        return palindromos;
    }
}
