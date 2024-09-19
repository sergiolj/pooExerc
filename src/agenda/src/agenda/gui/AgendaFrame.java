package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;

public class AgendaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaFrame frame = new AgendaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgendaFrame() {
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JTabbedPane tabAbas = new JTabbedPane(JTabbedPane.TOP);
		tabAbas.setBounds(10, 11, 514, 239);
		ListEventPanel listaEventosPainel = new ListEventPanel();
		tabAbas.addTab("Lista de Eventos",listaEventosPainel);
		listaEventosPainel.setLayout(null);
		RegisterEventPanel cadastrarEventosPainel = new RegisterEventPanel();
		tabAbas.addTab("Cadastrar Evento", cadastrarEventosPainel);
		
		contentPane.add(tabAbas);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
