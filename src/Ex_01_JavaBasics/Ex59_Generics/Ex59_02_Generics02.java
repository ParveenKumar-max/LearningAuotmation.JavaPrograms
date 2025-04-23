package Ex_01_JavaBasics.Ex59_Generics;

public class Ex59_02_Generics02 {

    public static void main(String[] args) {

        GenericsClass<Integer> value1 = new GenericsClass<>(100);
        GenericsClass<String> value2 = new GenericsClass<>("Parveen Chaudhary");
        System.out.println(value1.toString());
        System.out.println(value2.toString());
    }
}

class GenericsClass<T> {

    private T data;     // T is a placeholder only.

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Parametrized Constructor
    public GenericsClass(T data) {
        this.data = data;
    }
    @Override   // Overirde method of Object class,  this class is present everytime but always hidden.
    public String toString(){
        return ("Generics method contains: " + data);
    }


}