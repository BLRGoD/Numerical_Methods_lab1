import java.util.Scanner;
public class Program {

    public static double calcFunction(double x) {
        return 7.22 * Math.pow(x,5) - 4 * Math.pow(x,2) + 10.7 * x - 100.2;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Левая граница: ");
        double a = keyboard.nextDouble();
        System.out.print("Правая граница: ");
        double b = keyboard.nextDouble();
        System.out.print("Точность (eps): ");
        double e = keyboard.nextDouble();
        double c = 0;
        int i = 0;
        if(Math.signum(calcFunction(a)) == Math.signum(calcFunction(b))) {
            System.out.print("Корень вычислить невозможно");
            System.exit(1);
        }
        while(Math.abs(a - b) > 2 * e) {
            i++;
            c = (a + b) / 2;
            if(calcFunction(a) * calcFunction(c) < 0)
                b = c;
            else
                a = c;
            System.out.println("итерация " + i + ":  c =  " + c + ",  f(c) = " + calcFunction(c));
        }
        System.out.println("корень: " + c + ",  значение функции: " + calcFunction(c));
    }
}
