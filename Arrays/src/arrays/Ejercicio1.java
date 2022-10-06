
package arrays;

import java.util.Hashtable;

public class Ejercicio1 {
    
    private Hashtable caracterUnico = new Hashtable();
    
    //verificar si un string cuenta con caracteres unicos en su estructura
    public void Transformacion(String [] cadena){
        boolean cadenaUnica = false;
        for (String c: cadena ) {
           int ascii = c.charAt(0);
           if(!caracterUnico.containsKey(ascii)){
               caracterUnico.put(ascii, c);
               cadenaUnica = true;
           }else{
               System.out.println("Cadena de datos no unico");
               cadenaUnica = false;
               break;
           }   
        }
        if(cadenaUnica) System.out.println("Cadena de datos unico");
    }
    
}
