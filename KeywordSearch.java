import java.util.Arrays;


public class KeywordSearch {
			
			/* @Ivan don't forget to remove public static void... */
			public static void main(String[] args){
			try {
				String text = new String("Lorem Ipsum is simply dummy text of the printing and typesetting industry."
						+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
						+ " when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
						+ "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
						+ " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,"
						+ " and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."); //entered text
			
			
				/* text @Ivan you must to change it*/
				String keyword = new String ("Lorem"); /* keyword to search in text @Ivan you must to change it*/
				
				Boolean found = Arrays.asList(text.split(" ")).contains(keyword); /* @checks if sentence contains keywords result is true or false */
				if(found){
				      System.out.println("Keyword [" + keyword + "] has been found in the text"); /* @prints that keyword found */ 
				      System.out.println("What Do you like to do with it?");
				      System.out.println("Press 1 to show all senteces with [" + keyword + "]"); 
				      System.out.println("Press 2 to delete all senteces with [" + keyword + "]");
				      System.out.println("Press 3 to show all senteces without [" + keyword + "]");
				} 	else {
						System.out.println("Error 2. Keyword [" + keyword + "] is absent in the text"); /* @It shows when keyword wasn't found in text*/
			 		}
	
			} 
			catch(IndexOutOfBoundsException e){
		    	  System.out.println("Error 1. Unknown");
		    	  }
			}
}
