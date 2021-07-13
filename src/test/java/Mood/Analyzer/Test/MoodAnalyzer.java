package Mood.Analyzer.Test;

public class MoodAnalyzer {

	public String analyseMood(String message) {

		if (message.toLowerCase().contains("sad"))
			return "SAD";

		return "HAPPY";

	}

}
