package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * To write all Data in the Map, in the *.out file.
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

	/**
	 * @param filepath full or partial path to the *.out file. Given in the main
	 *                 class.
	 */
	private String filepath;

	/**
	 * 
	 * @param filepath the path to the out file.
	 */
	public WriteSymptomDataToFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void writeSymptom(Map<String, Integer> symptoms) {

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				writer.write(entry.getKey() + " - " + entry.getValue());
				((BufferedWriter) writer).newLine();
			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}