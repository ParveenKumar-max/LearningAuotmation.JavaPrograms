package Ex_01_JavaBasics.Ex60_CollectionFramework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex60_Comparable {

    public static void main(String[] args) {


        comparable com1 = new comparable(300,"Parveen",80000000);
        comparable com2 = new comparable(100,"Kumar",120000000);
        comparable com3 = new comparable(200,"Chaudhary",150000000);

        List<comparable> list = new ArrayList<>();
        list.add(com1);
        list.add(com2);
        list.add(com3);
        System.out.println(list);

       // Collections.sort(list);
        Collections.sort(list);
        System.out.println("=====================With Comparable Sorting==============");

        System.out.println(list);


    }
}

class comparable implements Comparable<comparable>{

  private int rollnumber;
  private String name;
  private double salary;

    @Override
    public String toString() {
        return "Value will be {" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public comparable(int rollnumber, String name, double salary){
      this.rollnumber = rollnumber;
      this.name = name;
      this.salary = salary;
  }



    //public int compareTo(comparable o) {
    //    return this.name.compareTo(o.name); // compareTo method is used when sort with String.
    //}

    @Override
    public int compareTo(comparable o) {
        return this.rollnumber -o.rollnumber;
    }
}
