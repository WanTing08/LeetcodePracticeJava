import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayGround {
    public static void main(String[] args) {
        Student a = new Student();
        a.age = 13;
        a.name = "A";
        Student b = new Student();
        b.age = 13;
        b.name = "A";
        System.out.println(a==b?true:false);
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.equals(b));


        System.out.println(a.maxAge);
        a.type.add(1);
        System.out.println(a.type);
        a.type.add(1);
        System.out.println(a.type);
        a.type.add(1);
        System.out.println(a.type);
    }
}

class Student{
    public String name;
    public int age;

    public final int maxAge = 120;
    public final List<Integer> type = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
}
