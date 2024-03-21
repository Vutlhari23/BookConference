
package bookconference;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oop.ct2.author.Author;


public class BookConference {
     
  
   
    public static void main(String[] args) {
         BookConference register=new BookConference();
         String[] bookInfoArray = {
            "Smith#10#7",
            "Johnson#5#5",
            "Williams#8#10",
            "Jones#12#6",
            "Brown#3#8",
            "Davis#6#9",
            "Miller#9#12",
            "Wilson#15#4",
            "Moore#7#11",
            "Taylor#4#3",
            "Ava#11#13",
            "Olivia#2#2",
            "Emily#13#11",
            "Emma#6#8",
            "Benjamin#10#5"
          };
		
         ArrayList<Author>books=new ArrayList<Author>();
            for (int i = 0; i <bookInfoArray.length; i++) {
            String  []s=bookInfoArray[i].split("#");
            
            books.add(new Author(s[0],Integer.parseInt(s[1]),Integer.parseInt(s[2])));
            
        }
           for
//           f
       
    }
    //Methods
            public  static void registerAuthor(String name,int bookNum, int age,ArrayList<Author> author){
            
             author.add(new Author(name,bookNum, age));
       
        }
        public  int  targetAgeOfAuthor(ArrayList<Author>author,String authorName){
        
        int results=-1;
        for (int k = 0; k <author.size(); k++) {
            if((authorName.equalsIgnoreCase(author.get(k).getName()))){
                author.get(k).getTargetAge();
            }
        }
        return results;
}
         public String  mostBooks(ArrayList<Author>author){
        int highestNoBooks=0;
        String authorName=" ";
        for (int i = 0; i <author.size(); i++) {
            if(author.get(i).getNumberOfBooks()>highestNoBooks){
               highestNoBooks=author.get(i).getNumberOfBooks();
                authorName=author.get(i).getName();
                
            }
            
        }
           return authorName;
    }
}