public class Main {

    public static void main(String[] args) {
        int[] toSort = {1, 5, 3, 0, 4, 9, 8, 9, 6, 3, 1};
        String[] a = {"q", "w", "e", "r", "t", "y"};
        Sorts.ascendingSort(toSort);
        Sorts.printArr(toSort);

        Sorts.ascendingSort(a);
        Sorts.printArr(a);
    }
}
