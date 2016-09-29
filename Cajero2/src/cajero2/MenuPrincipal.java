package cajero2;
	

	import javax.swing.JFrame;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	

	public class MenuPrincipal extends JFrame implements ActionListener {
	

	    JButton boton1, boton2, boton3;
	    JTextField pantalla;
	

	    public MenuPrincipal(){
	        
	        setLayout(null);
	        setSize(270, 300);
	        setLocation(600, 200);
	        setTitle("CAJERO");
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        setResizable(false);
	

	        pantalla = new JTextField("¡Bienvenido! Escoge la opcion deseada");
	        pantalla.setLocation(0,0);
	        pantalla.setSize(300,40);
	        pantalla.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
	        pantalla.setEditable(false);
	        pantalla.setBackground(Color.white);
	        add(pantalla);
	

	        boton1 = new JButton("Crear cuenta");
	        boton1.setLocation(55, 70);
	        boton1.setSize(120, 50);
	        add(boton1);
	        boton1.addActionListener(this);
	        
	        boton2 = new JButton("Abonar");
	        boton2.setLocation(55, 130);
	        boton2.setSize(120, 50);
	        add(boton2);
	        boton2.addActionListener(this);
	        
	        boton3 = new JButton("Retirar");
	        boton3.setLocation(55, 190);
	        boton3.setSize(120, 50);
	        add(boton3);
	        boton3.addActionListener(this);
	      
	        setVisible(true);
	    }
	

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String cadb = e.getActionCommand();
	        if(cadb.equals("Crear cuenta")){
	            dispose();
	             Cuenta uno = new Cuenta();
	        } else if(cadb.equals("Abonar")){
	            dispose();
	            Abonar uno = new Abonar();
	        } else if(cadb.equals("Retirar")){
	            dispose();
	            Retirar uno = new Retirar();
	        }        
	    }
	}
