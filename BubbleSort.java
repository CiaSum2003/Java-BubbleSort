import java.util.Scanner;

// Cianee Sumowalt
// Feburary 17 2023
// BubbleSort with 2 at end 

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        SortArray(array);
    }

    static void SortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1] && array[j + 1] != 2) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("Swap " + array[j+1] + " with " + array[j]);
                } else if (array[j] == 2 && array[j+1] != 2) {
                    array[j] = array[j + 1];
                    array[j + 1] = 2;
                    System.out.println("Swap " + array[j+1] + " with " + array[j]);
                }
            }
        }
    }
}
