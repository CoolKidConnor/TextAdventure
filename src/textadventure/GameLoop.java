//package textadventure;
import java.util.Scanner;

public class GameLoop{
static boolean gamerunning = true;
    static int xcord = 0;
    static int ycord = 0;
    
public static void main(String[] args) {
    // java -cp C:/users/chsrobotics/git/TextAdventure/bin GameLoop
    //$ javac -d bin src/textadventure/GameLoop.java
    Scanner input = new Scanner(System.in);
    //System.out.println("What is your name?");
    //String name = input.nextLine();
    //System.out.println("Your name is " + name);
    gamerunning = true;
    while(gamerunning){
        System.out.println("What do you want to do?");
        String action = input.nextLine();
            if(action.equals("Right")){
                xcord +=1;
            }
            else if (action.equals("Left")){
                xcord -=1;
            }
            else if (action.equals("Up")){
                ycord +=1;
            }
            else if (action.equals("Down")){
                ycord -=1;
            }
            else if (action.equals("Position")){
                System.out.println("Your position is (" + xcord + ", " + ycord + ")");
            }
            //gamerunning = false;
    }
          
   }
}
