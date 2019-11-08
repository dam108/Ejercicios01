package ejercicios01;
import java.util.Scanner;
public class Ejercicio0104 {
    public static void main(String[] args) {
        long num1, num2, suma, resta;
        double multi, divi;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("introduce un numero entero ");
        num1 = teclado.nextInt();
        System.out.print("introduce un numero entero ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;        
        System.out.println ("el resultado de sumar "+num1+ " y " +num2+ " es " +suma);
        
        resta= num1 - num2;
        System.out.println ("el resultado de restar "+num1+ " y " +num2+ " es " +resta);
        
        multi = (double)num1 * num2;
        System.out.println ("el resultado de multiplicar "+num1+ " y " +num2+ " es " +multi);
        
        divi = (double)num1 / num2;
        System.out.println ("el resultado de sumar "+num1+ " y " +num2+ " es " +divi);
    
    // si el segundo numero es 0 nos va a dar el resultado el resultado de sumar 10 y 0 es Infinity
    // para quitar decimales y redondear usamos la funcion Math.roud();  el problema es que no le podemos indicar los decimales
    // si queremos solo dos decimales usamos Math.round(varialbe*100)/100;
    // si hay que transformar en dobles  se utliza el casteo en el (double) Math.round o Math.round(varialbe*100)/100d;
    
    }
    
}