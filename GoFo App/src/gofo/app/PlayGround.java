package gofo.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents a playground.
 * @author Youssef Shawkat/Kareem Galal 
 */
public class PlayGround {
    
    /**
    * A variable that stores the playground's name.
    */
    private String name;
    /**
    * A variable that stores the playground's location.
    */
    private String location;
    /**
    * A variable that stores the playground's size.
    */
    private float size;
    /**
    * A variable that stores the playground's price per hour.
    */
    private float PricePerHour;
    /**
    * A variable that stores the playground's cancellation period.
    */
    private int CancellationPeriod;
    /**
    * A variable that stores the playground's status(active or suspended).
    */
    private boolean Active;
    /**
    * an array that stores the playground's active hours.
    */
    public ArrayList<Integer> AvaliableHours = new ArrayList<Integer>();
    /**
    * A variable that stores the complaint message the player wants to send to the administrator.
    */
    public String Complain;
    

    static Scanner scanner = new Scanner (System.in);
   
    /**
    * A parameterized constructor that adds a playground and its available hours.
    * @param _name is the playground's name
    * @param _location is the playground's location
    * @param _size is the playground's size
    * @param _PricePerHour is the playground's price per hour
    * @param _CancellationPeriod is the playground's cancellation period
    */
    public PlayGround(String _name, String _location, float _size, int _PricePerHour ,int _CancellationPeriod)
    {
        int _AvaliableHours; 
        int hours;  
        name = _name;
        location = _location;
        size = _size;
        PricePerHour = _PricePerHour;
        CancellationPeriod = _CancellationPeriod;

        System.out.println("Enter Number of Avaliable Hours: ");

        
        _AvaliableHours = scanner.nextInt();
        scanner.next();
        System.out.println(_AvaliableHours);
        for (int i = 0; i <_AvaliableHours ; i++) 
        { 		      

            System.out.print("Enter Avaliable Hours in 24-Format ");  

            hours = scanner.nextInt();

            AvaliableHours.add(hours);
            
        }
    
};

    /**
    * Another parameterized constructor that adds a playground and its available hours.
    * @param _name is the playground's name
    * @param _PricePerHour is the playground's price per hour
    */
    public PlayGround(String _name,  int _PricePerHour )
    {

        int _AvaliableHours; 
        int hours;  
        name = _name;
        PricePerHour = _PricePerHour;

        System.out.println("Enter Number of Avaliable Hours: ");

        _AvaliableHours = scanner.nextInt();
        
        for (int i = 0; i < _AvaliableHours; i++) 
        { 		      

            System.out.print("Enter Avaliable Hours in 24-Format ");  

            hours = scanner.nextInt();

            AvaliableHours.add(hours);
                 
        }
    
};

  /**
  * A method that retrieves the playground's name
  * @return the playground name
  */   
    public String getName()
    {
        return name;
    }
    
}

