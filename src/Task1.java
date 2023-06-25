//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = scanner.nextInt();
        System.out.println(n + "-ое треуголное число - " + findNumber(n));
        System.out.println("Факториал числа " + n + " - " + factorial(n));
    }
    static int findNumber(int n){
        int res = n * (n+1)/2;
        return res;
    }

    static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
