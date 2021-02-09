package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Maxime
 *
 */

public class AnalyticsCounter {

	TreeMap<String, Integer> resultat = new TreeMap<String, Integer>();
	TreeMap<String, Integer> resultatTreeList = new TreeMap<String, Integer>();
	
	ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("symptoms.txt");
	
	public void readSortSymptoms() {
		resultat = rs.GetSymptoms();
	}
	
	public void readListSortSymptoms() {
		List<String> resultList = rs.GetSymptomsList();
		
		for (String symptomes : resultList) {
			
			if(resultatTreeList.containsKey(symptomes)) {
				
				int value = resultatTreeList.get(symptomes) + 1;
				resultatTreeList.put(symptomes, value);
				
			} else {
				resultatTreeList.put(symptomes, 1);	
			}
			
		}

	}
	
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
	
	public void writeSymptomsList() {
		FileWriter writerList;
		try {
			writerList = new FileWriter("resultList.out");
			for (Map.Entry<String, Integer> element : resultatTreeList.entrySet()) {
				System.out.println("(List) " + element.getKey() + " = " + element.getValue());
				writerList.write(element.getKey() + " = " + element.getValue() + "\n");
			}
			writerList.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}