package HerenciaElectrodomesticosGUI;

import HerenciaElectrodomesticos.Electrodomestico;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class ElectrodomesticosGUI {
	private JPanel ventana;
	private JTextPane descripcion;
	private JLabel tipoDeObjetoLabel;
	private JRadioButton lavadoraRadioButton;
	private JPanel panelCreacionObjeto;
	private JTextField precioTextField;
	private JLabel precioLabel;
	private JList colorList;
	private JRadioButton televisorRadioButton;
	private JRadioButton otroElectrodomestico;
	private JLabel consumoEnergeticoLabel;
	private JList consumoEnergeticoList;
	private JTextField pesoTextField;
	private JPanel panelTelevision;
	private JLabel resolucionLabel;
	private JLabel sintonizadorTDTLabel;
	private JRadioButton trueRB;
	private JTextField resolucionTextField;
	private JRadioButton falseRB;
	private JPanel panelLavadora;
	private JLabel cargaLabel;
	private JTextField cargaTextField;
	private JButton crearObjetoButton;
	private JButton generalReporteDePreciosButton;
	private JLabel pesoLabel;
	private JLabel colorLabel;

	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;

	public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);

	public void crearObjeto() {
		String tipoObjeto;


	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("ElectrodomesticosGUI");
		frame.setContentPane(new ElectrodomesticosGUI().ventana);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer
	 * >>> IMPORTANT!! <<<
	 * DO NOT edit this method OR call it in your code!
	 *
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$() {
		ventana = new JPanel();
		ventana.setLayout(new GridBagLayout());
		Font ventanaFont = this.$$$getFont$$$("Hack", -1, 20, ventana.getFont());
		if (ventanaFont != null) ventana.setFont(ventanaFont);
		descripcion = new JTextPane();
		descripcion.setEditable(false);
		descripcion.setText("Aplicación que crea objetos de tipo electrodomesticos. \nMuestra su precio final, la suma de todos los objetos por su clasificacion.");
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.WEST;
		ventana.add(descripcion, gbc);
		panelCreacionObjeto = new JPanel();
		panelCreacionObjeto.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(panelCreacionObjeto, gbc);
		tipoDeObjetoLabel = new JLabel();
		tipoDeObjetoLabel.setText("Tipo de objeto");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(tipoDeObjetoLabel, gbc);
		lavadoraRadioButton = new JRadioButton();
		lavadoraRadioButton.setText("Lavadora");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(lavadoraRadioButton, gbc);
		final JLabel label1 = new JLabel();
		label1.setText("Color");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(label1, gbc);
		colorList = new JList();
		final DefaultListModel defaultListModel1 = new DefaultListModel();
		defaultListModel1.addElement("Blanco");
		defaultListModel1.addElement("Negro");
		defaultListModel1.addElement("Rojo");
		defaultListModel1.addElement("Azul");
		defaultListModel1.addElement("Gris");
		colorList.setModel(defaultListModel1);
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 3;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(colorList, gbc);
		televisorRadioButton = new JRadioButton();
		televisorRadioButton.setText("Televisor");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(televisorRadioButton, gbc);
		otroElectrodomestico = new JRadioButton();
		otroElectrodomestico.setText("Otro Electrodomestico");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(otroElectrodomestico, gbc);
		precioLabel = new JLabel();
		precioLabel.setText("Precio: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(precioLabel, gbc);
		precioTextField = new JTextField();
		precioTextField.setText("Ingrese el precio del producto");
		precioTextField.setToolTipText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelCreacionObjeto.add(precioTextField, gbc);
		consumoEnergeticoLabel = new JLabel();
		consumoEnergeticoLabel.setText("Consumo Energetico");
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(consumoEnergeticoLabel, gbc);
		consumoEnergeticoList = new JList();
		consumoEnergeticoList.setLayoutOrientation(1);
		final DefaultListModel defaultListModel2 = new DefaultListModel();
		defaultListModel2.addElement("A");
		defaultListModel2.addElement("B");
		defaultListModel2.addElement("C");
		defaultListModel2.addElement("D");
		defaultListModel2.addElement("E");
		defaultListModel2.addElement("F");
		consumoEnergeticoList.setModel(defaultListModel2);
		consumoEnergeticoList.setSelectionMode(0);
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridheight = 3;
		gbc.fill = GridBagConstraints.VERTICAL;
		panelCreacionObjeto.add(consumoEnergeticoList, gbc);
		final JLabel label2 = new JLabel();
		label2.setText("Peso: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(label2, gbc);
		pesoTextField = new JTextField();
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelCreacionObjeto.add(pesoTextField, gbc);
		panelTelevision = new JPanel();
		panelTelevision.setLayout(new GridBagLayout());
		panelTelevision.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(panelTelevision, gbc);
		panelTelevision.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16645630)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		resolucionLabel = new JLabel();
		resolucionLabel.setText("Resolución");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelTelevision.add(resolucionLabel, gbc);
		sintonizadorTDTLabel = new JLabel();
		sintonizadorTDTLabel.setText("Sintonizador TDT");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panelTelevision.add(sintonizadorTDTLabel, gbc);
		trueRB = new JRadioButton();
		trueRB.setText("Si");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		panelTelevision.add(trueRB, gbc);
		resolucionTextField = new JTextField();
		resolucionTextField.setText("Ingrese la resolucion");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelTelevision.add(resolucionTextField, gbc);
		falseRB = new JRadioButton();
		falseRB.setText("No");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		panelTelevision.add(falseRB, gbc);
		final JSeparator separator1 = new JSeparator();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(separator1, gbc);
		final JSeparator separator2 = new JSeparator();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(separator2, gbc);
		panelLavadora = new JPanel();
		panelLavadora.setLayout(new GridBagLayout());
		panelLavadora.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(panelLavadora, gbc);
		cargaLabel = new JLabel();
		cargaLabel.setText("Carga: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelLavadora.add(cargaLabel, gbc);
		cargaTextField = new JTextField();
		cargaTextField.setText("Carga");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelLavadora.add(cargaTextField, gbc);
		crearObjetoButton = new JButton();
		crearObjetoButton.setText("Crear Objeto");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ventana.add(crearObjetoButton, gbc);
		generalReporteDePreciosButton = new JButton();
		generalReporteDePreciosButton.setText("General reporte de precios");
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 9;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ventana.add(generalReporteDePreciosButton, gbc);
		ButtonGroup buttonGroup;
		buttonGroup = new ButtonGroup();
		buttonGroup.add(lavadoraRadioButton);
		buttonGroup.add(televisorRadioButton);
		buttonGroup.add(otroElectrodomestico);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(trueRB);
		buttonGroup.add(falseRB);
	}

	/**
	 * @noinspection ALL
	 */
	private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
		if (currentFont == null) return null;
		String resultName;
		if (fontName == null) {
			resultName = currentFont.getName();
		} else {
			Font testFont = new Font(fontName, Font.PLAIN, 10);
			if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
				resultName = fontName;
			} else {
				resultName = currentFont.getName();
			}
		}
		return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return ventana;
	}

}
