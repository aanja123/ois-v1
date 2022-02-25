import java.util.*;
import java.lang.Math;

public class Gravitacija2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("OIS je zakon!");
    	double v = sc.nextDouble();
    	System.out.println(izracun(v));
    }
    public static double izracun(double v){
        double C = 6.674*Math.pow(10, -11);
        double M = 5.972*Math.pow(10, 24);
        double r = 6.371*Math.pow(10, 6);
        double a = (C*M)/((r+v)*(r+v));
		return a;
    }
    public static void izpis(double v){
       double C = 6.674*Math.pow(10, -11);
       double M = 5.972*Math.pow(10, 24);
       double r = 6.371*Math.pow(10, 6);
       double a = (C*M)/((r+v)*(r+v));
       System.out.println(v);
       System.out.println(a);
    }
}