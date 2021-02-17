package com.hemebiotech.analytics;
/**
 * Classe Principale
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
