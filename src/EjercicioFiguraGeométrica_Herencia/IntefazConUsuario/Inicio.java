package IntefazConUsuario;

import javax.swing.*;
import java.awt.*;

public class Inicio {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setTitle("Figuras Geometricas");
		JPanel jPanel = new JPanel();
		JComponent pestañaRectangulo = new PestañaRectangulo().$$$getRootComponent$$$();
		ventana.setContentPane(jPanel);
		ventana.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.BOTH;
		jPanel.add(pestañaRectangulo,gbc);
		ventana.setVisible(true);
//		ventana.pack();

	}

}
