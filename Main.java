
/**
 * �������� ��������, ��� ���� ������� � ����� (����� �� ����� 9999 �������):
 * 1. ��������� ����� ������� �����, �� �������� �� ���������;
 * 2. ���� ��������� ����� ���� - �������� �������� �����������;
 * 3. �������� ������� (�� �������) � ����� � ������ ����� (���� �� ������� �����������);
 * 4. �������� ������� � ������� ������;
 * 5. ������� � ������� ����� ��� ��� ������/�������.
 * 
 * @version 1.0
*/

public class Main {

	public static void main(String[] args) {	
				
		String text = ImportText.getText();				
		String[] sentences = TextParser.parseToSentence(text);			
		String keyword = KeywordEnter.getKeyword();
		
		
		System.out.println(KeywordSearch.search(keyword));
		
		System.out.println(TextParser.removeSentence(sentences, keyword));		
		
	}

}
