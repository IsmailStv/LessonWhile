import java.util.Scanner;

import static java.lang.Math.*;

public class CalcCircleRaduis {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Double area = Double.valueOf(in.nextLine());
        in.close();
        System.out.printf("%.5f", calcCircleRadius(area));
    }
    public static double calcCircleRadius(double area){
        double radius;
        return radius = sqrt(area / PI);
    }
}
