package IntefazConUsuario;

import javax.swing.*;
import java.awt.*;

public class Inicio {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setTitle("Figuras Geometricas");
		JPanel jPanel = new JPanel();
		JComponent pestañaRectangulo = new PestañaRectangulo().$$$getRootComponent$$$();
		JComponent pestañaTriangulo = new PestañaTriangulo().$$$getRootComponent$$$();
		ventana.setContentPane(jPanel);
		ventana.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.BOTH;
		jPanel.add(pestañaRectangulo,gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.BOTH;
		Dimension dimension = new Dimension(250,500);
		jPanel.add(pestañaTriangulo,gbc);
		ventana.setPreferredSize(dimension);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.pack();
	}

}
