package Model;

import View.View;
import View.PanelEleccion;
import View.PanelJuego;
import View.PanelFinal;
import View.Ventana;
import java.lang.reflect.Array;

public class Model {
    public PanelEleccion pE = new PanelEleccion();
    public PanelJuego pJ = new PanelJuego();
    public PanelFinal pF = new PanelFinal();
    public Ventana vent;
    public int nRondas;
    public int[] arrayAtaques;

    public Model(Ventana vent){
        this.vent = vent;
    }

    public void rondas(int nRondas){
        this.nRondas = nRondas;
        arrayAtaques = new int[nRondas];

        vent.cardLayout.show(vent.paneles, "pJ");
    }

    public void combate(int ataque){
        //la funcion de combate,
        //Revise si el boton se ha tocado la cantidad de veces esperada
        //y si es asi, cambie la ventana
    }

    public void reiniciar(){

    }

    public void salir(){

    }
}
