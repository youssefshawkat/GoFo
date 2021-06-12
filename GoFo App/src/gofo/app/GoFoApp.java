package gofo.app;

import java.util.Scanner;

/**
 * The Main
 * @author Youssef Shawkat/Kareem Galal/Mahmoud Mohamed
 */

public class GoFoApp {
  static Scanner scanner = new Scanner (System.in);
  public static void mainmenu (Booking book) 
  {
     
    //messages that appear at the main menu  
    System.out.println ("1-Sign in");
    System.out.println ("2-SignUp");
    System.out.println ("3-Exit");
    int choice;//the variable which takes the choice of the user.
    // Read the next integer from the screen
    choice = scanner.nextInt ();
    
    if(choice==1)
    {
        System.out.println ("1-Sign in as Player");
        System.out.println ("2-Sign in as Playground owner");
        int userChoice;
        
        // Read the next integer from the screen
        userChoice = scanner.nextInt ();
        scanner.nextLine ();
        if(userChoice==1)
        {
            System.out.println("enter user name");
            String name=scanner.nextLine();//A variable which stores the username
             
    
            System.out.println("enter user password");
            String password=scanner.nextLine();//A variable which stores the password
             
            //A loop 
            Player player=new Player(name,password);//Creating a player object with the inputs above
            
            //A loop which searches for the name entered in the playerArray
            int index=0;//A variable which stores the index of the player's name un the playerArray
            for (int i = 0; i < book.playerArray.size (); i++)
            {
                String n = book.playerArray.get(i).getname();
                if (name.equals(n))
                {
                     index=i;
                     break;
                }
             
            }
            
            boolean flag=false;//A boolean variable which  will always be false if the username or password entered are false
            while(flag==false)//A while loop to check if the username and password entered are correct
            {
                if(!(book.playerArray.get(index).getname().equals(name)))
                {
                    System.out.println("enter user name");
                    String n=scanner.nextLine();
                    book.playerArray.get(index).setname (n);
                }
                else
                {
                     flag=false;
                }
                if(!(book.playerArray.get(index).getPassword().equals(password)))
                {
                   System.out.println("enter user password");
                   String p=scanner.nextLine();
                   book.playerArray.get(index).setPassword (p);                  
                }
                else
                {
                    flag=true;
                }
                
            }
            
            if(flag==true)
            {
                System.out.println("sign in successfull");
            }
            
            //The main menu of the player
            System.out.println("1-display");
            System.out.println("2-book");
            System.out.println ("3-Exit");
            
            int playerChoice;//A variable which  stores the choice of the player
            playerChoice=scanner.nextInt();
            scanner.nextLine ();
            if(playerChoice==1)
            {
                book.displayPlayground();
            }
            if(playerChoice==2)
            {
                System.out.println("enter playground name");
                String playgroundName=scanner.nextLine();//A variable that reads the name of the playground
                System.out.println("enter number of hours");
                int hours=scanner.nextInt();//A variable that reafs the number of hours the user wants to book
                scanner.nextLine();
                book.bookplayGround(playgroundName,hours);//Making the booking
                mainmenu(book); 
            }
             if(playerChoice==3)
             {
                mainmenu(book); 
             }
         }
        
        if(userChoice==2)
        {
            System.out.println("enter user name");
            String name=scanner.nextLine();
             
    
            System.out.println("enter user password");
            String password=scanner.nextLine();
             
            
            PlayGroundOwner owner=new PlayGroundOwner(name,password);
            
            int index=0;
            for (int i = 0; i < book.ownerArray.size (); i++)
            {
                String n = book.ownerArray.get (i).getname();
                if (name.equals(n))
                {
                    index=i;
                    break;
                }
             
            }
            
            boolean flag=false;
            while(flag==false)
            {
                if(!(book.ownerArray.get(index).getname().equals(name)))
                {
                    System.out.println("enter user name");
                    String n=scanner.nextLine();
                    book.ownerArray.get(index).setname (n);
                }
                else
                {
                    flag=false;
                }
                if(!(book.ownerArray.get(index).getPassword().equals(password)))
                {
                    System.out.println("enter user password");
                    String p=scanner.nextLine();
                    book.ownerArray.get(index).setPassword (p);                  
                }
                else
                {
                    flag=true;
                }    
            }
            if(flag==true)
            {
                System.out.println("sign in successfull");
            }
            
            //The owner's homepage
            System.out.println("1-Add new playground");
            System.out.println("2-Exit");
            
            int ownerChoice=0;
            ownerChoice=scanner.nextInt();
            scanner.nextLine ();
            if (ownerChoice == 1)
            {
                String playgroundName;//A variable that stores the playground's name
                System.out.println("Enter playground name");
                playgroundName=scanner.nextLine();
                System.out.println("Enter the price per hour");
                int price;//A variable that stores the playground's price per hour
                price=scanner.nextInt();
                scanner.nextLine ();
                PlayGround PG=new PlayGround(playgroundName,price);//Making a new playground
                book.ownerArray.get(index).AddPlayGround(PG);//Adding a new playground to the specified owner
            }
            if (ownerChoice == 2)
            {
                mainmenu(book);
            }
            mainmenu(book);          
        }
    }
    if ( choice==2)
    {
       
        //The signup page
        System.out.println ("1-Sign up as Player");
        System.out.println ("2-Sign up as Playground owner");
        System.out.println ("3-Exit");
         
        
        int userChoice;
        userChoice = scanner.nextInt ();
        scanner.nextLine ();
        if(userChoice==1)
        {
            System.out.println("enter user name");
            String name=scanner.nextLine();
        
            System.out.println("enter user email");
            String email=scanner.nextLine();
             
            System.out.println("enter user password");
            String password=scanner.nextLine();
             
            System.out.println("enter user location");
            String location=scanner.nextLine();
             
            Player p=new Player(name,email,password,location);
            book.addPlayer(p);
        }
        if(userChoice==2)
        {
            System.out.println("enter user name");
            String name=scanner.nextLine();
        
            System.out.println("enter user email");
            String email=scanner.nextLine();
             
            System.out.println("enter user password");
            String password=scanner.nextLine();
             
            System.out.println("enter user location");
            String location=scanner.nextLine();
             
            PlayGroundOwner owner=new PlayGroundOwner(name,email,password,location);
            book.addOwner(owner);
        }
        if (userChoice==3)
        {
            mainmenu(book);
        }
        mainmenu(book);
    }
  }

    public static void main(String[] args) {
        
        Booking book=new Booking();
        mainmenu(book);
    }
    
}
