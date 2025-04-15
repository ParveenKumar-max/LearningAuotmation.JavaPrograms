package Ex_01_JavaBasics.Ex52_Encapsulation;

public class Ex52_01_Encapsulation {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    // Create a Data Variable / Local Variable / Attribute / Property

    public String BankName;
    public String Name;



    public String getName() {
        return Name;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBankName() {
        return BankName;
    }

    // Create a Parameterized Constructor
    Ex52_01_Encapsulation(String BankName, String Name) {
        this.BankName = BankName;
        this.Name = Name;

    }

}
class Ex52_03_Encapsulation{

    private int id;
    private long salary;

    Ex52_03_Encapsulation(int id, long salary){
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary, boolean isCashier) {
        if (isCashier){
            this.salary = salary;
    }else {
            System.out.println("Not Allowed");}
    }

    public static void main(String[] args) {

        Ex52_03_Encapsulation Ex52_03 = new Ex52_03_Encapsulation(43, 40L);
        System.out.println(Ex52_03.id);
        System.out.println(Ex52_03.salary);

        Ex52_03.id = 77;

        System.out.println(Ex52_03.id);
        Ex52_03.setSalary(40,false);

        System.out.println(Ex52_03.getSalary());





    }

    }

