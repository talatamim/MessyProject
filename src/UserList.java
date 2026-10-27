import java.util.ArrayList;

public class UserList
{
    private ArrayList<User> users = new ArrayList<>();

    public void add(User user)
    {
        
        if(user == null)
        {
            return;
        }

        this.users.add(user);
    }

    public ArrayList<User> getUsers()
    {
        return new ArrayList<>(users) ;
    }

   
}
