package IntefazConUsuario;

import Operacion.Rectangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestaniaRectangulo extends Inicio {
	private final JPanel rectanguloJPanel;
	private final JTextField baseTextField;
	private final JTextField alturaTextField;
	private final JLabel perimetroJLabel;
	private final JLabel areaJLabel;
	private final static String instrucionesText = "Aquí podras calcular el area y perímetro de un rectángulo.\nProporcionando la base y la altura.\nPara mostrar los resultados presionar el boton \"Calcular\"";

	public JPanel getRectanguloJPanel() {
		return rectanguloJPanel;
	}

	public void reiniciar() {
		baseTextField.setText("");
		alturaTextField.setText("");
		perimetroJLabel.setText("");
		areaJLabel.setText("");
		ventana.pack();
	}

	public PestaniaRectangulo() {
		rectanguloJPanel = new JPanel();
		rectanguloJPanel.setLayout(new GridBagLayout());
		JPanel descripcionJPanel = new JPanel();
		descripcionJPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		rectanguloJPanel.add(descripcionJPanel, gbc);
		JLabel baseJLabel = new JLabel();
		baseJLabel.setText("Base: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(baseJLabel, gbc);
		JLabel alturaJLabel = new JLabel();
		alturaJLabel.setText("Altura: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.EAST;
		descripcionJPanel.add(alturaJLabel, gbc);
		final JPanel spacer1 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer1, gbc);
		baseTextField = new JTextField();
		baseTextField.setToolTipText("Ingrese la base del rectángulo");
		baseJLabel.setLabelFor(baseTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(baseTextField, gbc);
		alturaTextField = new JTextField();
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(alturaTextField, gbc);
		JButton calcularButton = new JButton();
		calcularButton.setText("Calcular Rectángulo");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(calcularButton, gbc);
		final JPanel spacer2 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 5;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer2, gbc);
		JTextArea instruccionesTextArea = new JTextArea();
		instruccionesTextArea.setText(instrucionesText);
		instruccionesTextArea.setEditable(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.fill = GridBagConstraints.BOTH;
		descripcionJPanel.add(instruccionesTextArea, gbc);
		final JPanel spacer3 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridheight = GridBagConstraints.RELATIVE;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer3, gbc);
		final JPanel spacer4 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer4, gbc);
		JPanel resultadosJPanel = new JPanel();
		resultadosJPanel.setLayout(new GridBagLayout());
		resultadosJPanel.setVisible(true);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		rectanguloJPanel.add(resultadosJPanel, gbc);
		perimetroJLabel = new JLabel();
		perimetroJLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		resultadosJPanel.add(perimetroJLabel, gbc);
		final JPanel spacer5 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		resultadosJPanel.add(spacer5, gbc);
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
		calcularButton.addActionListener(actionEvent -> {
			Rectangulo rectangulo = new Rectangulo();
			rectangulo.setAltura(Float.parseFloat(alturaTextField.getText()));
			rectangulo.setBase(Float.parseFloat(baseTextField.getText()));
			String area=rectangulo.mostrarArea();
			String perimetro=rectangulo.mostrarPerimetro();
			perimetroJLabel.setText(perimetro);
			areaJLabel.setText(area);
			ventana.pack();
		});
	}

}
