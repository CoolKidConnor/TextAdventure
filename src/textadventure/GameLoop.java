package textadventure;
import java.util.Scanner;
import textadventure.Room;
public class GameLoop{
static boolean gamerunning = true;
    static int xcord = 0;
    static int ycord = 0;
    static Scanner input = new Scanner(System.in);
    public static Room introRoom;
public static void main(String[] args) {
    // cd src, textadventure,GameLoop
    // javac GameLoop.java
    //java GameLoop
    //System.out.println("What is your name?");
    //String name = input.nextLine();
    //System.out.println("Your name is " + name);
    introRoom = new Room("yeet");
    System.out.println(introRoom.roomDesc);
    gamerunning = true;
    while(gamerunning){
        System.out.println("What do you want to do?");
        handleAction();
            //gamerunning = false;
     }
    }

    public static void handleAction(){
        String action = input.nextLine();
        switch(action){
            case "right":
                xcord +=1;
                System.out.println("You move right");
                break;
            case "left":
                xcord -=1;
                break;
            case "up":
                ycord += 1;
                break;
            case "down":
            ycord -=1;
            break;
        }
    }
}
