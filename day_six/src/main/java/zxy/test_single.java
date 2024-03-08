package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-08-15:35
 * @Description: 测试单例模式
 */
public class test_single {
    public static void main(String[] args) {
        /**
         * 相同的对象
         */
        Singleton_hungry singleton_hungry = Singleton_hungry.getSingleton_hungryInstance();
        singleton_hungry.showMessage();
        Singleton_hungry singleton_hungry1 = Singleton_hungry.getSingleton_hungryInstance();
        singleton_hungry1.showMessage();

        /**
         * 相同的对象
         */
        Singleton_lazy singleton_lazy = Singleton_lazy.getSingleton_lazyInstance();
        singleton_lazy.showMessage();
        Singleton_lazy singleton_lazy1 = Singleton_lazy.getSingleton_lazyInstance();
        singleton_lazy1.showMessage();

    }
}

/**
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * <p>
 * 主要解决：一个全局使用的类频繁地创建与销毁
 * <p>
 * 关键代码：构造函数是私有的
 */
class Singleton_hungry {
    private static Singleton_hungry singleton_hungry = new Singleton_hungry();
    private Singleton_hungry() {
    }
    /**
     * 饿汉式,在类加载的时候就进行实例化
     *
     * @return
     */
    public static Singleton_hungry getSingleton_hungryInstance() {
        return singleton_hungry;
    }
    public void showMessage() {
        System.out.println("Hungry" + this.hashCode());
    }
}


class Singleton_lazy {
    private static Singleton_lazy singleton_lazy = null;
    private Singleton_lazy() {
    }
    /**
     * 懒汉式，需要的时候才进行实例化
     *
     * @return
     */
    public static Singleton_lazy getSingleton_lazyInstance() {
        if (singleton_lazy == null) {
            singleton_lazy = new Singleton_lazy();
        }
        return singleton_lazy;
    }
    public void showMessage() {
        System.out.println("Lazy" + this.hashCode());
    }

}


class Synchronized_Singleton_Lazy{
    private static Synchronized_Singleton_Lazy synchronized_singleton_lazy = null;

    private Synchronized_Singleton_Lazy() {
    }



    public static synchronized Synchronized_Singleton_Lazy getSynchronized_Singleton_LazyInstance() {
        if (synchronized_singleton_lazy == null) {
            synchronized_singleton_lazy = new Synchronized_Singleton_Lazy();
        }
        return synchronized_singleton_lazy;
    }




}