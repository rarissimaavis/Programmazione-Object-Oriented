package gui;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.Squadra;

public class GUI extends JFrame 
{
	private Squadra squadra;
	
	public GUI(Squadra squadra)
	{
		this.squadra = squadra;
		setSize(500, 150);
		setLocation(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = buildPanel();
		add(mainPanel);
	}

	private JPanel buildPanel() 
	{
		JPanel mainPanel = new JPanel();
		JPanel formPanel = new JPanel();
		JLabel numLabel = new JLabel("Num max giocatori per squadra");
		JTextField numText = new JTextField("", 3);
		JButton button = new JButton("Inserisci");
		
		button.addActionListener((ActionEvent e) ->
		{
			int n = Integer.parseInt(numText.getText());
		
			squadra.Modifica(n);
			System.out.println("\nNumero massimo aggiornato: " + squadra.getMaxGiocatori() + "\n");
		});
		
		formPanel.add(numLabel);
		formPanel.add(numText);
		formPanel.add(button);
		
		mainPanel.add(formPanel);
		
		return mainPanel;
	}
}