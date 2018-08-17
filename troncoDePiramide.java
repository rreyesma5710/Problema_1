import java.util.Scanner;
import static java.lang.Math.pow;

public class troncoDePiramide
{
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        double medidaTapa, medidaBase, altura, h, cUno, cDos, area, volumen;
        
        System.out.println("Digita medida de la tapa de la piramide (m)");
        medidaTapa = Leer.nextInt();
        
        System.out.println("Digita medida de la base de la piramide (m)");
        medidaBase = Leer.nextInt();
        
        System.out.println("Digita medida de la altura de tronco de piramide (m)");
        altura = Leer.nextInt();
        
        /*
        * Formula Area:
        * A = Ab+At+4*Ac(trapecios laterales)
        * A = (l*l)b + (l*l)t + 4*((B+b)/2)*h
        */
        
       //medidaBase*medidaBase = Math.pow(medidaBase, 2)
       
       /*
        * Calculando altura del trapecio:
        * teorema de pitagoras
        * raizCuadrada = 
        */
       cUno = medidaBase;  cDos = (medidaBase/2) - (medidaTapa/2);
       h = Math.sqrt(Math.pow(cUno,2) + Math.pow(cDos,2) );
       
       //area de base y tapa
       double areaBase = Math.pow(medidaBase, 2);
       double areaTapa = Math.pow(medidaTapa, 2);
       
       //Area total 
       area = areaBase + areaTapa + (4*((medidaBase+medidaTapa)/2)*h);
       
       
       /*
        * VOLUMEN:
        * (Ab+At+raizCuadrada(Ab*At))*AlturaTroncoPiramide
        * 
        */
       
       volumen = ((areaBase+areaTapa+Math.sqrt(areaBase*areaTapa ))*altura)/3;
       
       //Mensaje
       System.out.println("***************");
       System.out.println("El area buscada es -> "+ area+"m²");
       System.out.println("El volumen buscado es -> "+ volumen+"m³");
       System.out.println("***************");
       
        
    }
    
}
