public class MainArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13};
        int[] array2 = {3, 4, 6, 8, 9};
        int index1 = 0, index2 = 0;
        int counter = 0;

        while (index1 < array1.length & index2 < array2.length) {
            if (array1[index1] == array2[index2]) {
                System.out.println("Dublicate element is: " + array1[index1]);
                index1++;
                index2++;
                counter++;

            } else {
                if (array1[index1] < array2[index2]) {
                index1++;
                } else {
                index2++;
                }
            }
        }
        System.out.println("Counter: " + counter);
    }
}
