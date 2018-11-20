import static java.lang.System.out;
public class Sorts {

    private int[] ascii = {};

    public static void ascendingSort(int[] arr){

        for (int i =0; i < arr.length-1; i++){
            int lowPos = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[lowPos])
                    lowPos = j;
            swap(lowPos, i, arr);
        }
    }

    public static void swap(int indexA, int indexB, int[] arr){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(int[] arr){
        for(int i : arr)
            out.println(i + " ");
        out.println();
    }

    public static void ascendingSort(String[] arr){

        for (int i =0; i < arr.length-1; i++){
            int lowPos = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[lowPos]) < 0)
                    lowPos = j;
            swap(lowPos, i, arr);
        }
    }

    public static void swap(int indexA, int indexB, String[] arr){
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
9
    public static void printArr(String[] arr){
        for(String i : arr)
            out.println(i + " ");
        out.println();
    }

}
