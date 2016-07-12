package glava_1_2_3_4_5_6_7_8_9.p1;

/**
 * Created by Demchenko Sergey on 08.07.2016.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();

        System.out.println("Конструктор базового класса");
        System.out.println("n ="+ p.n);

//        доступно только для класса
//        System.out.println("n_pri "+ p.n_pri);
        System.out.println("n_pro "+ p.n_pro);
        System.out.println("n_pub "+ p.n_pub);

    }
}
