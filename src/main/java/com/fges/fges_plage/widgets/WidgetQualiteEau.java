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
public class WidgetQualiteEau 
    extends Widget {

    public WidgetQualiteEau(DonneeStation donneeInit) {
        super(donneeInit);
    }

    public void afficher(PrintStream stream){
        stream.println("Qualité de l'eau");
        stream.println("================");
        if(super.derniereDonnee.getNbBacteriesPar100ml()>=1000){
            stream.println("eau impropre à la baignade");
        }else{
            stream.println("l'eau est propre");
        }
    }
    
}
