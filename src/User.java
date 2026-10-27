public class User
{
    public int id;
    public String name;
    public String address;

    public User(int id, String name)
    {
        
        if(name==null || name.isBlank() || name.length()> 100) // Testing length
        {
            throw new IllegalArgumentException("Invalid user name"); //If string is invalid, we dont try to store it
        }
        this.id = id;
        this.name = name;
    }

    public void setName(String name)
    {
        if(name==null || name.isBlank()  || name.length()>100)
        {
            throw new IllegalArgumentException(" Invalid name"); //If string is invalid, we dont try to store it
        }
        this.name = name;
    }
     
    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getAddress(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User user){
            return user.name.equals(name);
        }
        return false;
    }

     @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
