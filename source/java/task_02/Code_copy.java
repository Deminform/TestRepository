package task_02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Demchenko Sergey on 19.06.2016.
 */

/*
    public class Code_copy {
    byte - 8 от -128 до 127
    short - 16 от -32768 до 32767
    int - 32 от 2147483648 до 2147483647
    long - 64 от -9223372036854775808 до 9223372036854775807

    Выислить расстояние, проходимое светом, используя переменные типа long

*/

    class Light {
        public static void main(String args[]) {
            int lightspeed;
            long days;
            long second;
            long distance;

            //Приблизительная скорость света, миль в секунду
            lightspeed = 186000;
            days = 1000; // указать количество дней
            second = days * 24 * 60 * 60; // преобразовать в секунды
            distance = lightspeed * second; // вычислить расстояние

            System.out.print("За " + days);
            System.out.print(" дней свет пройдет около ");
            System.out.print(distance + " миль.");

        }
    }

// вычислить площадь круга
class  Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус окружности
        pi = 3.116; // приблизительное значение чсла пи
        a = pi * r * r; // вычислить площадь круга
        System.out.println("Площадь круга равна " + a);
    }
}


// Продемонстрировать применение типа данных char
class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88; // код символа Х
        ch2 = 'Y';
        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}

// Символьные переменные ведут себя как целочиселнные знаения
class CharDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        ch1++; // увеличить на единицу переменной ch1
        System.out.println("ch1 теперь содержит " + ch1);
    }
}

// продемонстрировать прменение значений типа bolean
class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        //зачение типа boolean может управлять оператором if
        if (b) System.out.println("Этот код выполняется.");

        b = false;
        if (b) System.out.println("Этот код не выполняется.");

        // результат сравнеия - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}

/*
\ddd    Восьмеричный символ (ввв)
\цхххх  Шестанадцатеричный символ в Юникоде (хххх)
\'      Одинарная кавыка
\"      Двонаякавычка
\\      Обратная косая черта
\r      Возврат каретки
\n      Новая строка (или переод строки)
\f      Подача страницы
\t      Табуляция
\b      Возврат на одну позицию("Забой")


 */

// В этом примере демонстрируется динамическая инициализаия
class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
    }
}


// Продемонстрировать область действия блока кода
class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему коду из метода main()

        x = 10;
        if (x == 10) { // начало новой оласти действия,
            int y = 20; // достпность только этому блоку кода

            // обес переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // ОШБИКА! переменная y недоступна в этойобласти действия,
        // тогда как переменая x доступна и здесь.
    }

    // Этот фрагмент кода написан неверно!
    // count = 100;
    // Переменную count нельзя использовать до е объявления!
    int count;
}

// Продемонстрировать срок действия переменной
class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется при каждом вхождении в блок кода
            System.out.println("y равно : " + y); // здесь всегда выводится значение -1
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}

class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            // создается новая область действия
            // int bar = 2; // ошибка во время компиляции - переменная bar уже определена

        }
    }
}

// Продемострировать приведение типов
class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и b " + i +" " + b);

        System.out.println("\nПреобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);

        System.out.println("\nПреобразование типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);

    }
}


//
class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}

//============================================================

// продемонстрировать применение одномерного массива
class Array {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        System.out.println("В апреле " + month_days[3] + " дней");
    }
}

// Усовершенствованная версия предыдущей программы

class AutoArray {
    public static void main(String[] args) {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        System.out.println("В апреле " + month_days[3] + " дней");
    }
}

// Вычисление среднего из массива значений

class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for (i=0; i<5; i++) {
            result = result + nums[i];
        }
        System.out.println("Среднее значение равно " + result / 5);
    }
}



// Продемонстрировать применение двухмерного массива

class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i=0; i<4; i++) {
            for (j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i=0; i<4; i++) {
            for (j=0; j<5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Резервирование памяти вручную для массива с разной размерностью второго измерения

class TwoDAgain {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;

        for (i=0; i<4; i++) {
            for (j=0; j<i+1; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i=0; i<4; i++) {
            for (j=0; j<i+1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// Инициализировать двухмерный массив

class Matrix {
    public static void main(String[] args) {
        double m[][] = {
            {0*0, 1*0, 2*0, 3*0},
            {0*1, 1*1, 2*1, 3*1},
            {0*2, 1*2, 2*2, 3*2},
            {0*3, 1*3, 2*3, 3*3}
        };
        int i, j;

        for (i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Продемонстрировать применени трехмерного массива

class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i=0; i<3; i++)
            for (j=0; j<4; j++)
                for (k=0; k<5; k++)
                    threeD[i][j][k] = i*j*k;

        for (i=0; i<3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Продемонстрировать основные арифметиеские операции

class BasicMath {
    public static void main(String[] args) {
        // арфметические операции над целочисленными значениями
        System.out.println("елочисленная арфметика");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // арифметческие операции над значениями типа double

        System.out.println("\nАрифметика с плавающей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;

        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}


// Продемонстрировать применение операции %

class Modulus {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}


// Продемонстрировать применение нескольких операций с присваиванием

class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}





















