import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ImportText {

 String allText=null;
 String line=null;

public  String readText() throws IOException{
     try {
     FileReader fileReader = new FileReader(new File("Enter your address to file"));
     BufferedReader file = new BufferedReader(fileReader);

    allText= file.readLine();
      while ((line = file.readLine()) != null) {
          allText = allText+" "+line;

                  }


     }
     catch(Exception e)
     {
        JOptionPane.showMessageDialog(null, "file not found");
     }
     return allText;
    }


public void lengthString(String text)
{
    if(text!=null){
    int lengthText = text.length();
    
    if(lengthText<9999){
    System.out.println("please enter more text");
    }
    else
    {
    System.out.println("your text =   "+ lengthText+ "   symbol");  
    }
    }
    else
    {
    System.out.println("file is void"); 
    }
}
}
