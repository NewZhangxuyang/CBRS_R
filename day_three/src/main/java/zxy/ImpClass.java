package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-05-17:37
 * @Description:
 */
public class ImpClass extends abstract1 {
    @Override
    public void print() {
        System.out.println("abstract1");
    }


    public static void main(String[] args) {

        aoo aoo = new aoo("s");

    }
}

class aoo {


    String s;

    public aoo() {
        System.out.println("aoo");
    }
    public aoo(String s) {
        this();
        System.out.println("aoo" + s);
    }


}



