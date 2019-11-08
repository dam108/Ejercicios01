package ejercicios01;
import java.util.Scanner;
public class EjemploMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("intoduce una opcion: ");
            opcion = teclado.nextInt(); 
            switch (opcion) {
                case 1: break;
                case 2: break;
            }
        } while (opcion != 3 );
        
    
    }
    
}