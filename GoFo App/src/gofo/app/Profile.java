package gofo.app;
/**
 * Represents a profile. This class will be inherited by the classes Player and PlyGroundOwner.
 * @author Youssef Shawkat
 */
public class Profile {
    /**
    * A variable that stores the name.
    */
    protected String name;
    /**
    * A variable that stores the ID.
    */
    protected int ID;
    /**
    * A variable that stores the email.
    */
    protected String email;
    /**
    * A variable that stores the password.
    */
    protected String password;
    /**
    * A variable that stores the default location.
    */
    protected String defaultlocation;
    
    /**
    * A parameterized constructor that stores the info
    * @param name is the name
    * @param email is the email
    * @param password is the password
    * @param defaultlocation is the default location
    */
    public Profile(String name,String email,String password,String defaultlocation)
    {
        this.name=name;
        this.email=email;
        this.password=password;
        this.defaultlocation=defaultlocation;
    }
    
    /**
    * Another parameterized constructor that stores the info
    * @param name is the name
    * @param password is the password
    */
    public Profile(String name,String password)
    {
        this.name=name;

        this.password=password;
    }
    
}
