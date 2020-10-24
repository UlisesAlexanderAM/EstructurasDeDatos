package IntefazConUsuario;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame{
	protected static final JFrame ventana = new JFrame();

	public static void main(String[] args) {
		JPanel ventanaContenedor = new JPanel();
		JTabbedPane pestanias = new JTabbedPane(SwingConstants.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);
		PestañaRectangulo pestañaRectangulo = new PestañaRectangulo();
		PestañaTriangulo pestañaTriangulo = new PestañaTriangulo();
		JPanel rectanguloJPanel = pestañaRectangulo.getRectanguloJPanel();

		ventana.setTitle("Figuras Geometricas");
		ventana.setContentPane(ventanaContenedor);
		ventana.setLayout(new GridBagLayout());
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.BOTH;
		pestanias.addTab("Rectangulo",rectanguloJPanel);
		ventanaContenedor.add(pestanias,gbc);
		ventana.pack();
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.BOTH;
		ventana.pack();
	}
}
