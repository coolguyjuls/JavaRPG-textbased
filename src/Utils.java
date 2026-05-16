import java.util.Scanner;
public class Utils {

    public static boolean inputCheck(String string) {
        if (!string.equals(" ")){
            if(!string.equalsIgnoreCase("yes")){
                return false;
            }
            else return true;
        }
        return false;
    }
}
