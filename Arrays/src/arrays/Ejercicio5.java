
package arrays;

/*
    Verificar si la cadena fue modificada
    la tolerancia sera de uno a cero caracteres 
    modificados.
*/

public class Ejercicio5 {
    
    public boolean checador(String original, String modificada){
        if( verificarTamano(original.length(), modificada.length()) ){
           for (int i = 0; i < original.length(); i++) {
               if(!modificada.equals("") || modificada != null){
                    int j = 0;
                    while (j < modificada.length()) {
                       if(original.charAt(i) == modificada.charAt(j)){
                           modificada = extraerLetra(j, modificada);
                            j += modificada.length();
                        }
                       j++;
                    }  
               } else return modificada.equals("") || modificada.length() <= 1;
            } 
        } else return false;
        return modificada.equals("") || modificada.length() <= 1;
    }
    
    public boolean verificarTamano(int originalSize, int modificadoSize){
        return 
                (modificadoSize + 1) == originalSize ||
                (modificadoSize - 1) == originalSize ||
                      modificadoSize == originalSize;
    }
    
    public String extraerLetra(int posicion, String modificada){
        String nuevoString = "";
        for (int i = 0; i < modificada.length(); i++) {
            if(i != posicion)
                nuevoString = nuevoString + modificada.charAt(i);
        }
        return nuevoString;
    }
}
