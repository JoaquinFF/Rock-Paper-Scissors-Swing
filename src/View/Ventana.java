package View;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public JPanel paneles;
    public CardLayout cardLayout = new CardLayout();

    public Ventana(){

        PanelEleccion panelEleccion = new PanelEleccion();
        PanelJuego panelJuego = new PanelJuego();
        PanelFinal panelFinal = new PanelFinal();

        paneles = new JPanel(cardLayout);
        paneles.add(panelEleccion, "pE");
        paneles.add(panelJuego, "pJ");
        paneles.add(panelFinal, "pF");

        add(paneles);

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension dimensionPantalla = miPantalla.getScreenSize();

        int width = dimensionPantalla.width;
        int height = dimensionPantalla.height;

        setSize(width/2, height/2);
        setLocation(width/4, height/4);

        setTitle("Piedra, papel o tijera");

        Image icon = miPantalla.getImage("src/View/icon.jpg");
        setIconImage(icon);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}
