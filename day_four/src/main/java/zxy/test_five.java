package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-06-11:23
 * @Description:
 *
 *
 * public interface 接口名称 {
 * 常量                        不允许使用静态代码块赋值
 * 抽象方法                     实现类必须全部重写
 * 默认方法                     实现类可以重写，也可以直接使用
 * 静态方法                     接口名直接调用
 * 私有方法                     本接口中，自己使用
 * }
 *
 *
 * jvm在识别静态方法的时候，凭借关键字static，final，private来区分，这些必定是静态方法
 *
 *
 *
 *针对又继承又实现
 * 当继承一个父类，又实现若干个接口时
 * 父类中的成员方法与接口中的默认方法重名且子类中未重写，子类就近选择执行父类的成员方法
 *
 *
 * 只针对多实现
 * 如果多个接口的默认方法有重名的，必须重写一次
 *
 */
public interface test_five {
    /**
     * 默认使用 public static final 修饰
     */
    public static final int a = 1;

    public final int b = 2;

    public abstract void print();


    /**
     * 供子类调用或者子类重写
     */
    public default void printDefault() {
        System.out.println("default method");
    }


    /**
     * 单独分类，这是接口中的静态方法，不同于类中的静态方法
     *
     * 对外提供借口调用
     * example:
     * interface_name.static_method_name()
     *
     */
    public static void printStatic() {
        System.out.println("static method");
    }


    /**
     * 私有的方法
     * 仅仅限于本接口中使用   private  static  and  private  non_static
     */
    private void printPrivate() {
        System.out.println("private method");
    }





}
