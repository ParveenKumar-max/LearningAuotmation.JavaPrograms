package Ex_01_JavaBasics;

public class Ex49_OOPsClassObject {
    public static void main(String[] args) {

        // @Students is a clas loading @value1 is reference variable @new Students is Object.
        Students value1 = new Students();
        value1.name = "Parveen";
        value1.age = 30;
        System.out.println(value1);
        System.out.println(value1.name);
        System.out.println(value1.age);


        Students value2 = new Students();
        value2.name = "Pintu Chaudhary";
        value2.age = 31;
        System.out.println(value2);

}

   static class Students {
        String name;
        int age;


        public String toString(){
            return "Name is:"+ name + ";" + "Age is: " + age;
        }
    }
}