import Model.Model;
import View.View;
import View.PanelEleccion;
import View.PanelJuego;
import View.PanelFinal;
import View.Ventana;
import Controller.Controller;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        View v = new View();
        PanelEleccion pE = new PanelEleccion();
        PanelJuego pJ = new PanelJuego();
        PanelFinal pF = new PanelFinal();
        Ventana vent = new Ventana();
        Model m = new Model(vent);
        Controller c = new Controller(m, v, pE, pJ, pF, vent);
    }
}