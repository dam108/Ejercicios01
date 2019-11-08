package ejercicios01;
import java.util.Scanner;
public class Ejercicio0106 {
    public static void main(String[] args) {
        float celsius, fahre, pulgadas, centimetros;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce temperatura en Celsius: ");
        celsius = teclado.nextFloat();
            // redondeo especificando formato float en división
            //si no hace division entera
        fahre = Math.round((9/5*celsius + 32)*100/100f);
        System.out.println("Equivalente Fahrenheit: "+ fahre);
        
        System.out.print("introduce cantidad de agua en pulgadas: ");
        pulgadas = teclado.nextFloat();
        
        centimetros = (float) Math.round( pulgadas * 2.55 *10)/10;
        System.out.println("Equivalente en centimetros: " + centimetros);

    
    }
    
}