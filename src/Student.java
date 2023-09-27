import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }
    @Override
    public int hashCode() {
        int t =31;
        t = t * 31 + name.hashCode();
        t = t * 31 + age;
        return t;
    }
}
