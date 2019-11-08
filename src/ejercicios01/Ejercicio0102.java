package ejercicios01;
import java.util.Scanner;
public class Ejercicio0102 {
    public static void main(String[] args) {
        
        double importeEuros; 
        int importeDolares;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("introduce la cantidad en dolares ");
        importeDolares = teclado.nextInt();
        final double IMPORTECAMBIO = 1.14;
        importeEuros =  (double) importeDolares / IMPORTECAMBIO;
        
        // con redondeo a decimales:
        // importeEuros = Math.round (importeDolares * IMPORTECAMBIO * 100)/100d;
        
        System.out.println ("Tienes " +importeEuros+" euros.");
        
        // introducir un valor en euros
        // convertirlo a dolares en relacion 1€ a 1.14 dolares
        // imprimir el resultado
    
    
    
    
    }
    
}