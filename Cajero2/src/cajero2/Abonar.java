package cajero2;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Abonar extends JFrame implements ActionListener {

    JButton boton2;
    JTextField pantalla;

    public Abonar() {
        
        setLayout(null);
        setSize(250, 300);
        setLocation(600, 200);
        setTitle("ABONO");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pantalla = new JTextField();
        pantalla.setLocation(0,0);
        pantalla.setSize(300,40);
        pantalla.setFont(new Font("Arial Narrow", Font.ITALIC, 20));
        pantalla.setEditable(true);
        pantalla.setBackground(Color.white);
        add(pantalla);

     
        
        boton2 = new JButton("Aceptar");
        boton2.setLocation(55, 130);
        boton2.setSize(120, 50);
        add(boton2);
        boton2.addActionListener(this);
        
  
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String cadb = e.getActionCommand();
        if(cadb.equals("Aceptar"))
        {
             JOptionPane.showMessageDialog(null, "Abono realizado con éxito");
             dispose();
             MenuPrincipal uno = new MenuPrincipal();
        }
   

        
    }

}