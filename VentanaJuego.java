package strike;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaJuego extends JFrame{
	
	public VentanaJuego() {
		
		
		
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Strike");
		this.setSize(2000, 600);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaJuego();
			}
			
		});

	}

}
