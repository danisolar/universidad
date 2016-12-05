package universidad.paradigmas.mvc;
import java.awt.GridLayout;

import javax.swing.*;

public class OperacionCuentaView extends JFrame{

	JFrame OperacionCuentaView = new JFrame();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JLabel l1 = new JLabel("Ingrese la cuenta de destino");
	JLabel l2 = new JLabel("Ingrese el monto");
	JLabel l3 = new JLabel("Transferencia a Terceros");
	JTextField caja1 = new JTextField(20);
	JTextField caja2 = new JTextField(20);
	JButton b1 = new JButton("Continuar");
	
	public OperacionCuentaView(){
		setBounds(100,100,400,400);
		p1.add(l3);
		p2.add(l1);
		p2.add(caja1);
		p3.add(l2);
		p3.add(caja2);
		p5.add(b1);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		
		setLayout(new GridLayout(5, 1));
	}
	
}
