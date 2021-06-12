package gofo.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents the booking process.
 * @author Kareem Galal
 */
public class Booking {
    /**
    * an array that stores players.
    */
    public ArrayList<Player> playerArray = new ArrayList<Player>();
    
    /**
    * an array that stores Owners.
    */
    public ArrayList<PlayGroundOwner> ownerArray = new ArrayList<PlayGroundOwner>();
    
    static Scanner scanner = new Scanner (System.in);
    
    /**
    * A method that adds a new player once he signs up
    * @param user is the player
    */ 
    public void addPlayer(Player user)
    {
         playerArray.add(user);
    };
    
    /**
    * A method that adds a new owner once he signs up
    * @param user is the owner
    */ 
    public void addOwner(PlayGroundOwner user)
    {
         ownerArray.add(user);
    };
    
    /**
    * A method that displays the playgrounds with their available hours
    */ 
    public void displayPlayground()
    {
      for (int i = 0; i < ownerArray.size (); i++)
      {
          for(int j=0;j<ownerArray.get(i).myPG.size();j++)
          {
              System.out.println(ownerArray.get(i).myPG.get(j).getName());
              for(int k=0;k<ownerArray.get(i).myPG.get(j).AvaliableHours.size();k++)
              {
                    System.out.println(ownerArray.get(i).myPG.get(j).AvaliableHours.get(k));
              }
          }
      }
    }
    
   /**
    * A method that is responsible for the booking process
    * @param name is the playground's name
    * @param numberofhours is the number of hours the player wants to book
    */
    public void bookplayGround(String name,int numberofhours)
    {
     int ind=0;
     int index=0;
     for (int i = 0; i < ownerArray.size (); i++)
     {
          if(ownerArray.get(i).getname().equals(name))
          {    
              index=i;
              break;
          }
     }
       for (int i = 0; i < ownerArray.size (); i++)
      {
          for(int j=0;j<ownerArray.get(i).myPG.size();j++)
          {
              if(ownerArray.get(i).myPG.get(j).getName().equals(name))
              {
                  ind=j;
              }    
          };
          int hours;
          int removeIndex=0;
          for(int j=0;j<numberofhours;j++)
          {
            System.out.println("enter time slot you want to book");
            hours=scanner.nextInt();
            for(int k=0;k<ownerArray.get(index).myPG.get(j).AvaliableHours.size();k++)
            {
                if(ownerArray.get(index).myPG.get(j).AvaliableHours.get(k).equals(hours))
                        {
                            removeIndex=k;
                        }
            }
            ownerArray.get(index).myPG.get(j).AvaliableHours.remove(removeIndex);
       }
       
    };
    };   
}
