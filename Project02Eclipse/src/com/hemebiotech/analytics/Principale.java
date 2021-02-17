package com.hemebiotech.analytics;
/**
 * <p>Contient la m�thode main et permet de lancer le programme. <br>
 * Ce programme cr�e un fichier externe de sympt�mes avec le nombre d'occurrence � partir d'un fichier texte contenant une liste de sympt�me.
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
