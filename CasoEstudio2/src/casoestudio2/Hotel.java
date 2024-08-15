/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */

public class Hotel {
    public String [][] habitaciones;
    public int contador;
    


    public Hotel() {
        habitaciones = new String[5][5]; // 
        contador = 0; // 
        agregarHabitacionesPrecargados();
         
    }
    private void agregarHabitacionesPrecargados() {
        habitaciones[0] = new String[]{"1", "101", "Libre", "Simple", "$ 50"};
        habitaciones[1] = new String[]{"2", "202", "Libre", "Doble", "$ 60"};
        habitaciones[2] = new String[]{"3", "304", "Ocupada", "Simple", "$ 60"};
        habitaciones[3] = new String[]{"4", "403", "Sucia", "Doble", "$ 60"};
        habitaciones[4] = new String[]{"5", "501", "Ocupada", "simple", "$ 50"};
        
        contador = 5; 
    }
    public void modificarHabitaciones() {
   String numeroHabitacion = JOptionPane.showInputDialog("Ingrese el número de habitación a modificar:");
   for (int i = 0; i < contador; i++) {
       if (habitaciones[i][1].equals(numeroHabitacion)) {
           String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la habitación:");
           habitaciones[i][2] = nuevoEstado;
           JOptionPane.showMessageDialog(null, "Estado de la habitación modificado correctamente.");
           mostrarHabitaciones();
           return; 
       }
   }
   JOptionPane.showMessageDialog(null, "Número de habitación no encontrado.");
}

   public void mostrarHabitaciones() {
       String infoHabitaciones = "";
       for (int i = 0; i < contador; i++) {
           infoHabitaciones += "Piso: " + habitaciones[i][0]
               + ", Número de Habitación: " + habitaciones[i][1]
               + ", Estado: " + habitaciones[i][2]
               + ", Tipo: " + habitaciones[i][3]
               + ", Precio: " + habitaciones[i][4]
               + "\n";
       }
       JOptionPane.showMessageDialog(null,infoHabitaciones);
}
}
    
   



    
    

    

