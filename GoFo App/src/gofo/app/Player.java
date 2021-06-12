package gofo.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents a player.
 * @author Youssef Shawkat
 */
public class Player extends Profile{
    
    /**
    * A parameterized constructor that adds the info of an owner
    * @param name is the player's name
    * @param email is the player's email
    * @param password is the player's password
    * @param defaultlocation is the player's default location
    */
    public Player(String name,String email,String password,String defaultlocation)
    {
        super(name,email,password,defaultlocation);  
    };
     
    /**
    * Another parameterized constructor that adds the info of an owner
    * @param name is the player's name
    * @param password is the player's password
    */
    public Player(String name,String password)
    {
        super(name,password);  
    };
    
   /**
   * A method that sets the player's name
   * @param name is the name
   */ 
    public void setname(String name)
    {
        this.name=name;
    }
  
    /**
    * A method that sets the player's password
    * @param password is the password
    */ 
    public void setPassword(String password)
    {
        this.password=password;
    }
  
    /**
    * A method that sets the player's email
    * @param email is the email
    */ 
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
    * A method that retrieves the player's name
    * @return the name
    */   
    public String getname()
    {
        return name;
    }
    
    /**
    * A method that retrieves the player's password
    * @return the password
    */   
    public String getPassword()
    {
        return password;
    }
   
    /**
    * A method that retrieves the player's email
    * @return the email
    */   
    public String getEmail()
    {
        return email;
    }
  
 }    

