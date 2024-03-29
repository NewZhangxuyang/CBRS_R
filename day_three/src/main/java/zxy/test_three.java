package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-05-11:17
 * @Description:  this的真正含义，是当前方法的调用者
 *
 *   类信息包括方法字节码都是存储在jvm的方法区的，通过一个对象引用去调用
 *   jvm会通过常量池解析的方式找到要调用的方法在方法区中的地址入口
 *   在多态情况下也能正确找到，找到方法地址就能调用这个方法了
 *
 *   调用这个方法的引用会被当作一个参数传给方法，这是jvm隐式传参，this参数
 *
 */
public class test_three {

    /**
     * 创建子类对象时会创建父类对象吗？
     *
     * 首先给出答案，创建子类对象时是不会创建父类对象的。
     * 我们看上面实例化一个对象的过程，知道实例化一个子类对象的时候，是会调用父类构造器的，
     * 调用父类构造器不等于实例化对象，只有new的时候，分配了对象的存储空间才会创建对象。
     * 调用父类的构造器，目的是对父类中的成员对象进行初始化
     * 成员对象指的是类中的字段，当然是属于实例的字段
     * 有一种说法是，编译期会把成员对象的初始化合并到构造器中
     * 总之，表象来看，执行构造器时，是先对成员对象初始化，再执行构造器里的代码。
     */


    private int a;


    String  string  = "father";



    public void print() {
        System.out.println(this);
    }

}



