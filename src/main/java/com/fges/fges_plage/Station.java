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
public class Station {
    
    protected static int MIN_VENT = 0;
    protected static int MAX_VENT = 10;
    protected static int MIN_TEMP_EAU = 12;
    protected static int MAX_TEMP_EAU = 22; // faut pas rêver non plus c'est le nord :)
    protected static int MIN_BACTERIES = 0;
    protected static int MAX_BACTERIES = 2000;
    protected static int MIN_TEMP_AIR = -10;
    protected static int MAX_TEMP_AIR = 35;
    
    protected DonneeStation historique = null; 
    
    /**
     * retourne une valeur quand les capteurs le veulent bien
     * @return 
     */
    public DonneeStation attenteCapteurs(){
        // dort une durée aléatoire
        int nbSecondesDodo = (int) (5 + (Math.random() * 10));
        try {
            Thread.sleep(1000*nbSecondesDodo);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        
        // génère des données pour les capteurs
        if(historique == null){
            init();
        }else{
            historique = genereDelta();
        }
        return historique;
    }
    
    protected void init(){
        DonneeStation resultat = new DonneeStation();
        resultat.setNbBacteriesPar100ml((int) (MIN_BACTERIES + (Math.random() * (MAX_BACTERIES-MIN_BACTERIES))));
        resultat.setTemperatureAir((int) (MIN_TEMP_AIR + (Math.random() * (MAX_TEMP_AIR-MIN_TEMP_AIR))));
        resultat.setTemperatureEau((int) (MIN_TEMP_EAU + (Math.random() * (MAX_TEMP_EAU-MIN_TEMP_EAU))));
        resultat.setVent((int) (MIN_VENT + (Math.random() * (MAX_VENT-MIN_VENT))));
        historique = resultat;
    }
    
    /**
     * Genere des nouvelles données station qui sont légèrement différentes !
     * @return 
     */
    protected DonneeStation genereDelta(){
        DonneeStation resultat = new DonneeStation();
        resultat.setNbBacteriesPar100ml(
                genereNouvelleValeur(historique.getNbBacteriesPar100ml(), 
                                     MIN_BACTERIES, MAX_BACTERIES));
        resultat.setTemperatureAir(
                genereNouvelleValeur(historique.getTemperatureAir(), 
                                     MIN_TEMP_AIR, MAX_TEMP_AIR));
        resultat.setTemperatureEau(
                genereNouvelleValeur(historique.getTemperatureEau(),
                                     MIN_TEMP_EAU, MAX_TEMP_EAU));
        resultat.setVent(
                genereNouvelleValeur(historique.getVent(),
                                    MIN_VENT, MAX_VENT));
        return resultat;
    }
    
    protected int genereNouvelleValeur(int valeur, int min, int max){
        int delta = (int) (Math.random()*3);
        switch(delta){
            case 0 :
                return valeur;
            case 1 : // on ajoute 1
                return Math.min(valeur+1, max);
            default : // on enlève 1
                return Math.max(valeur-1, min);
        }
    }
}
