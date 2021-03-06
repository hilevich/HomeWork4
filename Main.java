
/**
 * Написати програму, яка буде здатана у тексті (розмір не менше 9999 символів):
 * 1. Знаходити певне ключове слово, що задається із клавіатури;
 * 2. Якщо ключового слова немає – виводити відповідне повідомлення;
 * 3. Виводити речення (всі речення) в якому є шукане слово (якщо це потрібно користувачу);
 * 4. Видалити речення з шуканим словом;
 * 5. Вивести в консоль текст без цих речень/речення.
 * 
 * @version 1.0
 *
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
