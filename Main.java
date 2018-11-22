package strike;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame{
	
	private JButton jugar;
	private JButton record;
	private JPanel boton;
	
	
	public Main(){
		
		Container cp =this.getContentPane();
		cp.setLayout(new GridLayout(1,1));
		
		JPanel boton = new JPanel();
		jugar= new JButton("Jugar");
		
		record=new JButton("Record");
		
		boton.add(jugar);
		boton.add(record);
		
		jugar.addActionListener (new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaJuego ven = new VentanaJuego();
				ven.setVisible(true);
				
				}
		
			
		});
		
		record.addActionListener (new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaJuego ven2 = new VentanaJuego();
				ven2.setVisible(true);

				}
			
			
		});
		
		cp.add(boton);
	
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Strike");
		
		
		
	}	

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Main();
			}
			
		});

	}

}
