import java.util.Scanner;
import static java.lang.Math.pow;

public class triangulo
{
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        
        double a,b,c;
        
        System.out.println("Digita lado a");
        a = Leer.nextDouble();  
        System.out.println("Digita lado b");
        b = Leer.nextDouble(); 
        System.out.println("Digita lado c");
        c = Leer.nextDouble(); 
        
        //Calculando semiperimetro
        double s = (a+b+c)/2;
        
        //calculando el area
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        //calculando circumradius
        double R = (a*b*c)/((4*3.1415)*(A));
        
        //Mensaje
       System.out.println("***************");
       System.out.println("Semiperimetro -> "+ s);
       System.out.println("Area -> "+ A);
       System.out.println("Circumradius -> "+ R);
       System.out.println("***************");
        
        
    }
}
