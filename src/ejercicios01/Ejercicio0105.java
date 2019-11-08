package ejercicios01;
public class Ejercicio0105 {
    public static void main(String[] args) {
        // necesitamos una variable con el total del alumnos
        // variable con en numero de notables/alumnos , suspensos/alumnos y sobresalientes/alumnos
       long totalAlumnos = 30;
       long totalAprobados = 16;
       long totalNotables = 8;
       long totalSobresalientes = 8;
       // tanto por ciento de alumnos que aprobaron
       double porAprobados = (totalAprobados*100) / (double) totalAlumnos ;
       porAprobados = Math.round(porAprobados*100)/100d;
       System.out.println("Porcentaje de aprobados: " +porAprobados+ "%");
       // tanto por ciento de alumnos que sacaron un notable
       double porNotables = (totalNotables*100) / (double) totalAlumnos;
       porNotables = Math.round(porNotables*100) / 100d;
       System.out.println("Porcentaje de notables: " +porNotables+ "%" );
       // tanto por ciento de alumnos que sacaron sobresalientes
       double porSobresalientes = (totalSobresalientes*100) / (double) totalAlumnos;
       porSobresalientes = Math.round(porSobresalientes*100) / 100d;
       System.out.println("Porcentaje de Sobresalientes: " +porSobresalientes+ "%");
    
    }
    // se podria hacer también sumando suspenso + suficientes + notables + sobresalientes
    // teniendo un total luego se hacen las operaciones sobre el total
    // si queremos introducir los datos se hace con el Scanner 
    // import java.util.Scanner;
    // Scanner teclado = new Scanner(System.in);
    //         System.out.print("introduce un numero entero ");
    //    num2 = teclado.nextInt();
}