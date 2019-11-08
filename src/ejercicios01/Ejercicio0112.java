package ejercicios01;
import java.util.Scanner;
public class Ejercicio0112 {
    public static void main(String[] args) {
        
        /* Código erroneo
        
        int var1, var2;
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        var1 = var2;
        var2 var1;
        System.out.println("Ahora var1 es igual a var1");
        System.out.println("Ahora var2 es igual a var2");
        
        */
        
        // Código correcto
        int var1, var2;
        
        Scanner teclado = new Scanner(System.in); // añadimos esta linea que funcione el escaner creando una nueva instancia del metodo Scanner
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        
        int var3 = var1; // creamos una variable nueva para guardar el valor de var 1 momentaneamente
        
        var1 = var2; // intercambiamos las variables 
        var2 = var3; // sin riesgo a perder ningun valor en el intercambio
        
        System.out.println("Ahora var1 es igual a " +var1); // corregimos el error de código donde faltaba la concatenacion de la variable
        System.out.println("Ahora var2 es igual a " +var2);
        
    }
    
}