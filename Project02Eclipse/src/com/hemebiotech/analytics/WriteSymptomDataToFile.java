package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple copy in the out file of all entry without order or sorting
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath = "..\\Result.out";

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