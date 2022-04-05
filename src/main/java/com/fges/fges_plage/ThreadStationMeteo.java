/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.fges_plage;

/**
 *
 * @author julie.jacques
 */
public class ThreadStationMeteo extends Thread {
    
    protected Station station;
    
    public ThreadStationMeteo(Station station){
        this.station = station;
    }
    
    public void run(){
        while (true){
            DonneeStation donnees = station.attenteCapteurs();
            System.out.println("Mise à jour reçue de la station météo");
            System.out.println("Température eau : "+donnees.getTemperatureEau());
            System.out.println("Température air : "+donnees.getTemperatureAir());
            System.out.println("Vent : "+donnees.getVent());
            System.out.println("Bactéries par 100ml : "+donnees.getNbBacteriesPar100ml());
        }
    }
}
