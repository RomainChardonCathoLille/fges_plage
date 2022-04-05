package com.fges.fges_plage.Interfaces;


import com.fges.fges_plage.Station.DonneeStation;

public interface DonneeStationObservable {
    public void enregistrerObservateur(DonneeStationObserver donneeStationObserver);
    public void supprimerObservateur(DonneeStationObserver donneeStationObserver);
    public void notifierObservateurs(DonneeStation donneeStation);
}
