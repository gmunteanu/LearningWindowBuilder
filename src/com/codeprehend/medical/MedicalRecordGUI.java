package com.codeprehend.medical;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.codeprehend.medical.dao.AntecedentsDAO;
import com.codeprehend.medical.dao.PatientsDAO;
import com.codeprehend.medical.listeners.SearchPatientButtonActionListener;
import com.codeprehend.medical.panels.SearchPatientPanel;
import com.codeprehend.medical.resources.Antecedent;
import com.codeprehend.medical.resources.Examination;
import com.codeprehend.medical.resources.Patient;
import com.codeprehend.medical.database.InputValidation;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;

public class MedicalRecordGUI {

	private JFrame frmMedicalPersonalRecord;
	
	private JLayeredPane layeredPane;
	
	private JPanel listOfPatientsPanel;
	private JPanel searchPatientPanel;
	
	private JTextField textFieldName;
	private JTextField textFieldFirstname;
	private JTextField textFieldDate;
	private JTextField textFieldRegNumber;
	private JTextField textFieldPhoneNumber;
	
	private JList list = new JList();
	
	private List<Patient> patients;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton filesAccesButton;
	private JPanel panel_4;
	private JTextField textFieldName2;
	private JTextField textFieldFirstName2;
	private JTextField textFieldDate2;
	private JTextField textFieldRegNumber2;
	private JTextField textFieldPhoneNumber2;
	private JTextField textFieldNaturalBirthsNumber;
	private JTextField textFieldcSectionBirthNumber;
	private JTextField textFieldRequestedAbortionNumber;
	private JTextField textFieldSpotaneousAbortionNumber;
	private JButton btnNewButton_7;
	private JButton button;
	private JLabel antecedents;
	private JTextArea textAreaAntecedents;
	private JScrollPane scrollPane_1;
	private JLabel labelFirstName;
	private JLabel labelRegNumber2;
	private JLabel labelName;
	private JLabel labelDate;
	private JLabel lblNewLabel;
	private JLabel labelPhoneNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalRecordGUI window = new MedicalRecordGUI();
					window.frmMedicalPersonalRecord.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MedicalRecordGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmMedicalPersonalRecord = new JFrame();
		frmMedicalPersonalRecord.setTitle("Medical Personal record");
		frmMedicalPersonalRecord.setLocation(new Point(100, 1000));
		frmMedicalPersonalRecord.setBounds(new Rectangle(600, 1000, 0, 0));
		frmMedicalPersonalRecord.setBounds(100, 100, 984, 578);
		frmMedicalPersonalRecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMedicalPersonalRecord.getContentPane().setLayout(null);
		
		
		Date currentDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String stringCurrentDate = format.format(currentDate);
		String str = new String ("Antecedente la data ");
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmMedicalPersonalRecord.setLocation(dim.width/2-frmMedicalPersonalRecord.getSize().width/2, dim.height/2-frmMedicalPersonalRecord.getSize().height/2);
		
		panel_4 = new JPanel();
		panel_4.setBounds(40, 20, 882, 509);
		frmMedicalPersonalRecord.getContentPane().add(panel_4);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pacienta noua:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setLayout(null);
		
		labelName = new JLabel("Nume: ");
		labelName.setBounds(107, 26, 46, 14);
		panel_4.add(labelName);
		
		textFieldName2 = new JTextField();
		textFieldName2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldName2.setBounds(148, 20, 219, 26);
		panel_4.add(textFieldName2);
		textFieldName2.setColumns(10);
		
		textFieldFirstName2 = new JTextField();
		textFieldFirstName2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldFirstName2.setColumns(10);
		textFieldFirstName2.setBounds(485, 23, 219, 26);
		panel_4.add(textFieldFirstName2);
		
		labelFirstName = new JLabel("Prenume:");
		labelFirstName.setBounds(424, 26, 58, 14);
		panel_4.add(labelFirstName);
		
		labelDate = new JLabel("Data nastere:");
		labelDate.setBounds(65, 72, 77, 14);
		panel_4.add(labelDate);
		
		textFieldDate2 = new JTextField();
		textFieldDate2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldDate2.setColumns(10);
		textFieldDate2.setBounds(148, 66, 219, 26);
		panel_4.add(textFieldDate2);
		
		lblNewLabel = new JLabel("(zz/ll/aaaa)");
		lblNewLabel.setBounds(76, 86, 63, 14);
		panel_4.add(lblNewLabel);
		
