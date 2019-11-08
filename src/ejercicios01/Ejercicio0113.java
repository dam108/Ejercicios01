package ejercicios01;
import java.util.Scanner;
public class Ejercicio0113 {
    public static void main(String[] args) {
        // introducir y guardar la longitud de dos catetos de un angulo recto
        // calcular hipotenusa
        double a, b, h;
        
        Scanner teclado = new Scanner(System.in);
        
        // hipotenusa al cuadrado = cateto al cuadrado + cateto al cuadrado
        
        System.out.print("Introduce la longitud del primer cateto: ");
        a = teclado.nextInt();
        System.out.print("Introduce la longitud del segundo cateto: ");
        b = teclado.nextInt();
        
        /* Manera larga de calcular la hipotenusa
        
        // calculamos hipotenusa al cuadrado utilizando el metodo Math.pow(double a, double b); donde a es la base y b es el exponente
        h = ( Math.pow(a, 2) ) + ( Math.pow(b, 2) );
        
        // le hacemos la raiz cuadrada a h para sacar la hipotenusa 
        h = Math.sqrt(h);
                
        System.out.println("La hipotenusa es: " +h);
        
        */
     
        // calculo de hipotenusa automaticamente
        
        h = Math.hypot(a, b);
        
        System.out.println("La hipotenusa es: " +h);
        
        /* para evitar errores de ejecución podemos incluir instrucciones problematicas
           destro de un bloque try ... catch , así el programa no se interrumpirá
        
            try {x=y/z;} catch (Exception e ) {x=0;}
        
        */
    
    }
    
}