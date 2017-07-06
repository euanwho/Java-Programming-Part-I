public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        for (int val : values) {
            System.out.print(val + " ");
        }
        sort(values);
        System.out.println("\n");
        for (int val : values) {
            System.out.print(val + " ");
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int ind1 = array[index1];
        int ind2 = array[index2];
        array[index1] = ind2;
        array[index2] = ind1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i,smallest);
        }
    }
}
