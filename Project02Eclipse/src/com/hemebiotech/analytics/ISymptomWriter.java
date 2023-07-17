package com.hemebiotech.analytics;

import java.util.Map;

/**
 * To write the transformed symptom data to the file out.
 */

public interface ISymptomWriter {

	/**
	 * If the reader not found DATA, return an empty file.
	 *
	 * @param symptoms Map with the DATA to write.
	 * @return the *.out the file to write the modified list of symptoms.
	 */
	public void writeSymptom(Map<String, Integer> symptoms);

}
