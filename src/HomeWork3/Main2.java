package HomeWork3;

public class Main2 {
    public static void main(String[] args) {
        //                                        ДОДЕЛАТЬ!!!
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println();
        /*for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }*/

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(array[i], min);
            max = Math.max(array[i], max);
        }
        System.out.println(min);
        System.out.println(max);

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Min index = " + minIndex + "\n" + "Max index = " + maxIndex);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("ЕСТЬ НУЛЕВОЙ ЭЛЕМЕНТ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            int num;
            num = array[array.length -1];
            System.out.println(num);
        }
    }
}
