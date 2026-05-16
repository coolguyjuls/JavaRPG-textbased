import java.util.Scanner;

public class Player {

    String name;
    int health;
    int level;

    Player(String name){
        this.name = name;
        this.health = 10;
        this.level = 1;
    }

    public static Player createNewPlayer(Scanner userInput){
//        System.out.println("Enter your name: ");
//        String name = userInput.nextLine();
//        do(){
//            System.out.println("Enter your name: ");
//        }
//        System.out.println(name + " is your name. Are you sure? (yes/no)");
        String name = playerCreationMethod(userInput);
        System.out.println("Player created.");
        return new Player(name);
    }
//-------------setters and getters----------------//
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getLevel(){
        return level;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setLevel(int level){
        this.level = level;
    }


    public static String playerCreationMethod(Scanner userInput){
        String name = "";
        boolean nameConfirmed = false;

        do{
            if(name.isEmpty()){
                System.out.print("Enter your name: ");
                name = userInput.nextLine();
            }
            else{
                System.out.print("Are you sure you want "+name+" to be your name? (yes/no)");
                String answer = userInput.nextLine();
                if (answer.equalsIgnoreCase("yes")){
                    nameConfirmed = true;
                }
                else {
                    name="";
                }
            }
        } while(!nameConfirmed);
        return name;


    }
//-----------------------------------------------//
}
