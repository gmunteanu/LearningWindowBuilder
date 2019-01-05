package com.codeprehend.medical.database;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputValidation {

	public static void validateTextField(String text) throws Exception {
		if (text != null && text.length() > 0) {
			Pattern pattern = Pattern.compile("([A-Z]{1}[a-z]*)[-| ]?[A-Z]?[a-z]*");
			Matcher matcher = pattern.matcher(text);
			if (!matcher.matches()) {
				throw new Exception("Textul '" + text + "' nu este corect. "
						+ "Se asteapta doar litere latine separate prin spatiu sau - .");
			}
		}
	}
	
	public static void validateBirthsNumber(String number, boolean emptyAllowed) throws Exception {
		if (number != null && number.length() > 0) {
			Pattern pattern = Pattern.compile("[0]|([1-9]{1}[0-9]?)");
			Matcher matcher = pattern.matcher(number);
			if (!matcher.matches()) {
				throw new Exception("Numarul '" + number + "' nu este corect.");
			}
		} else if (!emptyAllowed) {
			throw new Exception("Completati campurile numerice. ");
		}
	}
	
	//TODO check correct phone number
	public static void validatePhoneNumber(String phoneNumber) throws Exception {
		if (phoneNumber != null && phoneNumber.length() > 0) {
			Pattern pattern = Pattern.compile("[0]|([1-9]{1}[0-9]?)");
			Matcher matcher = pattern.matcher(phoneNumber);
			if (!matcher.matches()) {
				throw new Exception("Numarul '" + phoneNumber + "' nu este corect.");
			}
		}
	}
	
	public static void validateFields(JFrame window, String naturalBirths, String csectionBirths, 
			String requestedAbortions, String spontaneusAbortions) {
		
		try {
			validateBirthsNumber(naturalBirths, false);
			validateBirthsNumber(csectionBirths, false);
			validateBirthsNumber(requestedAbortions, false);
			validateBirthsNumber(spontaneusAbortions, false);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(window, exception.getMessage(), 
					"Erore de Validare", JOptionPane.ERROR_MESSAGE);
			exception.printStackTrace();
			return;
		}
	}
	
}
