public class Try2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 32, 3, 4, 5};
        int middle = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            middle = (middle + array[i]) / 2;

        }
        System.out.println("Среднее арифметическое " + middle);
        if (middle % 2 == 0) {
            System.out.println("Hello");
        } else {
            System.out.println("Error");
        }
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                int index = -1;
                for(int k = 0; k<array.length;k++){
                    if(array[k] == max){
                        index = k;
                    }
                }
                System.out.println("Индекс максимального значения в массиве " + index);
            }

        }

    }
}