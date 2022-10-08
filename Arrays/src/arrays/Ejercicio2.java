
package arrays;

public class Ejercicio2 {
    
    //ccc  acvddccc
    public void permutaciones(String cadena1, String cadena2){
        if(cadena1.length() > cadena2.length()){
            int rangoA = 0, permutaciones = 0;
            for(int i = cadena2.length(); i < cadena1.length()+1; i++){
                String rango = cadena1.substring(rangoA, i);
                if(rango.equals(cadena2)) permutaciones++;
                rangoA++;
            }
            System.out.println("Se encontraron "+permutaciones+" permutaciones de las cadenas");
        }else if(cadena1.length() < cadena2.length()){
            int rangoA = 0, permutaciones = 0;
            for(int i = cadena1.length(); i < cadena2.length()+1; i++){
                String rango = cadena2.substring(rangoA, i);
                if(rango.equals(cadena1)) permutaciones++;
                rangoA++;
            }
            System.out.println("Se encontraron "+permutaciones+" permutaciones de las cadenas");
        }else{
            int permutacion = cadena1.equals(cadena2) ? 1 : 0;
            System.out.println("Se encontro "+permutacion+" permutacion entre las cadenas");
        }
    }
}
