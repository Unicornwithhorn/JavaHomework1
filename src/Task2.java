//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        String res = "1, 2, ";
        boolean flag;
        for (int i = 3; i < 1001; i = i + 2) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                res = res + i + ", ";
            }
        }
        System.out.println(res);
    }
}
