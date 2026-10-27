import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        try
         
         (BufferedWriter writer= new BufferedWriter(new FileWriter(file)))
         {
        

        for(int index=0;index<users.size();index++) // Create a loop
        { // Nicely formatted block
            writer.write(users.get(index).toString()); 
            writer.newLine(); 
        } 
        
         }
    }
}
        // Ending parenthesis
    


