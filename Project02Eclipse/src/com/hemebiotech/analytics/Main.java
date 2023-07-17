package com.hemebiotech.analytics;

public class Main {

	public static void main(String[] args) {
		
		ReadSymptomDataFromFile ISymptomReader = new ReadSymptomDataFromFile("..\\Symptoms.txt");
		WriteSymptomDataToFile ISymptomWriter = new WriteSymptomDataToFile("..\\Result.out");
		AnalyticsCounter AnalyticsCounter = new AnalyticsCounter(ISymptomReader, ISymptomWriter);
		
		AnalyticsCounter.analyticsCounter();
		
		}

	}


