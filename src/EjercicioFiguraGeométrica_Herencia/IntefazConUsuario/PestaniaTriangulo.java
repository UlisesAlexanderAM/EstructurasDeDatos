package IntefazConUsuario;

import Operacion.Triangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestaniaTriangulo extends Inicio {

	private final JTextField ladoATextField;
	private final JTextField ladoBTextField;
	private final JTextField baseTextField;
	private final JTextField alturaTextField;
	private final JLabel perimetroJLabel;
	private final JLabel areaJLabel;
	private final JPanel trianguloJPanel;

	public JPanel getTrianguloJPanel() {
		return trianguloJPanel;
	}

	public void reiniciar(){
		ladoATextField.setText("");
		ladoBTextField.setText("");
		baseTextField.setText("");
		alturaTextField.setText("");
		perimetroJLabel.setText("");
		areaJLabel.setText("");
		ventana.pack();
	}

	public PestaniaTriangulo() {
		trianguloJPanel = new JPanel();
		trianguloJPanel.setLayout(new GridBagLayout());
		JPanel descripcionJPanel = new JPanel();
		descripcionJPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		trianguloJPanel.add(descripcionJPanel, gbc);
		JTextArea descripcionTextArea = new JTextArea();
		descripcionTextArea.setEditable(false);
		descripcionTextArea.setText("Aquí podras calcular el area y perimetro de un triángulo.\nProporcionando la base y la altura.\nPara mostrar los resultados presionar el boton \"Calcular\"");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(descripcionTextArea, gbc);
		JLabel ladoAJLabel = new JLabel();
		ladoAJLabel.setText("Lado A: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(ladoAJLabel, gbc);
		JLabel ladoBJLabel = new JLabel();
		ladoBJLabel.setText("Lado B: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(ladoBJLabel, gbc);
		final JPanel spacer1 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(spacer1, gbc);
		final JPanel spacer2 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer2, gbc);
		JLabel baseJLabel = new JLabel();
		baseJLabel.setText("Base: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(baseJLabel, gbc);
		JLabel alturaJLabel = new JLabel();
		alturaJLabel.setText("Altura: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		descripcionJPanel.add(alturaJLabel, gbc);
		ladoATextField = new JTextField();
		ladoAJLabel.setLabelFor(ladoATextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(ladoATextField, gbc);
		ladoBTextField = new JTextField();
		ladoBJLabel.setLabelFor(ladoBTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(ladoBTextField, gbc);
		baseTextField = new JTextField();
		baseJLabel.setLabelFor(baseTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(baseTextField, gbc);
		alturaTextField = new JTextField();
		alturaJLabel.setLabelFor(alturaTextField);
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(alturaTextField, gbc);
		final JPanel spacer3 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer3, gbc);
		JButton calcularButton = new JButton();
		calcularButton.setText("Calcular Triangulo");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		descripcionJPanel.add(calcularButton, gbc);
		final JPanel spacer4 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.fill = GridBagConstraints.VERTICAL;
		descripcionJPanel.add(spacer4, gbc);
		final JPanel spacer5 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		trianguloJPanel.add(spacer5, gbc);
		JPanel resultadosJPanel = new JPanel();
		resultadosJPanel.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		trianguloJPanel.add(resultadosJPanel, gbc);
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
					baseTextField.setText("");
			}
		});
		ladoATextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ladoATextField.getText().equals("Lado A"))
					ladoATextField.setText("");
			}
		});
		ladoBTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ladoBTextField.getText().equals("Lado B"))
					ladoBTextField.setText("");
			}
		});
		calcularButton.addActionListener(actionEvent -> {
			Triangulo triangulo = new Triangulo();
			triangulo.setAltura(Float.parseFloat(alturaTextField.getText()));
			triangulo.setBase(Float.parseFloat(baseTextField.getText()));
			double area;
			float perimetro;
			perimetro = triangulo.calcularPerimetro();
			perimetroJLabel.setText("El perímetro del triángulo es: " + perimetro);
			area = triangulo.calcularArea();
			areaJLabel.setText("El area del triángulo es: " + area);
			ventana.pack();
		});
	}
}