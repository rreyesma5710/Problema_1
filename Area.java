import java.util.Scanner;
/**
 *Este programa halla el área deun triángulo
 * Datos de entrada: necesito conocer la base y la altura
 * Datos de salida: el área del trinángulo
 * @version (a version number or a date)
 */
public class Area
{
  public static void main(String[] args)
  {
    //Declaración
    //Numeros: double(con punto decimal),int(enteros, sin punto decimal)
    //tipo nombre; --> Intrucción de declaración de variables  
    double base, altura, area;
    Scanner teclado = new Scanner(System.in);  
    
    //1. Solucitar los datos de entrada
    System.out.println ("Area del Triangulo");
    
    System.out.println ("Entre la base:");
    base = teclado.nextDouble();
    
    System.out.println ("Entre la altura:");
    altura = teclado.nextDouble();
    
    //2.Hallar los datos de salida
    area = base * altura / 2;
    
    //3. Mostrar los datos de salida en pantalla
    System.out.println("El Area del tringulo es: " + area);
   }
}