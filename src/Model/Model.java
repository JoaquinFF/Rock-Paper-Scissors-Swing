package Model;

import View.View;
import View.PanelEleccion;
import View.PanelJuego;
import View.PanelFinal;
import View.Ventana;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Random;

public class Model {
    public PanelEleccion pE = new PanelEleccion();
    public PanelJuego pJ = new PanelJuego();
    public PanelFinal pF = new PanelFinal();
    public Ventana vent;
    public int nRondas = 0;
    public String[] arrayAtaques;
    public String[] arrayAtaquesEnemigo;
    protected int numeroAtaques = 0;

    public Model(Ventana vent){
        this.vent = vent;
    }

    public void rondas(int nRondas){
        this.nRondas = nRondas;
        arrayAtaques = new String[nRondas];
        arrayAtaquesEnemigo = new String[nRondas];
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

            arrayAtaquesEnemigo[numeroAtaques] = ataquesAleatorios();

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

    public String ataquesAleatorios(){
        Random rand = new Random();
        int numAtaque = rand.nextInt(3);
        if (numAtaque ==  0){
            return "PIEDRA";
        } else if (numAtaque == 1) {
            return "PAPEL";
        } else {
            return "TIJERA";
        }
    }

    public void reiniciar(){
        vent.cardLayout.show(vent.paneles, "pE");
        nRondas = 0;
        numeroAtaques = 0;
    }

    public void salir(){
        vent.dispose();
    }
}
