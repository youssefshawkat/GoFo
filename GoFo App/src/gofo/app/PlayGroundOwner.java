package gofo.app;
import java.util.ArrayList;
/**
 * Represents a playground owner.
 * @author Youssef Shawkat/Kareem Galal
 */
public class PlayGroundOwner extends Profile {
 
 /**
 * A parameterized constructor that adds the info of an owner
 * @param name is the playground owner's name
 * @param email is the playground owner's email
 * @param password is the playground owner's password
 * @param defaultlocation is the playground owner's default location
 */
 public PlayGroundOwner(String name,String email,String password,String defaultlocation)
 {
   super(name,email,password,defaultlocation);  
 };
 
 /**
 * Another parameterized constructor that adds the info of an owner
 * @param name is the playground owner's name
 * @param password is the playground owner's password
 */
 public PlayGroundOwner(String name,String password)
 {
   super(name,password);  
 };
 
 /**
  * A method that sets the owner's name
  * @param name is the name
  */ 
 public void setname(String name)
 {
   this.name=name;
 }
  
  /**
  * A method that sets the owner's password
  * @param password is the password
  */ 
  public void setPassword(String password)
  {
    this.password=password;
  }
  
  /**
  * A method that sets the owner's email
  * @param email is the email
  */ 
  public void setEmail(String email)
  {
    this.email=email;
  }
 
  /**
  * A method that retrieves the owner's name
  * @return the playground name
  */   
  public String getname()
  {
    return name;
  }
   
  /**
  * A method that retrieves the owner's password
  * @return the password
  */   
  public String getPassword()
  {
    return password;
  }
  
  /**
  * A method that retrieves the owner's email
  * @return the email
  */   
  public String getEmail()
  {
    return email;
  }
  
 /**
 * an array that stores the owner's playground.
 */
 public ArrayList<PlayGround> myPG = new ArrayList<PlayGround>();   
 
  /**
  * A method that adds a new playground
  * @param PG is the playground
  */ 
 public void AddPlayGround(PlayGround PG)
 {
   myPG.add(PG);
 };
 
}
