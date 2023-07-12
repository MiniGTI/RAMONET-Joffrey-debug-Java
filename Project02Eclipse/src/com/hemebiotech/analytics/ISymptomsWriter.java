package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to the out file.
 * 
 * @param Key = String "symptom" Value = integer number of symptom occurrences
 */

public interface ISymptomsWriter {

	public void writeSymptoms(Map<String, Integer> symptoms);

}
