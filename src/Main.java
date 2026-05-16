import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Program!");
        Scanner userInput = new Scanner(System.in);
        Player player = Player.createNewPlayer(userInput);
        System.out.println("Welcome to the Game,"+player.getName()+"!");
    }
}
