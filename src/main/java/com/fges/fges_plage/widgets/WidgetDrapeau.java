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
public class WidgetDrapeau 
        extends Widget {

    public WidgetDrapeau(DonneeStation donneeInit) {
        super(donneeInit);
    }

    public void afficher(PrintStream stream){
        stream.println("Drapeaux");
        stream.println("========");
        if(super.derniereDonnee.getVent()<4){
            stream.println("Drapeau Vert : baignade autorisée");
        }else if(super.derniereDonnee.getVent()>6){
            stream.println("Drapeau Rouge : baignade interdite");
        }else {
            stream.println("Drapeau Orange : baignage autorisée mais soyez prudents !");
        }
    }
    
}
