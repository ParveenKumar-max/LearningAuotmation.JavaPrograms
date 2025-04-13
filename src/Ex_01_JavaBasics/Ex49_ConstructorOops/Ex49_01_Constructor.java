package Ex_01_JavaBasics.Ex49_ConstructorOops;

public class Ex49_01_Constructor {

    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(1, "Parveen");
        // Call the method to display student details
        student1.displayInfo();

        Ex49_01_Constructor ex50Constructor = new Ex49_01_Constructor();
        ex50Constructor.intValue();

    }

    public void intValue(){
        System.out.println("Another Method in different Class");

    }
}

     class Student {
         // Fields (attributes)
         int id;
         String name;

         // Constructor to initialize a student
         public Student(int id, String name) {
             this.id = id;
             this.name = name;
         }

         // Method to display student details
         public void displayInfo() {
             System.out.println("Student ID: " + id);
             System.out.println("Student Name: " + name);
         }


     }
