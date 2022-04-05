package com.fges.fges_plage;

import com.fges.fges_plage.Interfaces.DonneeStationObservable;
import com.fges.fges_plage.Interfaces.DonneeStationObserver;
import com.fges.fges_plage.Station.DonneeStation;

import java.util.LinkedList;
import java.util.List;

public class DonneeStationObervableImpl implements DonneeStationObservable {

    List<DonneeStationObserver> observateurs = new LinkedList<>();

    @Override
    public void enregistrerObservateur(DonneeStationObserver donneeStationObserver) {
        this.observateurs.add(donneeStationObserver);
    }

    @Override
    public void supprimerObservateur(DonneeStationObserver donneeStationObserver) {
        this.observateurs.remove(donneeStationObserver);
    }

    @Override
    public void notifierObservateurs(DonneeStation donneeStation) {
        for(DonneeStationObserver observer: observateurs){
            observer.actualiser(donneeStation);
        }
    }
}
