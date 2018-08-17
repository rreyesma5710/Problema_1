import java.util.Scanner;
import static java.lang.Math.pow;

public class troncoDeCono
{
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        Double r, R, h;
        
        System.out.println("Digite radio mayor (inferior) (mts)");
        R = Leer.nextDouble();
        
        System.out.println("Digite radio menor (superior) (mts)");
        r = Leer.nextDouble();
        
        System.out.println("Digite altura (de centro a centro) (mts)");
        h = Leer.nextDouble();
        
        //Aplicando formula
        
        double volumen = (3.1415*(Math.pow(r,2)+Math.pow(R,2)+(r*R))*h)/3;
        
        //Mensaje
       System.out.println("***************");
       System.out.println("El volumen buscado es -> "+volumen+"m³");
       System.out.println("***************");
        
    }    
    
}
