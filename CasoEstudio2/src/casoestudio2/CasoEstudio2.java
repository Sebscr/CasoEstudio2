/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        String[] opciones = {"1. Visualizar Habitaciones","2. Modificar estado de habitaciones","3. Salir"};
             int opcion= JOptionPane.showOptionDialog(
                     null,
                     "Bienvenido al administrador de reservas",
                     "Seleccione la opcion que desea realizar:",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.INFORMATION_MESSAGE,
                     null,
                     opciones,
                     opciones[0]
             );
             String bruh= opciones[opcion];
             
             if (opcion ==0){
                 hotel.mostrarHabitaciones();
                 
             }
             if(opcion == 1){
                 hotel.modificarHabitaciones();
                 
             }
              if(opcion == 2){
                 JOptionPane.showMessageDialog(null,"Saliendo del programa");
              } 
            
                 
             
    }
    
}


