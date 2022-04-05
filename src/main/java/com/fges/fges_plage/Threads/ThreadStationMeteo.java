/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.fges_plage.Threads;

import com.fges.fges_plage.Interfaces.DonneeStationObservable;
import com.fges.fges_plage.Station.DonneeStation;
import com.fges.fges_plage.Station.Station;

/**
 *
 * @author julie.jacques
 */
public class ThreadStationMeteo extends Thread {
    
    protected Station station;
    protected DonneeStationObservable observable;
    
    public ThreadStationMeteo(Station station, DonneeStationObservable donneeStationObservable){
        this.observable = donneeStationObservable;
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
            this.observable.notifierObservateurs(donnees);
        }
    }
}
