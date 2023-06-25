import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        double a = inputDigital();
        String sign = inputSign();
        double b = inputDigital();
        double c = 0;
        switch (sign){
            case "+":
                c = a+b;
                break;
            case "-":
                c = a-b;
                break;
            case "*":
                c = a*b;
                break;
            case "/":
                c = a/b;
                break;
        }
        System.out.println(a + sign + b + "=" + c);


    }
    public static double inputDigital(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        double dig = 0;
        while (flag == false) {
            try {
                System.out.println("Введите целое число");
                String a = scanner.nextLine();
                dig = Double.parseDouble(a);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Значение введено некорректно");
            }
        }
        return dig;
    }

    public static String inputSign(){
        Scanner scanner = new Scanner(System.in);
        String sign = "!";
        boolean flag = false;
        while (flag == false) {
            System.out.println("Введите знак (+,-,*,/");
            sign = scanner.nextLine();
            switch (sign){
                case "+":
                case "-":
                case "*":
                case "/":
                    flag = true;
                    break;
                default:
                    System.out.println("Значение введено некорректно");
                    break;
            }
        }
        return sign;
    }
}