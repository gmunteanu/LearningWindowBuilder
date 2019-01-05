package com.codeprehend.medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExaminationPanelWindowBuilder {

	private JFrame frame;
	private JTextField patientPersonalInfoTextField;
	private JTextField patientMedicalInfoTextField;
	private JButton saveExaminationButton;
	private JButton modifyPatientInfoButton;
	private JButton homeButton;
	private JButton backFromExaminationPanel;
	private JTextArea antecedentsTextAreea;
	private JTextArea examinationDiagnosis;
	private JTextArea previousExamination;
	private JScrollPane scrollPane;
	private JButton fileExaminationButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExaminationPanelWindowBuilder window = new ExaminationPanelWindowBuilder();
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
	public ExaminationPanelWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(600, 1000, 0, 0));
		frame.setBounds(100, 100, 968, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 882, 532);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		saveExaminationButton = new JButton("Salveaza consultatia");
		saveExaminationButton.setBounds(656, 75, 156, 52);
		panel.add(saveExaminationButton);
		
		modifyPatientInfoButton = new JButton("Modifica info");
		modifyPatientInfoButton.setBounds(656, 146, 156, 52);
		panel.add(modifyPatientInfoButton);
		
		backFromExaminationPanel = new JButton("Inapoi");
		backFromExaminationPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		backFromExaminationPanel.setBounds(681, 459, 131, 39);
		panel.add(backFromExaminationPanel);
		
		homeButton = new JButton("Ecran principal");
		homeButton.setBounds(681, 409, 131, 39);
		panel.add(homeButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Date pacienta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(28, 23, 573, 77);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		patientPersonalInfoTextField = new JTextField();
		patientPersonalInfoTextField.setBackground(Color.WHITE);
		patientPersonalInfoTextField.setBounds(6, 16, 561, 28);
		panel_1.add(patientPersonalInfoTextField);
		patientPersonalInfoTextField.setEditable(false);
		patientPersonalInfoTextField.setFont(new Font("Times New Roman", Font.BOLD, 13));
		patientPersonalInfoTextField.setColumns(10);
		
		patientMedicalInfoTextField = new JTextField();
		patientMedicalInfoTextField.setBackground(Color.WHITE);
		patientMedicalInfoTextField.setBounds(6, 42, 561, 28);
		panel_1.add(patientMedicalInfoTextField);
		patientMedicalInfoTextField.setEditable(false);
		patientMedicalInfoTextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		patientMedicalInfoTextField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				scrollPane_1.setBounds(33, 122, 561, 300);
				antecedentsTextAreea.setBounds(33, 122, 561, 250);
				
			}
			
			public void mouseExited(MouseEvent arg0){
				scrollPane_1.setBounds(33, 122, 561, 137);
				antecedentsTextAreea.setBounds(33, 122, 561, 130);
				
			}
		});
		
		scrollPane_1.setBounds(33, 122, 561, 137);
		panel.add(scrollPane_1);
		
		
		antecedentsTextAreea = new JTextArea();
		antecedentsTextAreea.setText("erhygg\r\nsegftdg\r\nesdgtdf\r\ng\r\ndfg\r\ndfghdf\r\nghfd\r\nhgfh\r\nfghjgk\r\njji\r\nk\r\nhji\r\nkl\r\njk\r\nl\r\nk\r\n;\r\nghjkyuoui\r\ndfgdf\r\ndgdfhgf\r\ngfhgfjhg\r\nfghgfhgf\r\ndf");
		antecedentsTextAreea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				scrollPane_1.setBounds(33, 122, 561, 300);
				antecedentsTextAreea.setBounds(33, 122, 561, 250);
				
			}
			
			public void mouseExited(MouseEvent arg0){
				scrollPane_1.setBounds(33, 122, 561, 137);
				antecedentsTextAreea.setBounds(33, 122, 561, 130);
			}
		});
		
		
		antecedentsTextAreea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane_1.setViewportView(antecedentsTextAreea);
		antecedentsTextAreea.setCaretPosition(0);
		antecedentsTextAreea.setEditable(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("ASFSD\r\nFDGDF\r\nASFSDG\r\nSDGFDGH\r\nDFGHF\r\nGHGF\r\nGHFH\r\nGFH\r\nFG");
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Consultatie la data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(27, 284, 573, 113);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 561, 86);
		panel_2.add(scrollPane);
		
		examinationDiagnosis = new JTextArea();
		examinationDiagnosis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_2.setBounds(20, 100, 580, 310);
				scrollPane.setBounds(33, 122, 561, 300);
				examinationDiagnosis.setBounds(33, 122, 561, 250);
				
			}
			
			public void mouseExited(MouseEvent arg0){
				panel_2.setBounds(27, 284, 573, 113);
				scrollPane.setBounds(33, 122, 561, 137);
				examinationDiagnosis.setBounds(33, 122, 561, 130);
			}
		});
		examinationDiagnosis.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(examinationDiagnosis);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(28, 409, 573, 112);
		panel.add(scrollPane_2);
		
		previousExamination = new JTextArea();
		scrollPane_2.setViewportView(previousExamination);
		previousExamination.setEditable(false);
		previousExamination.setBackground(new Color(220, 220, 220));
		
		fileExaminationButton = new JButton("Acceseaza fisiere");
		fileExaminationButton.setBounds(656, 254, 156, 52);
		panel.add(fileExaminationButton);
	}
}
