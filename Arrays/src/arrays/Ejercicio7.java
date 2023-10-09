
package arrays;

public class Ejercicio7 {
    
    public int [] [] manejarMatriz(int matriz[][]){
        int resultado [][] = new int[6][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] = matriz[j][i];
            }
        }
        
        return resultado;
    }
    
}
