import java.util.Scanner;

public class paseoMelgar
{
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        int estudiantesGordos, estudiantesFlacos, nSillas, nDiasDePaseo;
        double valorPlato, valorCuartoHotel,nPersonasXHabitacion,
        alquilerBus ;   
        
        System.out.println("Digite numero de estudiantes gordos");
        estudiantesGordos = Leer.nextInt();        
        System.out.println("Digite numero de estudiantes flacos");
        estudiantesFlacos = Leer.nextInt();        
        System.out.println("Digite # sillas por bus");
        nSillas = Leer.nextInt();       
        System.out.println("Digite valor de plato de comida");
        valorPlato = Leer.nextDouble();        
        System.out.println("Digite valor de cuarto de hotel");
        valorCuartoHotel = Leer.nextDouble();        
        System.out.println("Digite numero de camas");
        nPersonasXHabitacion = Leer.nextDouble();
        System.out.println("Digite valor de alquiler de bus");
        alquilerBus = Leer.nextDouble();        
        System.out.println("Digite el numero de dias de paseo");
        nDiasDePaseo = Leer.nextInt();         
       
        
        int sillasOcupadas = estudiantesGordos*2 + estudiantesFlacos;
        
        System.out.println("***************");
        System.out.println("Sillas Ocupadas -> "+ sillasOcupadas);
        System.out.println("***************");
        
        double nBuses = sillasOcupadas/nSillas;
        
        if((nBuses/(int)nBuses) != 1){
            nBuses = nBuses + 1;
        }
        
        System.out.println("***************");
        System.out.println("Buses por contratar -> "+ nBuses);
        System.out.println("***************");
        
        System.out.println("***************");
        System.out.println("Costo total buses -> "+ (nBuses*alquilerBus)*2);
        System.out.println("***************");
        
        
        int platosComidos = (estudiantesGordos*5 + estudiantesFlacos*3)*
                                                              nDiasDePaseo;
                                                              
        System.out.println("***************");
        System.out.println("Numero de platos de comidapara todo  elpaseo -> "+
                                                platosComidos);
        System.out.println("***************");
        
        System.out.println("***************");
        System.out.println("Valor a pagar por la comida -> $"+
                                                platosComidos*valorPlato);
        System.out.println("***************");
        
        int nEstudiantes = estudiantesGordos+estudiantesFlacos;
        
        double nHabitaciones = nEstudiantes/nPersonasXHabitacion;
        
        if((nHabitaciones/(int)nHabitaciones) != 1){
            nHabitaciones = nHabitaciones + 1;
        }
        
        System.out.println("***************");
        System.out.println("Numero de habitaciones necesarias ->"+
                                               nHabitaciones);
        System.out.println("***************");
        
        System.out.println("***************");
        System.out.println("Valor de habitaciones hotel (DIARIO) ->"+
                                               nHabitaciones*valorCuartoHotel);
        System.out.println("***************");
        
        System.out.println("***************");
        System.out.println("Valor de habitaciones hotel (TOTAL) ->"+
                                 nHabitaciones*valorCuartoHotel*nDiasDePaseo);
        System.out.println("***************");
    }    
    
}
