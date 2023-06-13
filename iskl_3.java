package iskl;

import java.io.*;
 
public class iskl_3 {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}