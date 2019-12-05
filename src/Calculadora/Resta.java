package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Resta extends JFrame {
    public JPanel panelR;
    private JLabel textoSeleccion;
    private JLabel textA;
    private JLabel textB;
    private JLabel resultadoR;
    private JTextField datoA;
    private JTextField datoB;
    private JButton bResta;
    private JButton bRegresar;
    private JButton bSalir;

    public Resta(){
        this.setSize(500,500);
        this.setMinimumSize(new Dimension(500,500));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Resta");
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
        textoPanel();
        botonRegresar();
        botonSalir();
        todaS();
    }

    private void colocarPanel(){
        panelR = new JPanel();
        panelR.setLayout(null);
        this.getContentPane().add(panelR);
        //this.setContentPane(panelS);

    }


    private void textoPanel(){
        textoSeleccion = new JLabel();
        textoSeleccion.setText("Por favor ingrese dos números");
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

    public void todaS(){
        //Texto de Dato A
        textA = new JLabel();
        textA.setText("Por favor ingrese Dato A");
        textA.setBounds(5, 60, 300, 24);
        textA.setHorizontalAlignment(SwingConstants.LEFT);
        textA.setFont(new Font("bahnschrift semibold", Font.PLAIN, 14));
        textA.setForeground(Color.BLACK);
        this.add(textA);

        //Ingresar Dato A
        datoA = new JTextField();
        datoA.setBounds(20, 100, 100, 24);
        this.add(datoA);
        //String na = datoA.getText();
        //num1 = Double.parseDouble(na);

        //Texto de Dato B
        textB = new JLabel();
        textB.setText("Por favor ingrese Dato B");
        textB.setBounds(230, 60, 300, 24);
        textB.setHorizontalAlignment(SwingConstants.CENTER);
        textB.setFont(new Font("bahnschrift semibold", Font.PLAIN, 14));
        textB.setForeground(Color.BLACK);
        this.add(textB);

        //Ingreso Dato B
        datoB = new JTextField();
        datoB.setBounds(350, 100, 100, 24);
        this.add(datoB);
        //String nb = datoB.getText();
        //num2 = Double.parseDouble(nb);

        //Boton de oprecarion
        bResta = new JButton();
        bResta.setText("Restar");
        bResta.setBounds(90, 180, 300,24);
        bResta.setHorizontalAlignment(SwingConstants.CENTER);
        bResta.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));
        bResta.setForeground(Color.BLACK);
        bResta.setOpaque(false);
        bResta.setContentAreaFilled(false); //le da el color del fondo
        bResta.setBorderPainted(false); //pinta el borde del boton
        this.add(bResta);

        //Resultado
        resultadoR = new JLabel();
        resultadoR.setBounds(85, 60, 300, 24);
        resultadoR.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoR.setFont(new Font("bahnschrift semibold", Font.PLAIN, 20));
        resultadoR.setForeground(Color.BLUE);
        this.add(resultadoR);

        ActionListener oyeResta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(datoA.getText());
                Double num2 = Double.parseDouble(datoB.getText());
                Double r = num1 - num2;
                String rS = Double.toString(r);
                resultadoR.setText(rS);
            }
        };
        bResta.addActionListener(oyeResta);
    }

    private void botonRegresar(){
        bRegresar = new JButton();
        bRegresar.setText("Regresar");
        bRegresar.setBounds(4, 380, 300,30);
        bRegresar.setHorizontalAlignment(SwingConstants.LEFT);
        bRegresar.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));
        bRegresar.setForeground(Color.BLACK);
        bRegresar.setOpaque(false);
        bRegresar.setContentAreaFilled(false); //le da el color del fondo
        bRegresar.setBorderPainted(false); //pinta el borde del boton
        this.add(bRegresar);

        ActionListener oyeRegresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open(false);
            }
        };
        bRegresar.addActionListener(oyeRegresar);
    }

    private void botonSalir(){
        bSalir = new JButton();
        bSalir.setText("Salir");
        bSalir.setBounds(300, 380, 300,30);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.setFont(new Font("bahnschrift semibold", Font.PLAIN, 24));
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
