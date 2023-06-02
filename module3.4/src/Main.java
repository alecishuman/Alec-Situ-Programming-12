public class Main {
    public static void main(String[] args) {
        int[] x = {6, 4, 2,0};
        int[] y = {8,7,2,1};
        System.out.println(merge(x, y));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                k++;
                i++;
            } else {
                merged[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
            k++;
            j++;
        }

        return merged;
    }
}
