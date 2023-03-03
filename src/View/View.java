package View;

import javax.swing.*;
import java.awt.*;


public class View extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana();
            }
        });
    }
}

class Ventana extends JFrame {
    public Ventana(){
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
        setVisible(true);

        PanelEleccion panelEleccion = new PanelEleccion();
        panelEleccion.setVisible(false);
        add(panelEleccion);

        PanelJuego Paneljuego = new PanelJuego();;
        Paneljuego.setVisible(true);
        add(Paneljuego); //el que este en true debe ir arriba, fijarse como modificar eso desde fuera
    }
}

class PanelEleccion extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font miFuente = new Font("Arial", Font.BOLD, 30);
        g2.setFont(miFuente);

        g2.drawString("Piedra, papel o tijera", 350, 50);
        setBackground(new Color(205, 236, 144));

        Font miFuente2 = new Font("Arial", Font.PLAIN, 25);
        g2.setFont(miFuente2);

        g2.drawString("Elija la cantidad de rondas", 50, 100);
    }

    public PanelEleccion(){
        setLayout(null);
        Font fuente = new Font("Arial", Font.PLAIN, 25);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        add(ronda1);
        add(ronda3);
        add(ronda5);

        ronda1.setBounds(50, 200, 200, 100);
        ronda1.setFont(fuente);
        ronda1.setCursor(cursor);
        ronda1.setBorderPainted(false);
        ronda1.setContentAreaFilled(false);

        ronda3.setBounds(350, 200, 200, 100);
        ronda3.setFont(fuente);
        ronda3.setCursor(cursor);
        ronda3.setBorderPainted(false);
        ronda3.setContentAreaFilled(false);

        ronda5.setBounds(650, 200, 200, 100);
        ronda5.setFont(fuente);
        ronda5.setCursor(cursor);
        ronda5.setBorderPainted(false);
        ronda5.setContentAreaFilled(false);

    }

    public JButton ronda1 = new JButton("1 RONDA");
    public JButton ronda3 = new JButton("3 RONDAS");
    public JButton ronda5 = new JButton("5 RONDAS");
}

class PanelJuego extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font miFuente = new Font("Arial", Font.BOLD, 30);
        g2.setFont(miFuente);

        g2.drawString("Piedra, papel o tijera", 350, 50);
        setBackground(new Color(205, 236, 144));

        Font miFuente2 = new Font("Arial", Font.PLAIN, 25);
        g2.setFont(miFuente2);

        g2.drawString("Elija su ataque (Debe seleccionar tantos ataques como rondas haya elegido).", 50, 100);
    }
    public PanelJuego(){
        setLayout(null);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        rockButton.setBounds(50, 150, 200, 200);
        rockButton.setBackground(new Color(0,0,0,0));
        rockButton.setBorderPainted(false);
        rockButton.setContentAreaFilled(false);
        rockButton.setCursor(cursor);

        paperButton.setBounds(300, 150, 200, 200);
        paperButton.setBackground(new Color(0,0,0,0));
        paperButton.setBorderPainted(false);
        paperButton.setContentAreaFilled(false);
        paperButton.setCursor(cursor);

        scissorsButton.setBounds(550, 150, 200, 200);
        scissorsButton.setBackground(new Color(0,0,0,0));
        scissorsButton.setBorderPainted(false);
        scissorsButton.setContentAreaFilled(false);
        scissorsButton.setCursor(cursor);

    }
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    Image rock = toolkit.getImage("src/View/piedra.png");
    public JButton rockButton = new JButton(new ImageIcon(rock));

    Image paper = toolkit.getImage("src/View/paper.png");
    public JButton paperButton = new JButton(new ImageIcon(paper));

    Image scissors = toolkit.getImage("src/View/tijera.png");
    public JButton scissorsButton = new JButton(new ImageIcon(scissors));
}

class PanelFinal {

}

