
package arrays;
import java.util.Hashtable;

public class Ejercicio2 {
    
    private Hashtable guardarCadena1Ascii = new Hashtable();
    private Hashtable guardarCadena2Ascii = new Hashtable();
    
    //ccc
    public void permutaciones(String cadena1, String cadena2){
        if(cadena1.length() > cadena2.length()){
            int rangoA = 0;
            for(int i = cadena2.length(); i < cadena1.length(); i++){
                String rango = cadena1.substring(rangoA, i);
                if(rango.equals(cadena2)){
                    
                }
                rangoA++;
            }
        }else if(cadena1.length() < cadena2.length()){
            
        }else{
            
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
