package com.hemebiotech.analytics;

public class Principale {

	public static void main(String[] args) {
		AnalyticsCounter a = new AnalyticsCounter();
		
		a.readSortSymptoms();
		
		a.readListSortSymptoms();

		a.writeSymptoms();
		
		a.writeSymptomsList();
	}
}
