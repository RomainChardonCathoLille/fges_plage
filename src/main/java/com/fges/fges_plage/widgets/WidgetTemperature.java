/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.fges_plage.widgets;

import com.fges.fges_plage.DonneeStation;
import java.io.PrintStream;

/**
 *
 * @author julie.jacques
 */
public class WidgetTemperature
    extends Widget {

    public WidgetTemperature(DonneeStation donneeInit) {
        super(donneeInit);
    }

    public void afficher(PrintStream stream){
        stream.println("Températures");
        stream.println("============");
        stream.println("Air: " + super.derniereDonnee.getTemperatureAir() 
                     + " Eau : " + super.derniereDonnee.getTemperatureEau());
    }
}