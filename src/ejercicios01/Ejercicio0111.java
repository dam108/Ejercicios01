package ejercicios01;
import java.util.Scanner;
public class Ejercicio0111 {
    public static void main(String[] args) {
        /* PRIMERA VERSIÓN
        
        int edad1, edad2, edad3, edad4, 
        double media;

        Scanner teclado = new Scanner(System.in);
        

        
        // recoger edades de 4 personas
        System.out.println("Introduce la edad de la primera persona: ");
        edad1 = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona: ");
        edad2 = teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona: ");
        edad3 = teclado.nextInt();
        System.out.println("Introduce la edad de la cuarta persona: ");
        edad4 = teclado.nextInt();
         
        // calcular la media de edad de los mismos
        media = (edad1 + edad2 + edad3 + edad4 ) / 4.0;
        
        System.out.println("La media de las edades es: "+ media );
        
        */
        // SEGUNDA VERSIÓN
        int edad; 
        double media;
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("Introduce la edad de la primera persona: ");
        edad = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona: ");
        edad = edad + teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona: ");
        edad = edad + teclado.nextInt();
        System.out.println("Introduce la edad de la cuarta persona: ");
        edad = edad + teclado.nextInt();
        
        media = edad / 4.0;
        
        System.out.println("La media de las edades es: "+ media );
        
    
    }
    
}