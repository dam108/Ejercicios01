package ejercicios01;
import java.util.Scanner;
public class Ejercicio0101 {
    public static void main(String[] args) {
        
        int importeEuros; 
        double importeDolares;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("introduce la cantidad en euros ");
        importeEuros = teclado.nextInt();
        final double IMPORTECAMBIO = 1.14; // con final conseguimos que este importe no se pueda modificar en el resto del programa
        importeDolares = ( double) importeEuros * IMPORTECAMBIO;
        
        System.out.println ("Tienes " +importeDolares+" dolares.");
        
        // introducir un valor en euros
        // convertirlo a dolares en relacion 1€ a 1.14 dolares
        // imprimir el resultado
    
    
    
    
    }
    
}
