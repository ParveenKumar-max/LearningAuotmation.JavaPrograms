package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex60_Comparator {

    public static void main(String[] args) {

        Student S1 =new Student(105,"Parveen",80);
        Student S2 =new Student(100,"Parveen",60);
        Student S3 =new Student(80,"Parveen",30);

        List<Student> list = new ArrayList<Student>();
        list.add(S1);
        list.add(S2);
        list.add(S3);

        System.out.println("Without Sort**************");
        System.out.println("List of Student" + list);

        Collections.sort(list, new AgeComparator());
        System.out.println("Sort with AGE************");
        System.out.println("List of Comparator in Age" + list);

        Collections.sort(list, new RollNumberComparator());
        System.out.println("Sort with RollNumber************");
        System.out.println("List of Comparator in RollNumber" + list);

    }
}

class Student  {

    private int rollnumber;
    private String name;
    private int age;

    // Constructor, getters, setters, toString

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int rollnumber, String name, int age){
        this.age = age;
        this.name = name;
        this.rollnumber = rollnumber;
    }

    @Override
    public String toString() {
        return "Value of Comparator is --> {" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}

class RollNumberComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollnumber() - o2.getRollnumber();
    }
}