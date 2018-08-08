
import java.util.Scanner;
/**
 * Este programa halla el área del tronco de pirámide, el volumen del tronco.
 * Datos de entrada: necesito conocer la base, la base menor yla altura
 * Datos de salida: el área del tronco y el volumen del tronco
 * @version (a version number or a date)
 */
public class Tronco_de_piramide
{
  public static void main(String[] args)
  {
    //Declaración
    //Numeros: double(con punto decimal),int(enteros, sin punto decimal)
    //tipo nombre; --> Intrucción de declaración de variables  
    double abase, abasemenor, altura, t, ap, raiz, at, atronco, volument;
     
    Scanner teclado = new Scanner(System.in);  
    
    //1. Solucitar los datos de entrada
    System.out.println ("Ingrese los datos del tronco de pirámide");
    
    System.out.println ("Ingrese el área de base mayor: ");
    abase = teclado.nextDouble();
    
    System.out.println ("Ingrese el área de base menor:");
    abasemenor = teclado.nextDouble();
    
    System.out.println ("Ingrese la altura del tronco:");
    altura = teclado.nextDouble();
    
    //2.Hallar los datos de salida
    t = (abase/2) - (abasemenor/2);
    ap = Math.pow(t,2) + Math.pow(altura,2);
    raiz = Math.sqrt(ap);
    at = (abase + abasemenor) * raiz/2;
    atronco = Math.pow(abase,2) + Math.pow(abasemenor,2) + 4 * at;
    volument = (Math.pow(abase,2) + Math.pow(abasemenor,2)+(Math.sqrt(Math.pow(abase,2) + Math.pow(abasemenor,2)))) * altura/3;
        
    //3. Mostrar los datos de salida en pantalla
    System.out.println("Área del tronco de pirámide: " + atronco);
    System.out.println("Volumen del tronco de pirámide: " + volument);
   }
}