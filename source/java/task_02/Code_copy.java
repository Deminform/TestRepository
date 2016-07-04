package task_02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;

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

// Применене операции инкремента ++

class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//                     продолжать со 108 страницы
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Продемонстрировать применеие логиеских операций

class BootLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}


// Продемонстрировать применение тернарной операции ?

class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное знаение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // полуить абсолютное значение переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}



// продемонстрировать применение конструкции if-tlse-if

class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "зиме";
        } else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else
            season = "вымышленныым месяцам";
        System.out.println("Апрель отногсится к " + season + ".");
    }
}

// Простой пример примененич оператора switch

class SampleSwitch {
    public static void main(String[] args) {
        for (int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю");
                    break;
                case 1:
                    System.out.println("i равно единице");
                    break;
                case 2:
                    System.out.println("i равно двум");
                    break;
                case 3:
                    System.out.println("i равно трем");
                    break;
                default:
                    System.out.println("i больше трех");
            }
        }
    }
}


//В операторе switch не обязательно указывать операторы break

class MissingBreak {
    public static void main(String[] args) {
        for (int i=0; i<12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i мекньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10");
                    break;
                default:
                    System.out.println("i равно или больше 10");
            }
        }
    }
}



// усовершенствованная версия программы, в которой оперделяется принадлежность месяца времени года
class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "омени";
                break;
            default:
                season = "вымышленным месяцам";
        }
        System.out.println("Апрелоь относится к " + season + ".");
    }
}


// использовать символьные строки для управления оператором switch

class StringSwitch {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("не совпало");
                break;
        }
    }
}

// продемонстрировать применение оператора цикла while

class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


// Целевая часть цикла может быть пустой

class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // расчитать среднее значение переменных i и j
        while (++i < --j); // у этого цикла отсутствует тело
        System.out.println("Среденее значение равно " + i);
    }
}

// продемонстрировать применение оператора цикла do-while

 class DoWhile {
     public static void main(String[] args) {
         int n = 10;
         do {
             System.out.println("такт " + n);
             n--;
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         } while (n > 0);
     }
 }


// Использовть оператор цикла do-wgile для выбора пункта меню

class Menu {
    public static void main(String[] args) throws IOException {
        char choise;
        do {
            System.out.println("Справка по оператору: ");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("Выберите нужный пункт: ");
            choise = (char) System.in.read();
        } while (choise < '1' || choise > '5');

        System.out.println("\n");

        switch (choise) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(выражение) оператор;");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("    оператор;");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(инициализация: условие; итерация)");
                System.out.println(" оператор:");
                break;
        }
    }
}



// продемонстрировать применение оператора цикла for

class ForTick {
    public static void main(String[] args) {
        int n;
        for (n=10; n>0; n--)
            System.out.println("такт " + n);
    }
}


// Объявить переменную управления циклом в самом цикле for

class ForTick2 {
    public static void main(String[] args) {
        for (int n=10; n>0; n--)
            System.out.println("такт" + n);
    }
}


// проверить на простые числа

class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i=2; i <= num/i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("простое число");
        else
            System.out.println("Не простое число");
    }
}



class Sample {
    public static void main(String[] args) {
        int a, b;
        b = 4;
        for (a=1; a<b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}

// Использование запятой в операторе цикла for

class Comma {
    public static void main(String[] args) {
        int a, b;
        for (a=1, b=4; a<b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}

// отдельные части оператора цикла for могут отсутствовать

class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            if (i == 10) done = true;
            i++;
        }
    }
}



// применение цикла for в стиле for each

class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // использовать ицкл в стиле for each для вывода и суммирования значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма равно: " + sum);
    }
}

// применение оператора break в цикле for в стиле for each

class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // использовать цикл for в стиле for each для вывода и суммирования значений из части массива

        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5)
                break;; // прервать цикл после получения 5 значений
        }

        System.out.println("Сумма пяти первых элементов равно: " + sum);
    }
}


// переменная цикла в стиле for each доступна только для чтения

class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // этот оператор не оказывает никакого влияния  на массив nums
        }

        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


// Применение цикла for в стиле for each для обращения к двухмерному массиву

class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // использовать цикл for в стиле for each для вывода и суммирования значений

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}


// Поиск в массиве с применение цикла for в стиле for each

class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int vsl = 5;
        boolean found = false;

        //использовать цикл for в стиле for each для поиска значения переменноц vsl в массиве nums

        for (int x : nums) {
            if (x == vsl) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}

// ЦИклы могут быть вложенными

class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i=0; i<10; i++) {
            for (j=i; j<10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}

// Применение оператора break для выхода из цикла\

class BreakLoop {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            if (i == 10) break;
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен");
    }
}


// Применение оператора break для выхода из цикла while

class BreakLoop2 {
    public static void main(String[] args) {
        int i =0;
        while (i < 100) {
            if (i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен");
    }
}


// Применение оператора break во вложенных циклах
class breakLoop3 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if (j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены");
    }
}


// Применение оператора break в качестве цивилизованной формы оператора goto

class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("этот оператор не будет выполнятся");
                }
                System.out.println("этот оператор не будет выполнятся");
            }
            System.out.println("этот оператор следует за блоком second");
        }
    }
}


// Применение оператора break для выхода из вложенных циклов

class BreakLoop4 {
    public static void main(String[] args) {
        outer: for (int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if (j == 10) break outer;
                System.out.print(j + " ");

            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}


// Эта программа сожержит ошибку

class BreakErr {
    public static void main(String[] args) {
        one: for (int i=0; i<3; i++) {
            System.out.println("Проход " + i + ": ");
        }

        for (int j=0; j<100; j++) {
            //if (j  == 10) break one; ОШИБКА
            System.out.println(j + " ");
        }
    }
}


// Продемонстрировать применение оператора continue

class Continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }
}


// применение оператора continue с меткой

class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}


// Продемонстрировать применение оператора return

class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата");
        if (t) return;
        System.out.println("Этот оператор выполняться не будет.");
    }
}


///////////////////////////////////////////////////////////// Глава 6


/*
Программа, использующая класс Box
Присвоить исходному файлу имя BoxDemo.java
 */

class Box {
    double width;
    double height;
    double depth;

    // ввести объем параллелепипеда
//    void volume() {
//        System.out.print("Объем равен ");
//        System.out.println(width*height*depth);
//    }

    double volume() {
        return width*height*depth;
    }

}


// В этом классе объявляется объект типа Box

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // расчитать объем параллелипипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}


class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // расчитать объем первого параллелипипеда

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}

// Класс это логическая конструкция определящая взаимосвязь между его объектами

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        // Вывести объем первого параллелепипеда
        mybox1.volume();

        // Вывести объем второгго параллелепипеда
        mybox2.volume();
    }
}



// Теперь метод volume() возвращает объем параллелепипеда

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println();
        System.out.println("Объем равен " + vol);


        // Получить объем второгго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}























































