/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;


public class RelojFit extends Reloj{

    public RelojFit(LocalDate dia, LocalTime hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }

    public RelojFit() {
    }
    
    public void cuentaPasos ( int xFinal , int yFinal){
        
        int xInicial=0;
        int yInicial=0;
        
        int d1 = (xFinal - xInicial) * (xFinal  - xInicial );
        int d2 = (yFinal - yInicial ) * (yFinal - yInicial );
        
        double distancia = Math.sqrt( d1 + d2);
        
        int pasos = (int) Math.round(distancia);
        
        System.out.println("Pasos:  " + pasos);
              
    }
    
    public void frecuenciaAleatoria(){
        
    }
}
