package com.codeprehend.medical.listeners;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.codeprehend.medical.MedicalRecordGUI;
import com.codeprehend.medical.dao.PatientsDAO;
import com.codeprehend.medical.database.InputValidation;
import com.codeprehend.medical.panels.SearchPatientPanel;


public class SearchPatientButtonActionListener {
	
	private MedicalRecordGUI mainWindow;
	private SearchPatientPanel searchPatientPanel;
	
	public SearchPatientButtonActionListener(SearchPatientPanel searchPatientPanel){
		this.searchPatientPanel = searchPatientPanel;
		
		String birthDateFiter = searchPatientPanel.getTextFieldDate().getText();
		String cnpFilter = searchPatientPanel.getTextFieldRegNumber().getText();
		String firstName = searchPatientPanel.getTextFieldFirstname().getText();
		String name = searchPatientPanel.getTextFieldName().getText();
		String phoneNo = searchPatientPanel.getTextFieldPhoneNumber().getText();
		
		try {
			InputValidation.validateTextField(name);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(searchPatientPanel, exception.getMessage(), 
					"Erore de Validare", JOptionPane.ERROR_MESSAGE);
			exception.printStackTrace();
			return;
		}
		
		//mainWindow.showPanelListOfPatients(PatientsDAO.getPatientsByFilter(name, firstName, cnpFilter, phoneNo, birthDateFiter));
	}
	
	
	// Verification if the wanted text fields are not empty and the format is correct: number date, telephone
	//TODO
	public boolean verifyTextFields(){
		return true;
	}
}