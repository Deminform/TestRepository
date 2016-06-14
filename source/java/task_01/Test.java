package task_01;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (checkNumber(i) == true) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean checkNumber(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
                if (num > 1 && num / i == num || ((num % i == 0) && num / i == 1)) {
                    count++;
                }
            }
        }

        if (count == 2 || num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }
        else return false;
    }
}