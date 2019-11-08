package ejercicios01;
public class Ejercicio0107 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int p = 3;
        int r = 8;
        int s = 4;
        int t = 9;
        int q = 12;
        int c = 3;
        
               
        int calc1 = (m + n) / n;
        System.out.println(calc1);
        
        int calc2 = ((m + n) / p) / (( p - r ) / s); 
        System.out.println(calc2);
        
        int calc3 = ((c * r * t ) / 100)/(( m * m )+( n * n )/( p + q ));
        System.out.println(calc3);
    
    }
    
}