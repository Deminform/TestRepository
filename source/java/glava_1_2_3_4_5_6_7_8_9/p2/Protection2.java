package glava_1_2_3_4_5_6_7_8_9.p2;

/**
 * Created by Demchenko Sergey on 08.07.2016.
 */
class Protection2 extends glava_1_2_3_4_5_6_7_8_9.p1.Protection {
    Protection2() {
        System.out.println("Конструктор унаследованный из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n ="+ n);

//        доступно только для данного класса
//        System.out.println("n_pri "+ n_pri);
        System.out.println("n_pro "+ n_pro);
        System.out.println("n_pub "+ n_pub);

    }
}
