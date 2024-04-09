import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь окружности");
        double area = sc.nextDouble();
        double radius = calcCircleRaduis(area);
        System.out.printf("%.3f",radius);
    }

    public static double calcCircleRaduis(double area) {
        return Math.sqrt(area / Math.PI);
    }
}
