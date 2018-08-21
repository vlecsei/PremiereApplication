package com.vladimir.application;

import javax.swing.JOptionPane;

import com.vladimir.entites.Personne;

public class Principale {

    public static void main(String[] args) {
	
	
	
	Personne marcel = new Personne("Marcel","Dupont",70);
	

	marcel.setPrenom(JOptionPane.showInputDialog(null, "Prénom ?", "Nouveau Prénom", JOptionPane.QUESTION_MESSAGE));
	JOptionPane.showMessageDialog(null, marcel,"Personne",JOptionPane.INFORMATION_MESSAGE);
	
	}

}
