package agenda.gui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class ListEventPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tbEventos;

	/**
	 * Create the panel.
	 */
	public ListEventPanel() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 359, 170);
		add(scrollPane);
		
		tbEventos = new JTable();
		scrollPane.setViewportView(tbEventos);
		
		JLabel lbEventosCadastrados = new JLabel("Eventos Cadastrados");
		lbEventosCadastrados.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEventosCadastrados.setBounds(20, 11, 137, 14);
		add(lbEventosCadastrados);

	}
}
