package com.hemebiotech.analytics;
/**
 * <p>Contient la méthode main et permet de lancer le programme. <br>
 * Ce programme crée un fichier externe de symptômes avec le nombre d'occurrence à partir d'un fichier texte contenant une liste de symptôme.
 * </p>
 * 
 * @author Maxime
 *
 */
public class Principale {

	public static void main(String[] args) {
		
		AnalyticsCounter a = new AnalyticsCounter();
		
		a.readSortSymptoms();

		a.writeSymptoms();
		
	}
}
