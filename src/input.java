import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Input integer");
        String string = s.nextLine();
        System.out.println("You input: " + "'" + string + "'");
    }
}
