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





























