package Controller;

import Model.Model;
import View.View;
import View.PanelEleccion;
import View.PanelJuego;
import View.PanelFinal;
import View.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
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

        vent.setVisible(true);
        vent.cardLayout.show(vent.paneles, "pF");

        pE.ronda1.addActionListener(this);//Checkear por que los botones no llaman al metodo. Probar poner el addevent en el archivo origen de cada boton
        pE.ronda3.addActionListener(this);
        pE.ronda5.addActionListener(this);

        pJ.rockButton.addActionListener(this);
        pJ.paperButton.addActionListener(this);
        pJ.scissorsButton.addActionListener(this);

        pF.reiniciar.addActionListener(this);
        pF.salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(pE.ronda1)){
            m.rondas(1);
            vent.cardLayout.show(vent.paneles, "pJ");
        } else if (e.getSource() == pE.ronda3) {
            m.rondas(3);
        } else if (e.getSource() == pE.ronda5) {
            m.rondas(5);
        } else if (e.getSource() == pJ.rockButton) {
            m.combate(1);
        } else if (e.getSource() == pJ.paperButton) {
            m.combate(2);
        } else if (e.getSource() == pJ.scissorsButton) {
            m.combate(3);
        } else if (e.getSource() == pF.reiniciar) {
            m.reiniciar();
        } else if (e.getSource() == pF.salir) {
            m.salir();
        }
    }
}