		labelRegNumber2 = new JLabel("CNP: ");
		labelRegNumber2.setBounds(452, 72, 38, 14);
		panel_4.add(labelRegNumber2);
		
		textFieldRegNumber2 = new JTextField();
		textFieldRegNumber2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldRegNumber2.setColumns(10);
		textFieldRegNumber2.setBounds(485, 66, 219, 26);
		panel_4.add(textFieldRegNumber2);
		
		labelPhoneNumber2 = new JLabel("Telefon:");
		labelPhoneNumber2.setBounds(97, 114, 58, 14);
		panel_4.add(labelPhoneNumber2);
		
		textFieldPhoneNumber2 = new JTextField();
		textFieldPhoneNumber2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldPhoneNumber2.setColumns(10);
		textFieldPhoneNumber2.setBounds(148, 111, 219, 26);
		panel_4.add(textFieldPhoneNumber2);
		
		JLabel naturalBirthsNumber = new JLabel("Nasteri naturale:");
		naturalBirthsNumber.setBounds(34, 163, 94, 14);
		panel_4.add(naturalBirthsNumber);
		
		textFieldNaturalBirthsNumber = new JTextField();
		textFieldNaturalBirthsNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldNaturalBirthsNumber.setColumns(10);
		textFieldNaturalBirthsNumber.setBounds(129, 157, 38, 26);
		panel_4.add(textFieldNaturalBirthsNumber);
		
		textFieldcSectionBirthNumber = new JTextField();
		textFieldcSectionBirthNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldcSectionBirthNumber.setColumns(10);
		textFieldcSectionBirthNumber.setBounds(263, 157, 38, 26);
		panel_4.add(textFieldcSectionBirthNumber);
		
		JLabel cSectionBirthNumber = new JLabel("Cezariene:");
		cSectionBirthNumber.setBounds(195, 163, 68, 14);
		panel_4.add(cSectionBirthNumber);
		
		JLabel requestedAbortionNumber = new JLabel("Avorturi la cerere:");
		requestedAbortionNumber.setBounds(350, 163, 103, 14);
		panel_4.add(requestedAbortionNumber);
		
		textFieldRequestedAbortionNumber = new JTextField();
		textFieldRequestedAbortionNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldRequestedAbortionNumber.setColumns(10);
		textFieldRequestedAbortionNumber.setBounds(454, 157, 38, 26);
		panel_4.add(textFieldRequestedAbortionNumber);
		
		JLabel spontaneousAbortionNumber = new JLabel("Avorturi spontane:");
		spontaneousAbortionNumber.setBounds(559, 163, 117, 14);
		panel_4.add(spontaneousAbortionNumber);
		
		textFieldSpotaneousAbortionNumber = new JTextField();
		textFieldSpotaneousAbortionNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldSpotaneousAbortionNumber.setColumns(10);
		textFieldSpotaneousAbortionNumber.setBounds(666, 157, 38, 26);
		panel_4.add(textFieldSpotaneousAbortionNumber);
		
		btnNewButton_7 = new JButton("Salveaza");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				String name = textFieldName2.getText();
				String firstName = textFieldFirstName2.getText();
				String birthDate = textFieldDate2.getText();
				String phoneNumber = textFieldPhoneNumber2.getText();
				String regNumber = textFieldRegNumber2.getText();
				String naturalBirths = textFieldNaturalBirthsNumber.getText();
				String csectionBirths = textFieldcSectionBirthNumber.getText();
				String requestedAborstions = textFieldRequestedAbortionNumber.getText();
				String spontaneusAbortions = textFieldSpotaneousAbortionNumber.getText();
				
				String altele = "Not used";
				String address = "Not needed";
				
				String antecedents = textAreaAntecedents.getText();
				
				InputValidation.validateFields(frmMedicalPersonalRecord, naturalBirths, csectionBirths, requestedAborstions, spontaneusAbortions);
				
				//save the Patient
				Patient newPatient = new Patient();
				newPatient.setNume(name);
				newPatient.setPrenume(firstName);
				newPatient.setDataNasterii(LocalDate.parse(birthDate));
				newPatient.setCnp(regNumber);
				newPatient.setPrimaConsultatie(LocalDate.now());
				newPatient.setAdresa(address);
				newPatient.setNumarTelefon(phoneNumber);
				newPatient.setAltele(altele);
				newPatient.setNasteriNaturale(Integer.valueOf(naturalBirths));
				newPatient.setCezariene(Integer.valueOf(csectionBirths));
				newPatient.setAvorturiLaCerere(Integer.valueOf(requestedAborstions));
				newPatient.setAvorturiSpontane(Integer.valueOf(spontaneusAbortions));
				
