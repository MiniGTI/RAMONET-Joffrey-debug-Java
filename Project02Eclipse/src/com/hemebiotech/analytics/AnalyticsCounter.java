package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	//class to call the methods in the main class.
	
	ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
	WriteSymptomDataToFile writer = new WriteSymptomDataToFile();

	List<String> result = new ArrayList<String>();
	Map<String, Integer> symptoms = new HashMap<String, Integer>();

	public AnalyticsCounter(ReadSymptomDataFromFile reader, WriteSymptomDataToFile writer) {
		this.reader = reader;
		this.writer = writer;

	}

	// input DATA
	public List<String> getSymptoms() {
		return result = reader.getSymptoms();

	}

	// allocation of symptoms to the number of occurrences
	public Map<String, Integer> countSymptoms(List<String> result) {
		for (String symptom : result) {
			if (symptoms.containsKey(symptom)) {
				symptoms.replace(symptom, symptoms.get(symptom) + 1);
			} else {
				symptoms.put(symptom, 1);
			}
		}
		return symptoms;
	}

	// sort in alphabetical order
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {

		Map<String, Integer> orderSymptoms = new TreeMap<String, Integer>(symptoms);
		return orderSymptoms;

	}

	// output file
	public void writeSymptoms(Map<String, Integer> orderSymptoms) {
		writer.writeSymptom(orderSymptoms);
	}
	public static void main (String[] args) {
		
	}
}