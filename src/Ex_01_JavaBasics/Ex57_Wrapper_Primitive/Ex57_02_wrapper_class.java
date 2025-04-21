package Ex_01_JavaBasics.Ex57_Wrapper_Primitive;

public class Ex57_02_wrapper_class {
    public static void main(String[] args) {

        singleWrapper single = new singleWrapper(10, "Parveen", 777l, 406d, true );
        single.Display();
        single.moverload(100);
        single.drive();

        singleWrapper single1 = new singleWrapper();
        single1.setName("PintuChaudhary");
        single1.Display();


    }

}

class singleWrapper extends doubleWrapper{
    // Creating wrapper classes and now making it private which means encapsulation
   private Integer id;
   private String name;
   private Long rollnumber;
   private Double salary;
    private Boolean isMarried;

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(Long rollnumber) {
        this.rollnumber = rollnumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    static {
        System.out.println("Static block");
    }

    void moverload(Integer mload){
        System.out.println("change the integer value");

    }

    void moverload(Double mload){
        System.out.println("Change the double value");
    }

    singleWrapper(){
        System.out.println("Default Constructor");
    }

    // Parametrized Constructor

    singleWrapper(Integer id, String name, Long rollnumber, Double salary, Boolean isMarried){
        this.id = id;
        this.name = name;
        this.rollnumber = rollnumber;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    void Display(){
        System.out.println("Id is: " + id + "Name is: " + name + "RollNumber is: "+
                rollnumber + "Salary is: "+ salary + "Married Status: " + isMarried);
    }

    void drive(){
        System.out.println("Cam Drive and Run");
    }

}

class doubleWrapper implements Road{

    void drive(){
        System.out.println("Can Drive");
    }

    @Override
    public void BadRoad() {
        System.out.println("Calling interface");
    }
}

interface Road {

    void BadRoad();
}

