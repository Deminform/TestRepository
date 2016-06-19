package task_01;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (checkNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean checkNumber(int num){
        Object a = null;
        String b = null;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= num; j++) {
                if ((i * j) > num) {
                    break;
                }
                if ((i * j) == num) {
                    return false;
                }
            }
        }
        return true;
    }
}