				Long patientId = PatientsDAO.savePatient(newPatient);
				
				if (patientId <= 0) {
					JOptionPane.showMessageDialog(frmMedicalPersonalRecord, "Pacientul " + name + " " + firstName + " nu a putut fi inregistrat ", 
							"Erroare", JOptionPane.ERROR_MESSAGE);
					return;
				}
				Antecedent antecedent = new Antecedent(patientId, antecedents, LocalDate.now());
				Long antecedentId = AntecedentsDAO.saveAntecedente(antecedent);
				
				if (antecedentId > 0) {
					JOptionPane.showMessageDialog(frmMedicalPersonalRecord, "Patient inregistrat " + name + " " + firstName + " cu succes", 
							"Confirmare inregistrare", JOptionPane.INFORMATION_MESSAGE);
					List<Antecedent> antecedentsList = new ArrayList<Antecedent>();
					antecedentsList.add(antecedent);
					List<Examination> examinationsList = new ArrayList<Examination>();
					//frmMedicalPersonalRecord.showExaminationPatientPanel(newPatient, antecedentsList, examinationsList);
				} else {
					JOptionPane.showMessageDialog(frmMedicalPersonalRecord, "Antecedentele pacientului " + name + " " + firstName + " nu au fost inregistrate ", 
							"Erroare", JOptionPane.ERROR_MESSAGE);
					return;
				}
						

			}
		});
		btnNewButton_7.setBounds(195, 207, 106, 37);
		panel_4.add(btnNewButton_7);
		
		button = new JButton("Renunta");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		button.setBounds(585, 214, 106, 37);
		panel_4.add(button);
		
		antecedents = new JLabel(str.concat(stringCurrentDate));
		antecedents.setFont(new Font("Tahoma", Font.BOLD, 11));
		antecedents.setBounds(34, 259, 229, 26);
		panel_4.add(antecedents);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 283, 670, 215);
		panel_4.add(scrollPane_1);
		
		textAreaAntecedents = new JTextArea();
		scrollPane_1.setViewportView(textAreaAntecedents);
		////
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(40, 20, 882, 509);
		frmMedicalPersonalRecord.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		layeredPane.add(panel_1, "name_13744824594058");
		panel_1.setLayout(null);
		
		searchPatientPanel = new JPanel();
		searchPatientPanel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		searchPatientPanel.setBounds(253, 22, 340, 367);
		
		searchPatientPanel.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cautare pacienta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Cautare pacienta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		panel_1.add(searchPatientPanel);
		searchPatientPanel.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldName.setBounds(122, 27, 181, 26);
		searchPatientPanel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel labelName1 = new JLabel("Nume:");
		labelName1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelName1.setBounds(10, 33, 46, 14);
		searchPatientPanel.add(labelName1);
		
		JLabel labelFirstName1 = new JLabel("Prenume:");
		labelFirstName1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelFirstName1.setBounds(10, 72, 65, 14);
		searchPatientPanel.add(labelFirstName1);
		
		textFieldFirstname = new JTextField();
		textFieldFirstname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldFirstname.setBounds(122, 66, 181, 26);
		searchPatientPanel.add(textFieldFirstname);
		textFieldFirstname.setColumns(10);
		
		JLabel labelDate1 = new JLabel("Data nasterii (zz/ll/aaaa):");
		labelDate1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelDate1.setBounds(10, 111, 131, 20);
		searchPatientPanel.add(labelDate1);
		
		textFieldDate = new JTextField();
		textFieldDate.setBounds(152, 105, 151, 26);
		searchPatientPanel.add(textFieldDate);
		textFieldDate.setColumns(10);
		
		JButton searchPatientButton = new JButton("Cauta pacienta");
		searchPatientButton.setBackground(new Color(230, 230, 250));
		searchPatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchPatientPanel panel = new SearchPatientPanel();
				panel.getTextFieldFirstname().setText(textFieldFirstname.getText());
				panel.getTextFieldName().setText(textFieldName.getText());
				panel.getTextFieldDate().setText(textFieldDate.getText());
				panel.getTextFieldRegNumber().setText(textFieldRegNumber.getText());
				panel.getTextFieldPhoneNumber().setText(textFieldPhoneNumber.getText());
				
				switchPanels(panel_2);
				
				patients = PatientsDAO.getPatientsByFilter(textFieldName.getText(), textFieldFirstname.getText(), textFieldRegNumber.getText(), textFieldPhoneNumber.getText(), textFieldDate.getText());
				
				DefaultListModel DLM = new DefaultListModel();
				for (Patient pacient: patients) {
					
					String str = new String ("");
					str = str.concat(pacient.getNume());
					str = str.concat("  ");
					str = str.concat(pacient.getPrenume());
					str = str.concat("   ");
					str = str.concat(pacient.getDataNasterii().toString());
					str = str.concat("   CNP: ");
					str = str.concat(pacient.getCnp());
					/*str = str.concat("   tel: ");
					str = str.concat(pacient.getNumarTelefon());*/

					
					DLM.addElement(str);
										
				}
				
				list.setModel(DLM);
			}
		});
		
		searchPatientButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		searchPatientButton.setBounds(85, 236, 181, 23);
		searchPatientPanel.add(searchPatientButton);
		
		JButton newPatientButton = new JButton("Pacienta noua");
		newPatientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_4);
			}
		});
		newPatientButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		newPatientButton.setBounds(30, 333, 260, 23);
		searchPatientPanel.add(newPatientButton);
		
		JLabel labelRegNumber = new JLabel("CNP:");
		labelRegNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelRegNumber.setBounds(10, 154, 83, 14);
		searchPatientPanel.add(labelRegNumber);
		
		textFieldRegNumber = new JTextField();
		textFieldRegNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldRegNumber.setBounds(122, 148, 181, 26);
		searchPatientPanel.add(textFieldRegNumber);
		textFieldRegNumber.setColumns(10);
		
		JLabel labelPhoneNumber = new JLabel("Telefon:");
		labelPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		labelPhoneNumber.setBounds(10, 193, 83, 14);
		searchPatientPanel.add(labelPhoneNumber);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(122, 187, 181, 26);
		searchPatientPanel.add(textFieldPhoneNumber);
		
		panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_13781118993742");
		
		listOfPatientsPanel = new JPanel();
		listOfPatientsPanel.setBorder(new TitledBorder(null, "Lista paciente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listOfPatientsPanel.setLayout(null);
		
		list.setBounds(10, 23, 434, 344);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listOfPatientsPanel.add(list);
		
		JButton folderAccesButton = new JButton("Acceseaza dosar");
		folderAccesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i = list.getSelectedIndex();
				
				Patient pacient = patients.get(i);
				
				switchPanels(panel_3);
				
				String str = new String("");
				str = str.concat(pacient.getNume());
				str = str.concat("  ");
				str = str.concat(pacient.getPrenume());
				str = str.concat("   data nastere: ");
				str = str.concat(pacient.getDataNasterii().toString());
				str = str.concat("    CNP: ");
				str = str.concat(pacient.getCnp());
				
				patientInfoTextArea_1.setText(str);
				Font font2 = new Font("TimesNewRoman", Font.BOLD, 14);
				patientInfoTextArea_1.setFont(font2);
				
				str = "Nasteri naturale: ";
				str = str.concat(Integer.toString(pacient.getNasteriNaturale()));
				str = str.concat("   Cezariene: ");
				str = str.concat(Integer.toString(pacient.getCezariene()));
				str = str.concat("   Avorturi la cerere: ");
				str = str.concat(Integer.toString(pacient.getAvorturiLaCerere()));
				str = str.concat("    Avorturi spontane: ");
				str = str.concat(Integer.toString(pacient.getAvorturiSpontane()));
				
				patientInfoTextArea_2.setText(str);
				Font font3 = new Font("TimesNewRoman", Font.BOLD, 12);
				patientInfoTextArea_2.setFont(font3);
			}
		});
		folderAccesButton.setBounds(454, 84, 151, 39);
		listOfPatientsPanel.add(folderAccesButton);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addComponent(listOfPatientsPanel, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(243, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(22)
					.addComponent(listOfPatientsPanel, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
					.addGap(24))
		);
		
		JButton backButton = new JButton("Inapoi");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panel_1);
			}
		});
		backButton.setBounds(489, 311, 102, 23);
		listOfPatientsPanel.add(backButton);
		
		filesAccesButton = new JButton("Acceseaza fisiere");
		filesAccesButton.setBounds(454, 160, 151, 39);
		listOfPatientsPanel.add(filesAccesButton);
		panel_2.setLayout(gl_panel_2);

		
	}
	
	public void switchPanels(JPanel panel){
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
}
