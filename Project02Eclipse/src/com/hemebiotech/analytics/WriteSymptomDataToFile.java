package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple copy in the out file of all entry without order or sorting
 */

public class WriteSymptomDataToFile implements ISymptomsWriter {

	private String Filepath = "..\\Result.out";

	File result = new File(Filepath);

	@Override
	public void WriteSymptoms(Map<String, Integer> symptoms) {
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath));

			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				writer.write(entry.getKey() + " - " + entry.getValue());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}