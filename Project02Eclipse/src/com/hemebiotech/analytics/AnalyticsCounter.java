package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * To write an ordered symptom list in a *.out file from a file list.
 */
public class AnalyticsCounter {

	/**
	 * reader method input.
	 */
	private ReadSymptomDataFromFile reader;
	/**
	 * writer method input.
	 */
	private WriteSymptomDataToFile writer;

	/**
	 * AnalyticsCounter constructor
	 * 
	 * @param reader required to read the DATA file.
	 * @param writer required to write the output file.
	 */
	public AnalyticsCounter(ReadSymptomDataFromFile reader, WriteSymptomDataToFile writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	/**
	 * The method to call all methods in the good order.
	 */
	public void analyticsCounter() {
		List<String> symptoms = getSymptoms();
		Map<String, Integer> countSymptoms = countSymptoms(symptoms);
		Map<String, Integer> sortSymptoms = sortSymptoms(countSymptoms);
		writeSymptoms(sortSymptoms);
	}

	/**
	 * input DATA
	 * 
	 * @return result ArrayList
	 */
	private List<String> getSymptoms() {
		return  reader.getSymptoms();
	}

	/**
	 * allocation of symptoms to the number of occurrences
	 * 
	 * @param result ArrayList
	 * @return symptoms Map
	 */
	private Map<String, Integer> countSymptoms(List<String> result) {
		Map<String, Integer> symptoms = new HashMap<String, Integer>();
		for (String symptom : result) {
			if (symptoms.containsKey(symptom)) {
				symptoms.replace(symptom, symptoms.get(symptom) + 1);
			} else {
				symptoms.put(symptom, 1);	
			}
		}
		return symptoms;
		
	}

	/**
	 * sort in alphabetical order
	 * 
	 * @param symptoms Map
	 * @return orderSymptoms TreeMap
	 */
	private Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		Map<String, Integer> orderSymptoms = new TreeMap<String, Integer>(symptoms);
		
	return orderSymptoms;
	}

	/**
	 * output file
	 * 
	 * @param orderSymptoms TreeMap
	 */
	private void writeSymptoms(Map<String, Integer> orderSymptoms) {
		writer.writeSymptom(orderSymptoms);
	}

}