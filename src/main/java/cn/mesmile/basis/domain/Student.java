package cn.mesmile.basis.domain;

import java.util.Objects;

/**
 * @author zb
 * @date 2020/1/5 19:51
 * @Description:
 */
public class Student {

    public static void main(String[] args) {
        Student student = new Student("姓名", 10);
        student.test1();
    }

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {}


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void test1() {
        // test方法可以传入当前对象
        test2(this);
    }

    private void test2(Student student) {
        System.out.println(student.getName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
