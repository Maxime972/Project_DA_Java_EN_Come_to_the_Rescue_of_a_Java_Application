package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Lecture de la TreeMap resulat, cr�ation d'un fichier externe.
 * @author Maxime
 * 
 */

public class AnalyticsCounter {
	
	TreeMap<String, Integer> resultat = new TreeMap<String, Integer>();
	
	ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("symptoms.txt");
	
	/**
	 * Cette m�thode readSortSymptoms va lire la TreeMap "<em>resultat</em>".
	 */
	public void readSortSymptoms() {
		resultat = rs.getSymptoms();
	}
		
	/**
	 * Cette m�thode writeSymptoms va g�n�rer et �crire les donn�es de la TreeMap "<em>resultat</em>" dans le fichier externe "<em>resulat.out</em>".
	 * 
	 * @exception IOException Si la connexion �tablie a �t� abandonn�e.
	 */
	public void writeSymptoms() {
		FileWriter writer;
		try {
			writer = new FileWriter("result.out");
			for (Map.Entry<String, Integer> element : resultat.entrySet()) {
				System.out.println(element.getKey() + " = " + element.getValue());
				writer.write(element.getKey() + " = " + element.getValue() + "\n");
			}
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}