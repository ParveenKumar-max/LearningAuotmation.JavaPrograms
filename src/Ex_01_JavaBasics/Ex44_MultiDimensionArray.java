package Ex_01_JavaBasics;

public class Ex44_MultiDimensionArray {

    public static void main(String[] args) {
        // How to define multidimension Array

        int [][] multidim_value= {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < multidim_value.length; i++) {    // 0 to 2  matrix.length - r
            for (int j = 0; j < multidim_value[i].length; j++) {    // matrix[i].length -> c
                System.out.print(multidim_value[i][j]+ " ");
            }

            System.out.println();

        }


    }
}
