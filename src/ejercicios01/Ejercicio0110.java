package ejercicios01;
import java.util.Scanner;
public class Ejercicio0110 {
    public static void main(String[] args) {
        // leer el kilometraje de la última vez que se repostó
        // leer el kilometraje actual
        // litros de gasolina la ultima vez que se repostó
        // litros de gasolina actual
        // informar del consume medio del coche cada 100km
        
        double lastKm, actualKm, lastGas, actualGas, kmRecorridos, litrosGastados, kmPorLitro, consumoMedio;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("kilometraje de la última vez que se repostó: ");
        lastKm = teclado.nextInt();
        
        System.out.println("kilometraje actual: ");
        actualKm = teclado.nextInt();
        
        System.out.println("litros de gasolina la ultima vez que se repostó: ");
        lastGas = teclado.nextInt();
        
        System.out.println("litros de gasolina actual: ");
        actualGas = teclado.nextInt();
        
        kmRecorridos = actualKm - lastKm;
        litrosGastados = lastGas - actualGas;
        
        /*
        kmPorLitro = kmRecorridos /  litrosGastados;
        consumoMedio = 100 / kmPorLitro; // divimos 100km entre los kilometros por litro y nos da el consumo medio
        */
        
        consumoMedio = ( litrosGastados / kmRecorridos ) * 100; // otra manera de calcularlo -> litros gastados entre kilometros reccorridos por 100
        
        
        System.out.println("El consumo medio cada 100 km es: " +consumoMedio+ " litros a los 100.");
       
        
        
        
        
        
        
        
        
        
    
    }
    
}