package com.codeprehend.medical.tests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsulatieTestPanel {

	private JFrame frame;
	private JTextField textAntecedente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulatieTestPanel window = new ConsulatieTestPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsulatieTestPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel GridBagLayoutPanel = new JPanel();
		GridBagLayoutPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(GridBagLayoutPanel, BorderLayout.CENTER);
		GridBagLayout gbl_GridBagLayoutPanel = new GridBagLayout();
		gbl_GridBagLayoutPanel.columnWidths = new int[] {0};
		gbl_GridBagLayoutPanel.rowHeights = new int[] {0, 0};
		gbl_GridBagLayoutPanel.columnWeights = new double[]{1.0};
		gbl_GridBagLayoutPanel.rowWeights = new double[]{0.0, 1.0};
		GridBagLayoutPanel.setLayout(gbl_GridBagLayoutPanel);
		
		JPanel InformationGridBagLayoutPanel =  new JPanel();
		GridBagConstraints gbc_InformationGridBagLayoutPanel = new GridBagConstraints();
		gbc_InformationGridBagLayoutPanel.insets = new Insets(25, 25, 10, 25);
		gbc_InformationGridBagLayoutPanel.weightx = 1.0;
		gbc_InformationGridBagLayoutPanel.fill = GridBagConstraints.BOTH;
		gbc_InformationGridBagLayoutPanel.gridx = 0;
		gbc_InformationGridBagLayoutPanel.gridy = 0;
		GridBagLayoutPanel.add(InformationGridBagLayoutPanel, gbc_InformationGridBagLayoutPanel);
		GridBagLayout gbl_InformationGridBagLayoutPanel = new GridBagLayout();
		gbl_InformationGridBagLayoutPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_InformationGridBagLayoutPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_InformationGridBagLayoutPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_InformationGridBagLayoutPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		InformationGridBagLayoutPanel.setLayout(gbl_InformationGridBagLayoutPanel);
		
		JLabel lblAntet = new JLabel("Antet");
		GridBagConstraints gbc_lblAntet = new GridBagConstraints();
		gbc_lblAntet.insets = new Insets(0, 0, 5, 5);
		gbc_lblAntet.gridx = 0;
		gbc_lblAntet.gridy = 0;
		InformationGridBagLayoutPanel.add(lblAntet, gbc_lblAntet);
		
		JLabel NameLabel = new JLabel("Munteanu");
		GridBagConstraints gbc_NameLabel = new GridBagConstraints();
		gbc_NameLabel.weightx = 1.0;
		gbc_NameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_NameLabel.gridx = 0;
		gbc_NameLabel.gridy = 1;
		InformationGridBagLayoutPanel.add(NameLabel, gbc_NameLabel);
		
		JLabel PrenumeLabel = new JLabel("Mihaela");
		GridBagConstraints gbc_PrenumeLabel = new GridBagConstraints();
		gbc_PrenumeLabel.weightx = 1.0;
		gbc_PrenumeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_PrenumeLabel.gridx = 1;
		gbc_PrenumeLabel.gridy = 1;
		InformationGridBagLayoutPanel.add(PrenumeLabel, gbc_PrenumeLabel);
		
		JLabel DataNastereLabel = new JLabel("Data nasterii: 07-05-2018");
		GridBagConstraints gbc_DataNastereLabel = new GridBagConstraints();
		gbc_DataNastereLabel.weightx = 1.0;
		gbc_DataNastereLabel.insets = new Insets(0, 0, 5, 5);
		gbc_DataNastereLabel.anchor = GridBagConstraints.NORTH;
		gbc_DataNastereLabel.gridx = 2;
		gbc_DataNastereLabel.gridy = 1;
		InformationGridBagLayoutPanel.add(DataNastereLabel, gbc_DataNastereLabel);
		
		JLabel CNPLabel = new JLabel("CNP: 283070784270023");
		GridBagConstraints gbc_CNPLabel = new GridBagConstraints();
		gbc_CNPLabel.weightx = 1.0;
		gbc_CNPLabel.insets = new Insets(0, 0, 5, 5);
		gbc_CNPLabel.gridx = 3;
		gbc_CNPLabel.gridy = 1;
		InformationGridBagLayoutPanel.add(CNPLabel, gbc_CNPLabel);
		
		JLabel TelefonLabel = new JLabel("Telefon: 0788567890");
		GridBagConstraints gbc_TelefonLabel = new GridBagConstraints();
		gbc_TelefonLabel.insets = new Insets(0, 0, 5, 0);
		gbc_TelefonLabel.anchor = GridBagConstraints.EAST;
		gbc_TelefonLabel.weightx = 1.0;
		gbc_TelefonLabel.gridx = 4;
		gbc_TelefonLabel.gridy = 1;
		InformationGridBagLayoutPanel.add(TelefonLabel, gbc_TelefonLabel);
		
		JLabel lblNasteriNaturale = new JLabel("Nasteri naturale: 1");
		GridBagConstraints gbc_lblNasteriNaturale = new GridBagConstraints();
		gbc_lblNasteriNaturale.insets = new Insets(0, 0, 0, 5);
		gbc_lblNasteriNaturale.gridx = 0;
		gbc_lblNasteriNaturale.gridy = 2;
		InformationGridBagLayoutPanel.add(lblNasteriNaturale, gbc_lblNasteriNaturale);
		
		JLabel lblCezariene = new JLabel("Cezariene: 1");
		GridBagConstraints gbc_lblCezariene = new GridBagConstraints();
		gbc_lblCezariene.insets = new Insets(0, 0, 0, 5);
		gbc_lblCezariene.gridx = 1;
		gbc_lblCezariene.gridy = 2;
		InformationGridBagLayoutPanel.add(lblCezariene, gbc_lblCezariene);
		
		JLabel lblAvorturiLaCerere = new JLabel("Avorturi la cerere: 0");
		GridBagConstraints gbc_lblAvorturiLaCerere = new GridBagConstraints();
		gbc_lblAvorturiLaCerere.insets = new Insets(0, 0, 0, 5);
		gbc_lblAvorturiLaCerere.gridx = 2;
		gbc_lblAvorturiLaCerere.gridy = 2;
		InformationGridBagLayoutPanel.add(lblAvorturiLaCerere, gbc_lblAvorturiLaCerere);
		
		JLabel lblAvorturiSpontane = new JLabel("Avorturi spontane: 0");
		GridBagConstraints gbc_lblAvorturiSpontane = new GridBagConstraints();
		gbc_lblAvorturiSpontane.insets = new Insets(0, 0, 0, 5);
		gbc_lblAvorturiSpontane.gridx = 3;
		gbc_lblAvorturiSpontane.gridy = 2;
		InformationGridBagLayoutPanel.add(lblAvorturiSpontane, gbc_lblAvorturiSpontane);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 25, 25, 25);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		GridBagLayoutPanel.add(scrollPane, gbc_scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setRowHeaderView(panel_1);
		
		JPanel medicalInfoPanel = new JPanel();
		scrollPane.setViewportView(medicalInfoPanel);
		GridBagLayout gbl_medicalInfoPanel = new GridBagLayout();
		gbl_medicalInfoPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_medicalInfoPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_medicalInfoPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_medicalInfoPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		medicalInfoPanel.setLayout(gbl_medicalInfoPanel);
		
		JLabel AntecedenteLabel = new JLabel("Antecedente 12.12.2019");
		GridBagConstraints gbc_AntecedenteLabel = new GridBagConstraints();
		gbc_AntecedenteLabel.insets = new Insets(0, 0, 5, 5);
		gbc_AntecedenteLabel.anchor = GridBagConstraints.WEST;
		gbc_AntecedenteLabel.gridx = 1;
		gbc_AntecedenteLabel.gridy = 0;
		medicalInfoPanel.add(AntecedenteLabel, gbc_AntecedenteLabel);
		
		JLabel lblNewLabel_1 = new JLabel("             ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		medicalInfoPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textAntecedente = new JTextField();
		textAntecedente.setText("Antecedente pe mai multe randuri, de testat daca nu e mai bine cu Label  oare");
		GridBagConstraints gbc_textAntecedente = new GridBagConstraints();
		gbc_textAntecedente.insets = new Insets(0, 0, 5, 45);
		gbc_textAntecedente.gridwidth = 6;
		gbc_textAntecedente.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAntecedente.gridx = 1;
		gbc_textAntecedente.gridy = 1;
		medicalInfoPanel.add(textAntecedente, gbc_textAntecedente);
		textAntecedente.setColumns(10);
		
		JLabel lblAntecedente = new JLabel("Antecedente 13.12.2019");
		lblAntecedente.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblAntecedente = new GridBagConstraints();
		gbc_lblAntecedente.anchor = GridBagConstraints.WEST;
		gbc_lblAntecedente.insets = new Insets(0, 0, 5, 5);
		gbc_lblAntecedente.gridx = 1;
		gbc_lblAntecedente.gridy = 2;
		medicalInfoPanel.add(lblAntecedente, gbc_lblAntecedente);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		medicalInfoPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblAntcedenteNumarulDoi = new JLabel("Antcedente numarul doi pe mai multe randuri, ca label, vedem");
		GridBagConstraints gbc_lblAntcedenteNumarulDoi = new GridBagConstraints();
		gbc_lblAntcedenteNumarulDoi.anchor = GridBagConstraints.WEST;
		gbc_lblAntcedenteNumarulDoi.insets = new Insets(0, 0, 5, 5);
		gbc_lblAntcedenteNumarulDoi.gridx = 1;
		gbc_lblAntcedenteNumarulDoi.gridy = 3;
		medicalInfoPanel.add(lblAntcedenteNumarulDoi, gbc_lblAntcedenteNumarulDoi);
		
		JLabel lblMergiLa = new JLabel("Mergi la ->");
		GridBagConstraints gbc_lblMergiLa = new GridBagConstraints();
		gbc_lblMergiLa.anchor = GridBagConstraints.EAST;
		gbc_lblMergiLa.insets = new Insets(0, 0, 0, 5);
		gbc_lblMergiLa.gridx = 1;
		gbc_lblMergiLa.gridy = 4;
		medicalInfoPanel.add(lblMergiLa, gbc_lblMergiLa);
		
		JButton btnNewButton = new JButton("Ecran principal");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		medicalInfoPanel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inapoi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 4;
		medicalInfoPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 4;
		gbc_btnNewButton_2.gridy = 4;
		medicalInfoPanel.add(btnNewButton_2, gbc_btnNewButton_2);
	}

}
