import java.util.Scanner;

public class camionTransporte
{
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        double nKilosViaje, nGalonesViaje, nKilosCarga;
        
        System.out.println("¿Cuantos Kilos caben en el bus?");
        nKilosViaje = Leer.nextDouble();
        System.out.println("¿Cuantos Galones gasta un viaje?");
        nGalonesViaje = Leer.nextDouble();
        System.out.println("¿Cual es la carga completa (Kilos)?");
        nKilosCarga = Leer.nextDouble();
        
        double nViajes = nKilosCarga/nKilosViaje;
        
        if(nViajes <=1){
            System.out.println("Numero de viajes->1");
            System.out.println("Galones para todos los viajes->"+nGalonesViaje);
   
        }else{
            if(nViajes / (int)nViajes != 1){
                System.out.println("Numero de viajes->"+((int)nViajes+1));
                System.out.println("Galones para todos los viajes->"+((int)nViajes+1)*nGalonesViaje);
            }else{
                System.out.println("Numero de viajes->"+(int)nViajes);
                System.out.println("Galones para todos los viajes->"+((int)nViajes)*nGalonesViaje);
            }
        }        
          
    }
    
}
