package agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class RegisterEventPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfDescEvent;
	private JTextField tfEncaminharEmail;
	private JTextField tfDataEvento;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public RegisterEventPanel() {
		setLayout(null);
		setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		JLabel lblDescEvento = new JLabel("Descrição do Evento");
		lblDescEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescEvento.setBounds(10, 11, 127, 14);
		add(lblDescEvento);
		
		tfDescEvent = new JTextField();
		tfDescEvent.setBounds(10, 36, 430, 20);
		add(tfDescEvent);
		tfDescEvent.setColumns(10);
		
		JLabel lblEncaminharEmail = new JLabel("Encaminhar para E-mail");
		lblEncaminharEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEncaminharEmail.setBounds(10, 101, 158, 14);
		add(lblEncaminharEmail);
		
		tfEncaminharEmail = new JTextField();
		tfEncaminharEmail.setBounds(162, 98, 278, 20);
		add(tfEncaminharEmail);
		tfEncaminharEmail.setColumns(10);
		
		JLabel lblDataEvento = new JLabel("Data do Evento");
		lblDataEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataEvento.setBounds(10, 67, 102, 14);
		add(lblDataEvento);
		
		JRadioButton rdbUmaVez = new JRadioButton("Diário");
		buttonGroup.add(rdbUmaVez);
		rdbUmaVez.setBounds(162, 136, 59, 23);
		add(rdbUmaVez);
		
		tfDataEvento = new JTextField();
		tfDataEvento.setBounds(162, 67, 109, 20);
		add(tfDataEvento);
		tfDataEvento.setColumns(10);
		
		JLabel lblPeriodicidade = new JLabel("Periodicidade");
		lblPeriodicidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeriodicidade.setBounds(10, 140, 127, 14);
		add(lblPeriodicidade);
		
		JRadioButton rdbSemanal = new JRadioButton("Semanal");
		buttonGroup.add(rdbSemanal);
		rdbSemanal.setBounds(260, 136, 74, 23);
		add(rdbSemanal);
		
		JRadioButton rdbMensal = new JRadioButton("Mensal");
		buttonGroup.add(rdbMensal);
		rdbMensal.setBounds(366, 136, 74, 23);
		add(rdbMensal);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(196, 179, 89, 23);
		add(btnSalvar);
		
		JCheckBox ckbAlarme = new JCheckBox("Alarme");
		ckbAlarme.setBounds(15, 179, 97, 23);
		add(ckbAlarme);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(318, 179, 89, 23);
		add(btnLimpar);

	}
}
