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
    public String[] arrayAtaques;
    protected int numeroAtaques = 0;

    public Model(Ventana vent){
        this.vent = vent;
    }

    public void rondas(int nRondas){
        this.nRondas = nRondas;
        arrayAtaques = new String[nRondas];
        vent.cardLayout.show(vent.paneles, "pJ");
    }

    public void combate(int ataque){
        String texto = "";
        if(numeroAtaques < nRondas ){
            if(ataque == 1){
                arrayAtaques[numeroAtaques] = "PIEDRA";
            } else if (ataque == 2) {
                arrayAtaques[numeroAtaques] = "PAPEL";
            } else {
                arrayAtaques[numeroAtaques] = "TIJERA";
            }

            for(int i = 0; i <= numeroAtaques; i++){
                texto = arrayAtaques[i] + ", ";
                //System.out.println(texto);
                pJ.updateMessage(texto);
            }

            numeroAtaques++;

            if(numeroAtaques == nRondas){
               vent.cardLayout.show(vent.paneles, "pF");
            }
        }
    }

    public void reiniciar(){

    }

    public void salir(){

    }
}
