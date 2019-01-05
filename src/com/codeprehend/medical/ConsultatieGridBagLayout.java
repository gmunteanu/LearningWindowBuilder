package com.codeprehend.medical;

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

public class ConsultatieGridBagLayout {

	private JFrame frame;
	private JTextField textAntecedente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultatieGridBagLayout window = new ConsultatieGridBagLayout();
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
	public ConsultatieGridBagLayout() {
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
		
		JPanel InformationGridBagLayoutPanel = new JPanel();
		GridBagConstraints gbc_InformationGridBagLayoutPanel = new GridBagConstraints();
		gbc_InformationGridBagLayoutPanel.insets = new Insets(25, 25, 10, 25);
		gbc_InformationGridBagLayoutPanel.weightx = 1.0;
		gbc_InformationGridBagLayoutPanel.fill = GridBagConstraints.BOTH;
		gbc_InformationGridBagLayoutPanel.gridx = 0;
		gbc_InformationGridBagLayoutPanel.gridy = 0;
		GridBagLayoutPanel.add(InformationGridBagLayoutPanel, gbc_InformationGridBagLayoutPanel);
		GridBagLayout gbl_InformationGridBagLayoutPanel = new GridBagLayout();
		gbl_InformationGridBagLayoutPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_InformationGridBagLayoutPanel.rowHeights = new int[]{0, 0};
		gbl_InformationGridBagLayoutPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_InformationGridBagLayoutPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		InformationGridBagLayoutPanel.setLayout(gbl_InformationGridBagLayoutPanel);
		
		JLabel NameLabel = new JLabel("New labelsdfdsfergtrdgfgdf");
		GridBagConstraints gbc_NameLabel = new GridBagConstraints();
		gbc_NameLabel.weightx = 1.0;
		gbc_NameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_NameLabel.gridx = 0;
		gbc_NameLabel.gridy = 0;
		InformationGridBagLayoutPanel.add(NameLabel, gbc_NameLabel);
		
		JLabel PrenumeLabel = new JLabel("New label");
		GridBagConstraints gbc_PrenumeLabel = new GridBagConstraints();
		gbc_PrenumeLabel.weightx = 1.0;
		gbc_PrenumeLabel.insets = new Insets(0, 0, 0, 5);
		gbc_PrenumeLabel.gridx = 1;
		gbc_PrenumeLabel.gridy = 0;
		InformationGridBagLayoutPanel.add(PrenumeLabel, gbc_PrenumeLabel);
		
		JLabel DataNastereLabel = new JLabel("New label");
		GridBagConstraints gbc_DataNastereLabel = new GridBagConstraints();
		gbc_DataNastereLabel.weightx = 1.0;
		gbc_DataNastereLabel.insets = new Insets(0, 0, 0, 5);
		gbc_DataNastereLabel.anchor = GridBagConstraints.NORTH;
		gbc_DataNastereLabel.gridx = 2;
		gbc_DataNastereLabel.gridy = 0;
		InformationGridBagLayoutPanel.add(DataNastereLabel, gbc_DataNastereLabel);
		
		JLabel CNPLabel = new JLabel("New label");
		GridBagConstraints gbc_CNPLabel = new GridBagConstraints();
		gbc_CNPLabel.weightx = 1.0;
		gbc_CNPLabel.insets = new Insets(0, 0, 0, 5);
		gbc_CNPLabel.gridx = 3;
		gbc_CNPLabel.gridy = 0;
		InformationGridBagLayoutPanel.add(CNPLabel, gbc_CNPLabel);
		
		JLabel TelefonLabel = new JLabel("New label");
		GridBagConstraints gbc_TelefonLabel = new GridBagConstraints();
		gbc_TelefonLabel.anchor = GridBagConstraints.EAST;
		gbc_TelefonLabel.weightx = 1.0;
		gbc_TelefonLabel.gridx = 4;
		gbc_TelefonLabel.gridy = 0;
		InformationGridBagLayoutPanel.add(TelefonLabel, gbc_TelefonLabel);
		
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
		gbl_medicalInfoPanel.columnWidths = new int[]{0, 0, 0};
		gbl_medicalInfoPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_medicalInfoPanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_medicalInfoPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		medicalInfoPanel.setLayout(gbl_medicalInfoPanel);
		
		JLabel AntecedenteLabel = new JLabel("New label");
		GridBagConstraints gbc_AntecedenteLabel = new GridBagConstraints();
		gbc_AntecedenteLabel.insets = new Insets(0, 0, 5, 0);
		gbc_AntecedenteLabel.anchor = GridBagConstraints.WEST;
		gbc_AntecedenteLabel.gridx = 0;
		gbc_AntecedenteLabel.gridy = 0;
		medicalInfoPanel.add(AntecedenteLabel, gbc_AntecedenteLabel);
		
		textAntecedente = new JTextField();
		GridBagConstraints gbc_textAntecedente = new GridBagConstraints();
		gbc_textAntecedente.insets = new Insets(0, 0, 5, 0);
		gbc_textAntecedente.gridwidth = 5;
		gbc_textAntecedente.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAntecedente.gridx = 0;
		gbc_textAntecedente.gridy = 1;
		medicalInfoPanel.add(textAntecedente, gbc_textAntecedente);
		textAntecedente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		medicalInfoPanel.add(lblNewLabel, gbc_lblNewLabel);
	}

}
