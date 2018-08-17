import java.util.Scanner;

public class avion
{
    public static void main(String[] args) {
    
        Scanner Leer = new Scanner (System.in);
        
        int clase, nPasajeros = 0;
        double valor = 0.0, recaudo;
        
        System.out.println("El numero de clase");
        clase = Leer.nextInt();  
        
        if(clase == 1){
            System.out.println("# de pasajeros que compraron aqui su tiquete");
            nPasajeros = Leer.nextInt();
            valor = 500000;
        }else{
            
            if(clase == 2){
                System.out.println("# de pasajeros que compraron aqui su tiquete");
                nPasajeros = Leer.nextInt();
                valor = 200000;
            }else{
                
                if(clase == 3){
                    System.out.println("# de pasajeros que compraron aqui su tiquete");
                    nPasajeros = Leer.nextInt();
                    valor = 125000;
                }else{
                    System.out.println("Digita un numero valido (del 1 al 3)");
                }
            
            }
        
        }
        
        recaudo = nPasajeros*valor;
        System.out.println("Valor total recaudado -> $"+recaudo);
        
    }

}
