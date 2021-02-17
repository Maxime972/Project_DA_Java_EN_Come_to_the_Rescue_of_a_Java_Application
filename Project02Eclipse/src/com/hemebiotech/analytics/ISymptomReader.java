package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * <p>Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications</p>
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty collection
	 * 
	 * @return a collection of all Symptoms obtained from a data source, duplicates are unpossible
	 */
	
	TreeMap<String, Integer> getSymptoms ();
	
}
