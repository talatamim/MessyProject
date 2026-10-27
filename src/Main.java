import java.io.IOException;
public class Main
{
    public static void main(String[] args)
    {
        User user1 = new User( 10,"Bob");
        User user2 = new User( 20,"Alice");
        User user3 = new User( 30,"Carl");

        UserList userList = new UserList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println(userList.getUsers());
        try
        {
            Persister.saveUsers(userList.getUsers());
            System.out.println("Users saved successfully!");
        }
        
        catch(IOException e)
        {
            System.out.println("Error saving users: " + e.getMessage());
        }

    }
}
