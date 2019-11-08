package ejercicios01;
import java.util.Scanner;
public class Ejercicio0108 {
    public static void main(String[] args) {
        // leer el coste inicial del automovil
        // calcular el coste para el consumidor
        // crear variable final con porcentaje de ganancia del vendedor
        
        Scanner teclado = new Scanner(System.in);
        // porcentajes
        double impuesto = 6, vendedor= 12;
        
        System.out.println("precio inicial: ");
        float precioInicial = teclado.nextFloat();
        //calculamos el precio añadido al inicial
        double total = precioInicial * (impuesto + vendedor )/100d;
        //sumamos el incial  y el añadido
        double precioFinal = total + precioInicial;
        // mostramos el el precio final
        System.out.println("Precio total del automovil: " + precioFinal);
    
    }
    
}