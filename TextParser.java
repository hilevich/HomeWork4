
public class TextParser {	
	
	public static String[] parseToSentence(String text) {					
		return text.split("[\\.\\!\\?]\\s*");		
	}
	
	public static String removeSentence(String[] sentences, String keyword) {
        return "sentences without keyword";
	}
	
}
