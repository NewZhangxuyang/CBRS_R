package zxy;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-05-10:01
 * @Description: 创建一个内部类
 */
public class test_two {


    public static void main(String[] args) {
        PhoneInnerClass phoneInnerClass = new test_two()
                .new PhoneInnerClass("华为", 1000, "黑色");
        phoneInnerClass.call();
        phoneInnerClass.sendMessage();
        phoneInnerClass.playGame();
    }

    class PhoneInnerClass {

        private String brand;

        private int price;

        private String color;


        public PhoneInnerClass(String brand, int price, String color) {
            this.brand = brand;
            this.price = price;
            this.color = color;

        }


        public static  void test(){
            System.out.println("test");

        }

        public void call() {
            System.out.println("打电话");
        }

        public void sendMessage() {
            System.out.println("发短信");
        }

        public void playGame() {
            System.out.println("听音乐");
        }

    }

}
