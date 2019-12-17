package Test_Sub1;

import java.awt.FlowLayout;
import java.util.Collection;
import java.util.Vector;

import javax.swing.*;

public class Fereastra extends JFrame{
	
		JLabel label1;
		JTextField textfield1;
		JButton button1;
		JTextArea area1;
		Collection<Local>lista = new Vector<Local>();
		public Fereastra(String titlu, Collection<Local> lista_restaurante )
		{
			super(titlu);
			setSize(500, 500);
			setLocation(150, 150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			label1 = new JLabel("Stergere: ");
			textfield1 = new JTextField(10);
			button1 = new JButton("Sterge");
			setLayout(new FlowLayout());
			add(label1);
			add(textfield1);
			add(button1);
			button1.addActionListener(new ButtonApasat(textfield1));
			
			area1 = new JTextArea();
			add(area1);
			this.lista = lista_restaurante;
			for (Local local : lista_restaurante) {
				area1.append(local.toString());
				
			}
			
		}
}
