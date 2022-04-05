/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.fges_plage;
import com.fges.fges_plage.widgets.Widget;
import java.util.List;

/**
 *
 * @author julie.jacques
 */
public class ThreadAffichageWidgets extends Thread {
    
    private static int NB_SECONDES_REFRESH = 5;
    
    protected List<Widget> widgets;
    
    public ThreadAffichageWidgets(List<Widget> widgets){
        this.widgets = widgets;
    }
    
    public void run(){
        while (true){
            System.out.println("Affichage des widgets (refresh : " + NB_SECONDES_REFRESH + " secondes)");
            for (Widget w : widgets){
                w.afficher(System.out);
            }
            try{
                Thread.sleep(1000*NB_SECONDES_REFRESH);
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
    
}