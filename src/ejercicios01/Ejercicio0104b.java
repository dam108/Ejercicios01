package ejercicios01;
import java.util.Scanner;
public class Ejercicio0104b {
    public static void main(String[] args) {
        
        /* 
        VOY A JUNTAR EL EJERCICIO 12 QUE COMPRUEBA FECHAS CON EL 14 NOS DICE CUAL DE LAS FECHAS ES MAYOR
        */
        
        // leer dos fechas
        int dia1, mes1, year1, dia2, mes2, year2;
        boolean bisiesto1 = false, bisiesto2 = false, values1, values2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la primera fecha");
        dia1 = teclado.nextInt();
        System.out.println("Introduce el mes de la primera fecha");
        mes1 = teclado.nextInt();
        System.out.println("Introduce el año de la primera fecha");
        year1 = teclado.nextInt();
        System.out.println("Introduce el dia de la segunda fecha");
        dia2 = teclado.nextInt();
        System.out.println("Introduce el mes de la segunda fecha");
        mes2 = teclado.nextInt();
        System.out.println("Introduce el año de la segunda fecha");
        year2 = teclado.nextInt();
                
        if ( year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0 ){ // comprobamos si el año es bisiesto
            bisiesto1 = true;  // le damos valor verdadero a año bisiesto
        }
        if ( year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0 ){ // comprobamos si el año es bisiesto
            bisiesto2 = true;  // le damos valor verdadero a año bisiesto
        }
        
        /* COMPROBACION DE LA PRIMERA FECHA */
        
        if ( bisiesto1 == true && mes1 == 2 && dia1 >= 1 && dia1 <= 29 ){ // comprobamos si es bisiesto y febreo tiene entre 1 y 29 dias 
            values1 = true;
        }
        else {
            if ( bisiesto1 == false && mes1 == 2 && dia1 >= 1 && dia1 <= 28 ){ // Si no es bisiesto y es febrero que compruebe que tiene 28 dias 
                values1 = true;
            }
            else {
                if (( mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) && ( dia1 >=1 && dia1 <= 31 ) ){ // si no es bisiesto y es mes que tiene 31 dias que lo compruebe
                    values1 = true;
                }
                else {
                    if (( mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11 ) && ( dia1 >= 1 && dia1 <= 31 ) ){ // si no es bisiesto y es mes que tiene 30 dias que lo compruebe
                        values1 = true;
                    }
                    else {
                        values1 = false;
                    }
                }
            }
        }
        
        /* COMPROBACION DE LA SEGUNDA FECHA */
        
        if ( bisiesto2 == true && mes2 == 2 && dia2 >= 1 && dia2 <= 29 ){ // comprobamos si es bisiesto y febreo tiene entre 1 y 29 dias 
            values2 = true;
        }
        else {
            if ( bisiesto1 == false && mes2 == 2 && dia2 >= 1 && dia2 <= 28 ){ // Si no es bisiesto y es febrero que compruebe que tiene 28 dias 
                values2 = true;
            }
            else {
                if (( mes2 == 1 || mes2 == 3 || mes2 == 5 || mes2 == 7 || mes2 == 8 || mes2 == 10 || mes2 == 12) && ( dia2 >=1 && dia2 <= 31 ) ){ // si no es bisiesto y es mes que tiene 31 dias que lo compruebe
                    values2 = true;
                }
                else {
                    if (( mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11 ) && ( dia2 >=1 && dia2 <= 31 ) ){ // si no es bisiesto y es mes que tiene 30 dias que lo compruebe
                        values2 = true;
                    }
                    else {
                        values2 = false;
                    }
                }
            }
        }
        
        /* CUAL DE LAS DOS FECHS ES MAYOR */
        
        if ( values1 == true && values2 == true ){
            if ( year1 > year2 || ( year1 == year2 && mes1 > mes2 ) || ( year1 == year2 && mes1 == mes2 && dia1 > dia2 )){
                System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + year1 + " es mayor que la fecha " + dia2 + "/" + mes2 + "/" + year2 );
            }
            else {
                if ( year1 == year2 && mes1 == mes2 && dia1 == dia2 ){ // comprobamos si las fechas son iguales
                    System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + year2 + " es igual que " + dia1 + "/" + mes1 + "/" + year1 );
                }
                else { // si lo anterior no es , la segunda fecha es la mayor
                    System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + year2 + " es mayor que la fecha " + dia1 + "/" + mes1 + "/" + year1 );
                }
            }
        }
        else {
            System.out.println("Alguna de las fechas no es correcta.");
        }
    
    }
    
}