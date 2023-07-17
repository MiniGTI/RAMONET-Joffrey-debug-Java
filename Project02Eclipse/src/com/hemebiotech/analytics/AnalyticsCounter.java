package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * To write an ordered symptom list in a *.out file from a file list.
 */
public class AnalyticsCounter {

	/**
	 * reader method input.
	 */
	ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("");
	/**
	 * writer method input.
	 */
	WriteSymptomDataToFile writer = new WriteSymptomDataToFile("");

	/**
	 * The method to call all methods in the good order.
	 */
	public void analyticsCounter() {
		writeSymptoms(sortSymptoms(countSymptoms(getSymptoms())));
	}

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
	 * input DATA
	 * 
	 * @return result ArrayList
	 */
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();
		return result = reader.getSymptoms();
	}

	/**
	 * allocation of symptoms to the number of occurrences
	 * 
	 * @param result ArrayList
	 * @return symptoms Map
	 */
	public Map<String, Integer> countSymptoms(List<String> result) {
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
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {

		Map<String, Integer> orderSymptoms = new TreeMap<String, Integer>(symptoms);
		return orderSymptoms;

	}

	/**
	 * output file
	 * 
	 * @param orderSymptoms TreeMap
	 */
	public void writeSymptoms(Map<String, Integer> orderSymptoms) {
		writer.writeSymptom(orderSymptoms);
	}

}