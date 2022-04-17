/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.fges_plage;

import java.util.List;
import java.util.ArrayList;

import com.fges.fges_plage.Interfaces.DonneeStationObserver;
import com.fges.fges_plage.Station.DonneeStation;
import com.fges.fges_plage.Station.Station;
import com.fges.fges_plage.Threads.ThreadAffichageWidgets;
import com.fges.fges_plage.Threads.ThreadStationMeteo;
import com.fges.fges_plage.widgets.*;

/**
 *
 * @author julie.jacques
 */
public class App {
    
    public static void main(String args[]){
    
        
        System.out.println("Bienvenue sur FGES Plage !");
        
        // contact de la station pour initialisation
        Station station = new Station();
        DonneeStation donneeStation = station.attenteCapteurs();
        
        // initialisation des widgets
        List<Widget> widgets = new ArrayList<Widget>();
        widgets.add(new WidgetDrapeau(donneeStation));
        widgets.add(new WidgetQualiteEau(donneeStation));
        widgets.add(new WidgetTemperature(donneeStation));
        widgets.add(new WidgetCharAVoile(donneeStation));

        // Abonnement station & widgets
        DonneeStationObervableImpl observable = new DonneeStationObervableImpl();
        for(Widget widget: widgets){
            observable.enregistrerObservateur((DonneeStationObserver) widget);
        }
        
        /// Affichage des mises à jour de la station
        ThreadStationMeteo threadStationMeteo = new ThreadStationMeteo(station, observable);
        threadStationMeteo.start();

        /// Affichage des Widgets
        ThreadAffichageWidgets affichageWidgets = new ThreadAffichageWidgets(widgets);
        affichageWidgets.start();
        
    }

}
