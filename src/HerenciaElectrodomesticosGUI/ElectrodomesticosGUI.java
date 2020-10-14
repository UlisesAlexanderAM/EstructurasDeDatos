package HerenciaElectrodomesticosGUI;

import HerenciaElectrodomesticos.Electrodomestico;
import HerenciaElectrodomesticos.Lavadora;
import HerenciaElectrodomesticos.Television;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private JPanel ventana1;
	private JTable reporteTable;
	private JButton regresarButton;
	private JPanel reportePanel;
	private JScrollPane reporteJSrollPane;
	private JScrollPane creacionJScrollPane;
	private JLabel totalElectrodomesticosLabel;
	private JLabel totalTelevisoresLabel;
	private JLabel totalLavadorasLabel;
	private JScrollPane tablaJScrollPane;

	private static final JFrame frame = new JFrame("ElectrodomesticosGUI");
	private int indice = 0;
	private boolean sTDT;
	private final char[] consumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
	private char seleccionConsumoEnergetico;

	public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

	public ElectrodomesticosGUI() {
		lavadoraRadioButton.addActionListener(actionEvent -> {
			Lavadora lavadora = new Lavadora();
			electrodomesticos.add(indice, lavadora);
			panelLavadora.setVisible(true);
			panelTelevision.setVisible(false);
			frame.pack();
		});
		televisorRadioButton.addActionListener(actionEvent -> {
			Television television = new Television();
			electrodomesticos.add(indice, television);
			panelTelevision.setVisible(true);
			panelLavadora.setVisible(false);
			frame.pack();
		});
		otroElectrodomestico.addActionListener(actionEvent -> {
			Electrodomestico otroElectrodomestico = new Electrodomestico();
			electrodomesticos.add(indice, otroElectrodomestico);
			panelLavadora.setVisible(false);
			panelTelevision.setVisible(false);
		});
		crearObjetoButton.addActionListener(actionEvent -> {
			crearObjeto();
			indice = +1;
			reiniciar();
		});
		trueRB.addActionListener(actionEvent -> sTDT = true);
		falseRB.addActionListener(actionEvent -> sTDT = false);
		consumoEnergeticoList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seleccionConsumoEnergetico = consumoEnergetico[consumoEnergeticoList.getSelectedIndex()];
			}
		});
		generalReporteDePreciosButton.addActionListener(actionEvent -> {
			mostrarReporte();
			frame.pack();
		});
		regresarButton.addActionListener(actionEvent -> {
			creacionJScrollPane.setVisible(true);
			reporteJSrollPane.setVisible(false);
			frame.pack();
		});
	}

	private void mostrarReporte() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Tipo de electrodoméstico");
		modelo.addColumn("Precio Base");
		modelo.addColumn("Color");
		modelo.addColumn("Consumo Energetico");
		modelo.addColumn("Peso");
		modelo.addColumn("Precio Final");
		modelo.addColumn("Carga");
		modelo.addColumn("Resolución");
		modelo.addColumn("Sintonizador TDT");
		double totalElectrodomesticos = 0;
		double totalTelevisores = 0;
		double totalLavadoras = 0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			Object[] fila = new Object[9];
			double precioFinal = electrodomestico.precioFinal();
			fila[0] = electrodomestico.getClass().getSimpleName();
			fila[1] = electrodomestico.getPrecioBase();
			fila[2] = electrodomestico.getColor();
			fila[3] = electrodomestico.getConsumoEnergetico();
			fila[4] = electrodomestico.getPeso();
			fila[5] = precioFinal;
			if (electrodomestico instanceof Lavadora) {
				fila[6] = ((Lavadora) electrodomestico).getCarga();
				totalLavadoras += precioFinal;
			} else
				fila[6] = "NA";
			if (electrodomestico instanceof Television) {
				fila[7] = ((Television) electrodomestico).getResolucion();
				fila[8] = ((Television) electrodomestico).isSintonizadorTDT();
				totalTelevisores += precioFinal;
			} else {
				fila[7] = "NA";
				fila[8] = "NA";
			}
			modelo.addRow(fila);
			totalElectrodomesticos += electrodomestico.precioFinal();
		}
		reporteTable.setModel(modelo);
		reporteTable.getColumnModel().getColumn(0).setPreferredWidth(150);
		creacionJScrollPane.setVisible(false);
		reporteJSrollPane.setVisible(true);
		totalElectrodomesticosLabel.setText("Total electrodomésticos: " + totalElectrodomesticos);
		totalTelevisoresLabel.setText("Total Televisores: " + totalTelevisores);
		totalLavadorasLabel.setText("Total Lavadoras: " + totalLavadoras);
	}

	public void crearObjeto() {
		String color = colorList.getSelectedValue().toString();
		double precioBase = Double.parseDouble(precioTextField.getText());
		double peso = Double.parseDouble(pesoTextField.getText());
		Electrodomestico electrodomestico = electrodomesticos.get(indice);
		electrodomestico.setColor(color);
		electrodomestico.setConsumoEnergetico(seleccionConsumoEnergetico);
		electrodomestico.setPrecioBase(precioBase);
		electrodomestico.setPeso(peso);
		if (electrodomestico instanceof Television) {
			int resolucion = Integer.parseInt(resolucionTextField.getText());
			((Television) electrodomestico).setResolucion(resolucion);
			((Television) electrodomestico).setSintonizadorTDT(sTDT);
		} else if (electrodomestico instanceof Lavadora) {
			double carga = Double.parseDouble(cargaTextField.getText());
			((Lavadora) electrodomestico).setCarga(carga);
		}
	}

	public void reiniciar() {
		colorList.clearSelection();
		consumoEnergeticoList.clearSelection();
		precioTextField.setText("");
		pesoTextField.setText("");
		cargaTextField.setText("");
		resolucionTextField.setText("");
		lavadoraRadioButton.setSelected(false);
		televisorRadioButton.setSelected(false);
		otroElectrodomestico.setSelected(false);
		trueRB.setSelected(false);
		falseRB.setSelected(false);
		panelTelevision.setVisible(false);
		panelLavadora.setVisible(false);
		frame.pack();
	}

	public static void main(String[] args) {
//		JFrame frame = new JFrame("ElectrodomesticosGUI");
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
		creacionJScrollPane = new JScrollPane();
		creacionJScrollPane.setVisible(true);
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 9;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(creacionJScrollPane, gbc);
		ventana1 = new JPanel();
		ventana1.setLayout(new GridBagLayout());
		creacionJScrollPane.setViewportView(ventana1);
		descripcion = new JTextPane();
		descripcion.setEditable(false);
		descripcion.setText("Aplicación que crea objetos de tipo electrodomesticos. \nMuestra su precio final, la suma de todos los objetos por su clasificacion.");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.WEST;
		ventana1.add(descripcion, gbc);
		panelCreacionObjeto = new JPanel();
		panelCreacionObjeto.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
		ventana1.add(panelCreacionObjeto, gbc);
		tipoDeObjetoLabel = new JLabel();
		tipoDeObjetoLabel.setText("Tipo de objeto");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(tipoDeObjetoLabel, gbc);
		lavadoraRadioButton = new JRadioButton();
		lavadoraRadioButton.setSelected(false);
		lavadoraRadioButton.setText("Lavadora");
		lavadoraRadioButton.setToolTipText("Lavadora");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(lavadoraRadioButton, gbc);
		colorLabel = new JLabel();
		colorLabel.setText("Color");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(colorLabel, gbc);
		colorList = new JList();
		final DefaultListModel defaultListModel1 = new DefaultListModel();
		defaultListModel1.addElement("Blanco");
		defaultListModel1.addElement("Negro");
		defaultListModel1.addElement("Rojo");
		defaultListModel1.addElement("Azul");
		defaultListModel1.addElement("Gris");
		colorList.setModel(defaultListModel1);
		colorList.setToolTipText("Color");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 3;
		gbc.fill = GridBagConstraints.BOTH;
		panelCreacionObjeto.add(colorList, gbc);
		televisorRadioButton = new JRadioButton();
		televisorRadioButton.setText("Televisor");
		televisorRadioButton.setToolTipText("Televisor");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(televisorRadioButton, gbc);
		otroElectrodomestico = new JRadioButton();
		otroElectrodomestico.setText("Otro Electrodomestico");
		otroElectrodomestico.setToolTipText("Otro Electrodomestico");
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
		precioTextField.setText("");
		precioTextField.setToolTipText("Ingrese el precio");
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
		consumoEnergeticoList.setToolTipText("Consumo energetico");
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridheight = 3;
		gbc.fill = GridBagConstraints.VERTICAL;
		panelCreacionObjeto.add(consumoEnergeticoList, gbc);
		pesoLabel = new JLabel();
		pesoLabel.setText("Peso: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		panelCreacionObjeto.add(pesoLabel, gbc);
		pesoTextField = new JTextField();
		pesoTextField.setToolTipText("Ingrese el peso");
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
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.BOTH;
		ventana1.add(panelTelevision, gbc);
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
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panelTelevision.add(sintonizadorTDTLabel, gbc);
		trueRB = new JRadioButton();
		trueRB.setText("Si");
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		panelTelevision.add(trueRB, gbc);
		resolucionTextField = new JTextField();
		resolucionTextField.setText("");
		resolucionTextField.setToolTipText("Ingrese la resolucion");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelTelevision.add(resolucionTextField, gbc);
		falseRB = new JRadioButton();
		falseRB.setText("No");
		gbc = new GridBagConstraints();
		gbc.gridx = 3;
		gbc.gridy = 1;
		panelTelevision.add(falseRB, gbc);
		final JPanel spacer1 = new JPanel();
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelTelevision.add(spacer1, gbc);
		panelLavadora = new JPanel();
		panelLavadora.setLayout(new GridBagLayout());
		panelLavadora.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.BOTH;
		ventana1.add(panelLavadora, gbc);
		cargaLabel = new JLabel();
		cargaLabel.setText("Carga: ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panelLavadora.add(cargaLabel, gbc);
		cargaTextField = new JTextField();
		cargaTextField.setHorizontalAlignment(10);
		cargaTextField.setText("");
		cargaTextField.setToolTipText("Ingrese la carga");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panelLavadora.add(cargaTextField, gbc);
		crearObjetoButton = new JButton();
		crearObjetoButton.setText("Crear Objeto");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ventana1.add(crearObjetoButton, gbc);
		generalReporteDePreciosButton = new JButton();
		generalReporteDePreciosButton.setText("General reporte de precios");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ventana1.add(generalReporteDePreciosButton, gbc);
		reporteJSrollPane = new JScrollPane();
		reporteJSrollPane.setVisible(false);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.add(reporteJSrollPane, gbc);
		reportePanel = new JPanel();
		reportePanel.setLayout(new GridBagLayout());
		reporteJSrollPane.setViewportView(reportePanel);
		regresarButton = new JButton();
		regresarButton.setText("Regresar");
		regresarButton.setVisible(true);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 10;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		reportePanel.add(regresarButton, gbc);
		totalElectrodomesticosLabel = new JLabel();
		totalElectrodomesticosLabel.setName("");
		totalElectrodomesticosLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 10;
		gbc.anchor = GridBagConstraints.WEST;
		reportePanel.add(totalElectrodomesticosLabel, gbc);
		totalTelevisoresLabel = new JLabel();
		totalTelevisoresLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 10;
		gbc.anchor = GridBagConstraints.WEST;
		reportePanel.add(totalTelevisoresLabel, gbc);
		totalLavadorasLabel = new JLabel();
		totalLavadorasLabel.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 10;
		gbc.anchor = GridBagConstraints.WEST;
		reportePanel.add(totalLavadorasLabel, gbc);
		tablaJScrollPane = new JScrollPane();
		tablaJScrollPane.setPreferredSize(new Dimension(1280, 128));
		tablaJScrollPane.setVisible(true);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 10;
		gbc.fill = GridBagConstraints.BOTH;
		reportePanel.add(tablaJScrollPane, gbc);
		reporteTable = new JTable();
		reporteTable.setAutoCreateColumnsFromModel(true);
		reporteTable.setAutoCreateRowSorter(false);
		reporteTable.setAutoResizeMode(4);
		reporteTable.setAutoscrolls(false);
		reporteTable.setDropMode(DropMode.USE_SELECTION);
		reporteTable.setMinimumSize(new Dimension(100, 32));
		reporteTable.setVisible(true);
		tablaJScrollPane.setViewportView(reporteTable);
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
