import java.util.Scanner;

public class hexagono
{
    public static void main(String[] args) 
    {
        Scanner Leer = new Scanner (System.in);
        
        double L, Ap, Area;
        System.out.println("***********************");
        System.out.println("Longitud de hexagono");
        System.out.println("***********************");
        
        
        System.out.println("Digita longitud de lado L (cm)");
        L = Leer.nextDouble();
        
        System.out.println("Digita Apotema (cm)");
        Ap = Leer.nextDouble();
        
        double perimetro = 6*L;
        
        //Calculando area
        
        Area = (perimetro*Ap)/2;
        
        System.out.println("***********************");
        System.out.println("Area de hexagono -> "+Area+"cm²");
        System.out.println("***********************");
    
    }
    
}
