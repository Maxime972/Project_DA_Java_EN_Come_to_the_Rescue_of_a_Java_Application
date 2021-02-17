package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Lecture d'un fichier texte externe et cr�ation d'un TreeMap
 * @author Maxime
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * Constructeur ReadSymptomDataFromFile
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * La m�thode getSymptoms
	 * 
	 * @exception IOException Si la connexion �tablie a �t� abandonn�e.
	 * @return Une collection "<em>resultat</em>" avec les sympt�mes tri�s par ordre alphab�tique avec leur nombre d'occurrence
	 */
	@Override
	public TreeMap<String, Integer> getSymptoms() {
		
		TreeMap<String, Integer> resultat = new TreeMap<String, Integer>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {

					Integer valeur = resultat.get(line);

					if (valeur == null) {

						resultat.put(line, 1);

					} else {

						resultat.put(line, valeur + 1);
					}

					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return resultat;
	}
	
}
