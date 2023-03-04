package Controller;

import Model.Model;
import View.View;
import View.PanelEleccion;
import View.PanelJuego;
import View.PanelFinal;
import View.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public Model m;
    public View v;
    public PanelEleccion pE;
    public PanelJuego pJ;
    public PanelFinal pF;
    public Ventana vent;


    public Controller(Model m, View v, PanelEleccion pE, PanelJuego pJ, PanelFinal pF, Ventana vent){
        this.m = m;
        this.v = v;
        this.pE = pE;
        this.pJ = pJ;
        this.pF = pF;
        this.vent = vent;

        vent.paneles.add(pE, "pE");
        vent.paneles.add(pJ, "pJ");
        vent.paneles.add(pF, "pF");

        vent.setVisible(true);
        vent.cardLayout.show(vent.paneles, "pE");

        pE.ronda1.addActionListener(e -> ronda1ButtonPressed());//Checkear por que los botones no llaman al metodo. Probar poner el addevent en el archivo origen de cada boton
        pE.ronda3.addActionListener(e -> ronda3ButtonPressed());
        pE.ronda5.addActionListener(e -> ronda5ButtonPressed());

        pJ.rockButton.addActionListener(e -> rockButtonPressed());
        pJ.paperButton.addActionListener(e -> paperButtonPressed());
        pJ.scissorsButton.addActionListener(e -> scissorsButtonPressed());

        pF.reiniciar.addActionListener(e -> reiniciarButtonPressed());
        pF.salir.addActionListener(e -> salirButtonPressed());
    }
    private void ronda1ButtonPressed(){
        System.out.println("Hola"); //FUNCIONAAAAAAA, AGREGAR TODOS LOS METODOS CORRESPONDIENTES
    }

    private void ronda3ButtonPressed(){

    }
    private void ronda5ButtonPressed(){

    }

    private void rockButtonPressed(){

    }

    private void paperButtonPressed(){

    }

    private void scissorsButtonPressed(){

    }

    private void reiniciarButtonPressed(){

    }

    private void salirButtonPressed(){

    }
}
