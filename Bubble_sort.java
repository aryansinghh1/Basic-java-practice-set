public class Bubble_sort {

    public static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean bool = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    bool = true;
                }

            }
            if (!bool) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1 };
        // int[] arr = {1,2,3,4,5};
        
        bubble_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
