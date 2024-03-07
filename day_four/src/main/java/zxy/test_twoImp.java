package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-10:00
 * @Description: 为什么在实例化子类的对象时，会先调用父类的构造器？
 * 子类继承父类后，获取到父类的属性和方法，这些属性和方法在使用前必须先初始化，所以须先调用父类的构造器进行初始化
 * <p>
 * 在哪里调用父类的构造器？
 * 在子类构造器的第一行会隐式的调用 super(),即调用父类的构造器
 * <p>
 * <p>
 * <p>
 * 如果父类中没有定义空参的构造器，则必须在子类的构造器的第一行显示的调用super(参数) ，以调用父类中构造器
 * <p>
 * <p>
 * 如果子类中构造器的第一行写了this()，则就隐式的super()会消失，因为super()和this()都只能在构造器的第一行定义
 *
 *
 *
 * 不符合访问修饰权限的方法，不能继承/重写
 *
 *
 * static 修饰的方法，不能被重写
 * Java中，static方法和final方法（private方法与final方法是统一的解释方式）是前期绑定，而其他所有的方法都是后期绑定了
 * 静态的方法，是属于类的，而不是属于对象的，解析时候，不需要动态绑定
 *
 *
 */
public class test_twoImp extends test_two {


    public test_twoImp() {

    }


    @Override
    void attack() {
        System.out.println(" attack");
    }


    /**
     * 可以隐藏super，直接用父类的属性
     */
    public Integer test(){
        System.out.println("test"+super.a+super.c+c+b);
        return 1;
    }

}
