package IntefazConUsuario;

import javax.swing.*;

public abstract class Pestanias extends Inicio {
	protected String instrucionesText;
	protected final JPanel pestaniaJPanel;
	protected final JTextField baseTextField;
	protected final JTextField alturaTextField;
	protected final JLabel perimetroJLabel;
	protected final JLabel areaJLabel;

	public Pestanias() {
		pestaniaJPanel = new JPanel();
		baseTextField = new JTextField();
		alturaTextField = new JTextField();
		perimetroJLabel = new JLabel();
		areaJLabel = new JLabel();
		instrucionesText = "";
	}

	public JPanel getPestaniaJPanel() {
		return pestaniaJPanel;
	}

	public abstract void reiniciar();
}
