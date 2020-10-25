package IntefazConUsuario;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame{
	protected static final JFrame ventana = new JFrame();

	public static void main(String[] args) {
		JPanel ventanaContenedor = new JPanel();
		JTabbedPane pestanias = new JTabbedPane(SwingConstants.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
		PestaniaRectangulo pestaniaRectangulo = new PestaniaRectangulo();
		PestaniaTriangulo pestaniaTriangulo = new PestaniaTriangulo();
		PestaniaRomboide pestaniaRomboide = new PestaniaRomboide();
		JPanel rectanguloJPanel = pestaniaRectangulo.getRectanguloJPanel();
		JPanel trianguloJPanel = pestaniaTriangulo.getTrianguloJPanel();
		JPanel romboideJPanel = pestaniaRomboide.getRomboideJPanel();

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
		pestanias.addTab("Triangulo",trianguloJPanel);
		pestanias.addTab("Romboide",romboideJPanel);
		ventanaContenedor.add(pestanias,gbc);
		ventana.pack();

		pestanias.addChangeListener(changeEvent -> {
			if (pestanias.getSelectedComponent().equals(rectanguloJPanel))
				pestaniaRectangulo.reiniciar();
			else if (pestanias.getSelectedComponent().equals(trianguloJPanel))
				pestaniaTriangulo.reiniciar();
			else
				pestaniaRomboide.reiniciar();
		});
	}
}
