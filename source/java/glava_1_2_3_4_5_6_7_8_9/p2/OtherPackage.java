package glava_1_2_3_4_5_6_7_8_9.p2;

/**
 * Created by Demchenko Sergey on 08.07.2016.
 */
class OtherPackage {
    OtherPackage() {
        glava_1_2_3_4_5_6_7_8_9.p1.Protection p = new glava_1_2_3_4_5_6_7_8_9.p1.Protection();
        System.out.println("Конструктор из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n ="+ p.n);

//        доступно только для данного класса
//        System.out.println("n_pri "+ p.n_pri);

//        доступно только для данного класса, подкласса или пакета
//        System.out.println("n_pro "+ p.n_pro);

//
        System.out.println("n_pub "+ p.n_pub);

    }
}
