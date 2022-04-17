package com.fges.fges_plage.widgets;

import com.fges.fges_plage.Station.DonneeStation;

import java.io.PrintStream;

public class WidgetCharAVoile extends Widget{
    public WidgetCharAVoile(DonneeStation donneeInit) {
        super(donneeInit);
    }

    public void afficher(PrintStream stream){
        stream.println("Char a voile");
        stream.println("========");
        if(super.derniereDonnee.getVent()>=3){
            stream.println("Char a voile possible !");
        } else {
            stream.println("Char a voile impossible ! ");
        }
    }
}
