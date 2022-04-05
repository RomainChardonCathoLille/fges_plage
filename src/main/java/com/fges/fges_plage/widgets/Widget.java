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
public abstract class Widget {
    
    protected DonneeStation derniereDonnee = null;
    
    public abstract void afficher(PrintStream stream);
    
    public Widget(DonneeStation donneeInit){
        this.derniereDonnee = donneeInit;
    }
    
}
