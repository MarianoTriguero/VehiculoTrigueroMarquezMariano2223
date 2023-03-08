
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoTrigueroMarquezMariano2223 miVehiculo;
        int stockActual;
        
        miVehiculo = new VehiculoTrigueroMarquezMariano2223("Seat",18000,100);
        operativaVehiculosTrigueroMarquezMariano2223(miVehiculo, 50); 
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosTrigueroMarquezMariano2223(VehiculoTrigueroMarquezMariano2223 miVehiculo, java.lang.Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
