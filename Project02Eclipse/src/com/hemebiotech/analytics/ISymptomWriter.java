package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to the out file.
 * 
 * @param Key = String "symptom" Value = integer number of symptom occurrences
 */

public interface ISymptomWriter {

	public void writeSymptom(Map<String, Integer> symptoms);

	// @return simple Map with all symptom = 1.
	
}
