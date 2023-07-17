package com.hemebiotech.analytics;

/**
 * Symptoms DATA compiler.
 * 
 * @author minir Alex, Caroline, Joffrey
 * @version 1.0
 */
public class Main {

	/**
	 * Call the analyticsCounter() method.
	 */
	public static void main(String[] args) {

		ReadSymptomDataFromFile ISymptomReader = new ReadSymptomDataFromFile("..\\Symptoms.txt");
		WriteSymptomDataToFile ISymptomWriter = new WriteSymptomDataToFile("..\\Result.out");
		AnalyticsCounter AnalyticsCounter = new AnalyticsCounter(ISymptomReader, ISymptomWriter);

		AnalyticsCounter.analyticsCounter();

	}

}
