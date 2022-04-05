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
public class DonneeStation {
    
    protected int vent;
    protected int temperatureAir;
    protected int temperatureEau;
    protected int nbBacteriesPar100ml; // seuil 1000

    public int getVent() {
        return vent;
    }

    public void setVent(int vent) {
        this.vent = vent;
    }

    public int getTemperatureAir() {
        return temperatureAir;
    }

    public void setTemperatureAir(int temperatureAir) {
        this.temperatureAir = temperatureAir;
    }

    public int getTemperatureEau() {
        return temperatureEau;
    }

    public void setTemperatureEau(int temperatureEau) {
        this.temperatureEau = temperatureEau;
    }

    public int getNbBacteriesPar100ml() {
        return nbBacteriesPar100ml;
    }

    public void setNbBacteriesPar100ml(int nbBacteriesPar100ml) {
        this.nbBacteriesPar100ml = nbBacteriesPar100ml;
    }

}