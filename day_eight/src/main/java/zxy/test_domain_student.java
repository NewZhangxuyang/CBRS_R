package zxy;

import java.io.Serializable;

/**
 * @Author: zhangXuYang
 * @Date: 2024-03-12-9:09
 * @Description: 学生实体类
 */
public class test_domain_student implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private int score;
    private String address;

    public test_domain_student(String name, int age, int score, String address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "test_domain_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", address='" + address + '\'' +
                '}';
    }
}
