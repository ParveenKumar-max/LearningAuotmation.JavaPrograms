package Ex_01_JavaBasics;

public class Ex42_FoundMinMaxArray {
    public static void main(String[] args) {

        // Find Max and Min of Array

        int value1[] = {1, 2, 3, 4, 5, 6, 7, 8, 90, 34, 75, 908, 5647};

        int found_max_num = give_me_max(value1);
        System.out.println(found_max_num);

        int found_min_num = give_me_min(value1);
        System.out.println(found_min_num);
    }

    static int give_me_max(int[] value1) {

        int max = value1[0];
        for (int i = 0; i < value1.length; i++) {
            if (value1[i] > max) {
                max = value1[i];
            }

        }

        return max;
    }

    static int give_me_min(int[] value1) {

        int min = value1[0];
        for (int i = 0; i < value1.length; i++) {
            if (value1[i] < min) {
                min = value1[i];
            }
        }

        return min;

    }


}
