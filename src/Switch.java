import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input age.");
        String age = scanner.nextLine();
        switch (age) {
            case "0" -> System.out.println("you are born");
            case "7" -> System.out.println("you are pupil");
            case "18" -> System.out.println("you are graduate");
            default -> System.out.println("i don't now");
        }
    }
}
