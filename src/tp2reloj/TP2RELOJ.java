/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

public class TP2RELOJ {
    
    

    
    public static void main(String[] args) {
        
        Reloj smartfit = new Reloj(LocalDate.now(), LocalTime.now(), "Enzo" , 12345);
       
        Persona persona = new Persona ("Beto" , "Alonso" , 22 , 1.70 , smartfit);
        
        persona.decirHora();
        
        smartfit.incrementarDia(4);
        
        smartfit.incrementarHora(1);
        
        persona.decirHora();
        
        RelojFit watchfit = new RelojFit(LocalDate.now() , LocalTime.now() , "Blanco" , 12345);
        
        watchfit.cuentaPasos(8,4);
    }
    
}
