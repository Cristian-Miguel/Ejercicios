
package arrays;

public class Ejercicio3 {
    
    public void cambiarEspacios(String cadena){
        String quitarEspaciosFinales = cadena.trim();
        String cambiarCadena = quitarEspaciosFinales.replaceAll(" ", "%20");
        System.out.println(cambiarCadena);
    }
}
