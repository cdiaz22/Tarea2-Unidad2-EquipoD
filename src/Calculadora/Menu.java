package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Menu extends JFrame {
    public JPanel panelP;
    private JLabel textoSeleccion;
    private JButton bSuma;
    private JButton bRes;
    private JButton bDiv;
    private JButton bMulti;
    private JButton bSalir;

    public Menu(){
        this.setSize(500,500);
        this.setMinimumSize(new Dimension(500,500));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Operaciones");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setUndecorated(true);
        iniciarComponentes();
        open(true);

    }

    private void open(boolean show){
        this.setVisible(show);
    }

    private void iniciarComponentes(){
        colocarPanel();
        menuSeleccion();
        textoPanel();
    }

    private void colocarPanel(){
        panelP = new JPanel();
        panelP.setLayout(null);
        this.getContentPane().add(panelP);

    }

    private void menuSeleccion(){
        botonSuma();
        botonResta();
        botonDivision();
        botonMultiplicacion();
        botonSalir();
    }

    private void textoPanel(){
        textoSeleccion = new JLabel();
        textoSeleccion.setText("Por favor seleccione una operación");
        textoSeleccion.setBounds(5, 10, 500, 24);
        textoSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
        textoSeleccion.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));
        textoSeleccion.setForeground(Color.BLACK);
        this.add(textoSeleccion);

        //fantasma
        JLabel text = new JLabel(); //titulo de Organico
        text.setText("");//texto
        text.setBounds(0, 0, 0,0);
        this.add(text);
    }

    private void botonSuma(){
        bSuma = new JButton();
        bSuma.setText("Suma");
        bSuma.setBounds(50, 80, 400,30);
        bSuma.setHorizontalAlignment(SwingConstants.CENTER);
        bSuma.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));
        bSuma.setForeground(Color.BLACK);
        bSuma.setOpaque(false);
        bSuma.setContentAreaFilled(false); //le da el color del fondo
        bSuma.setBorderPainted(false); //pinta el borde del boton
        this.add(bSuma);

        ActionListener oyeSuma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Suma sum = new Suma();
            }
        };
        bSuma.addActionListener(oyeSuma);
    }

    private void botonResta(){
        bRes = new JButton();
        bRes.setText("Resta");
        bRes.setBounds(4, 130, 500,30);
        bRes.setHorizontalAlignment(SwingConstants.CENTER);
        bRes.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));
        bRes.setForeground(Color.BLACK);
        bRes.setOpaque(false);
        bRes.setContentAreaFilled(false); //le da el color del fondo
        bRes.setBorderPainted(false); //pinta el borde del boton
        this.add(bRes);

        ActionListener oyeResta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resta res = new Resta();
            }
        };
        bRes.addActionListener(oyeResta);
    }

    private void botonDivision(){
        bDiv = new JButton();
        bDiv.setText("División");
        bDiv.setBounds(4, 180, 500,30);
        bDiv.setHorizontalAlignment(SwingConstants.CENTER);
        bDiv.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));
        bDiv.setForeground(Color.BLACK);
        bDiv.setOpaque(false);
        bDiv.setContentAreaFilled(false); //le da el color del fondo
        bDiv.setBorderPainted(false); //pinta el borde del boton
        this.add(bDiv);

        ActionListener oyeDivision = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Division div = new Division();

            }
        };
        bDiv.addActionListener(oyeDivision);
    }

    private void botonMultiplicacion(){
        bMulti = new JButton();
        bMulti.setText("Multiplicación");
        bMulti.setBounds(4, 230, 500,30);
        bMulti.setHorizontalAlignment(SwingConstants.CENTER);
        bMulti.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));
        bMulti.setForeground(Color.BLACK);
        bMulti.setOpaque(false);
        bMulti.setContentAreaFilled(false); //le da el color del fondo
        bMulti.setBorderPainted(false); //pinta el borde del boton
        this.add(bMulti);

        ActionListener oyeMulti = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Multiplicacion multi = new Multiplicacion();
            }
        };
        bMulti.addActionListener(oyeMulti);
    }

    private void botonSalir(){
        bSalir = new JButton();
        bSalir.setText("Salir");
        bSalir.setBounds(4, 280, 500,30);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.setFont(new Font("bahnschrift semibold", Font.PLAIN, 30));
        bSalir.setForeground(Color.BLACK);
        bSalir.setOpaque(false);
        bSalir.setContentAreaFilled(false); //le da el color del fondo
        bSalir.setBorderPainted(false); //pinta el borde del boton
        this.add(bSalir);

        ActionListener oyeSalir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        bSalir.addActionListener(oyeSalir);

       //fantasma
        JLabel text = new JLabel(); //titulo de Organico
        text.setText("");//texto
        text.setBounds(0, 0, 0,0);
        this.add(text);
    }
}
