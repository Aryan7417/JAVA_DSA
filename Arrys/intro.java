public class intro {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 76;
        arr[2] = 45;
        arr[3] = 54;
        arr[4] = 34;

        // for(int i =0 ; i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
        int[] two = arr;
        two[3] = 555;

        // for (int i = 0; i < two.length; i++) {
        // System.out.println(arr[i]);
        // }

        //swap----

        swap(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}