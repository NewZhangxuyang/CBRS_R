package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-9:40
 * @Description: abstract类，可以没有抽象方法
 * 而有抽象方法的类，一定为抽象类
 *
 *
 * 抽象类不能实例化，不能直接创建对象。
 *
 * 抽象类是用来被继承的，继承抽象类的子类必须重写父类所有的抽象方法。否则，该子类也必须声明为抽象类，使用 abstract 关键字修饰
 *
 * 抽象类也是类，因此原来类中可以有的成员，抽象类都可以有，
 *
 * 那么抽象类不能直接创建对象，为什么还有构造器呢？
 * 供子类调用，子类创建对象时，需要为从父类继承的属性初始化
 *
 * 抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
 * 理解：子类的构造方法中，有默认的super()，需要访问父类构造方法。
 *
 * 抽象类中，可以有成员变量。
 * 理解：子类的共性的成员变量,可以定义在抽象父类中。
 *
 * 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定抽象类。
 * 理解：未包含抽象方法的抽象类，声明为抽象类目的就是不想让使用者创建该类的对象，通常用于某些特殊的类结构设计。
 *
 * 抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译报错。除非该子类也抽象类。
 * 理解：假设不重写所有抽象方法，则类中可能包含抽象方法。那么创建对象后，调用抽象的方法，没有意义
 *
 *
 * #########
 * 构造方法只是对成员变量进行的初始化
 */
public abstract class test_two {


    //抽象方法，不能用private、final、static
    public int a;


    public static final int b;


    public final int c;

    static {
        b = 1;
    }

    public test_two(int a, int c) {
        this.a = a;
        this.c = c;
    }

    public test_two() {
        this.c = 2;
    }


    public void print() {
        System.out.println("抽象类中的普通方法");
    }


    abstract void attack();

    Object test() {
        System.out.println("test");
        return null;
    }


    public static int testStatic() {
        System.out.println("testStatic");
        return 1;
    }


    public static final void testStaticFinal() {
        System.out.println("testStaticFinal");
    }
}
