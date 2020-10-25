package IntefazConUsuario;

import Operacion.Romboide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestaniaRomboide extends Inicio {
	private final JTextField ladoATextField;
	private final JTextField baseTextField;
	private final JTextField alturaTextField;
	private final JLabel perimetroJLabel;
	private final JLabel areaJLabel;
	private final JPanel romboideJPanel;
	private final static String instruccionesText = "Aquí podras calcular el area y perimetro de un romboide." +
			"\nProporcionando la base y la altura.\nPara mostrar los resultados presionar el boton \"Calcular\"";

	public JPanel getRomboideJPanel() {
		return romboideJPanel;
	}

	public void reiniciar() {
		ladoATextField.setText("");
		baseTextField.setText("");
		alturaTextField.setText("");
		perimetroJLabel.setText("");
		areaJLabel.setText("");
		ventana.pack();
	}

	public PestaniaRomboide() {
		romboideJPanel = new JPanel();
		romboideJPanel.setLayout(new GridBagLayout());
		JPanel descripcionJPanel = new JPanel();
		descripcionJPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		romboideJPanel.add(descripcionJPanel, gbc);
		JTextArea descripcionTextArea = new JTextArea();
		descripcionTextArea.setEditable(false);
		descripcionTextArea.setText(instruccionesText);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(descripcionTextArea, gbc);
		final JPanel spacer1 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 5;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer1, gbc);
		JLabel ladoAJLabel = new JLabel();
		ladoAJLabel.setText("Lado A:");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(ladoAJLabel, gbc);
		JLabel baseJLabel = new JLabel();
		baseJLabel.setText("Base: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(baseJLabel, gbc);
		final JPanel spacer2 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer2, gbc);
		ladoATextField = new JTextField();
		ladoATextField.setToolTipText("Ingrese la medida del lado A");
		ladoAJLabel.setLabelFor(ladoATextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(ladoATextField, gbc);
		baseTextField = new JTextField();
		baseTextField.setToolTipText("Ingrese la base");
		baseJLabel.setLabelFor(baseTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(baseTextField, gbc);
		JLabel alturaJLabel = new JLabel();
		alturaJLabel.setText("Altura: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(alturaJLabel, gbc);
		alturaTextField = new JTextField();
		alturaTextField.setToolTipText("Ingrese la altura");
		alturaJLabel.setLabelFor(alturaTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(alturaTextField, gbc);
		final JPanel spacer3 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer3, gbc);
		final JPanel spacer4 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer4, gbc);
		JButton calcularButton = new JButton();
		calcularButton.setText("Calcular Romboide");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(calcularButton, gbc);
		final JPanel spacer5 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		romboideJPanel.add(spacer5, gbc);
		JPanel resultadosJPanel = new JPanel();
		resultadosJPanel.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		romboideJPanel.add(resultadosJPanel, gbc);
		perimetroJLabel = new JLabel();
		perimetroJLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		resultadosJPanel.add(perimetroJLabel, gbc);
		final JPanel spacer6 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		resultadosJPanel.add(spacer6, gbc);
		areaJLabel = new JLabel();
		areaJLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		resultadosJPanel.add(areaJLabel, gbc);

		baseTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (baseTextField.getText().equals("Base"))
					baseTextField.setText("");
			}
		});
		alturaTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (alturaTextField.getText().equals("Altura"))
					alturaTextField.setText("");
			}
		});
		ladoATextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ladoATextField.getText().equals("Lado A"))
					ladoATextField.setText("");
			}
		});
		calcularButton.addActionListener(actionEvent -> {
			Romboide romboide = new Romboide();
			romboide.setAltura(Float.parseFloat(alturaTextField.getText()));
			romboide.setBase(Float.parseFloat(baseTextField.getText()));
			String area = romboide.mostrarArea();
			String perimetro = romboide.mostrarPerimetro();
			perimetroJLabel.setText(perimetro);
			areaJLabel.setText(area);
			ventana.pack();
		});
	}
}