package _2_Algoritmization;
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.


public class Task_2_1_4 {
    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        int indexOfMax = 0;
        int indexOfMin = 0;
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 15);
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            } else if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
            if (arr[i]>max){
                max = arr[i];
            } else if (arr[i]<min){
                min = arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
       arr[indexOfMax] = min;
        arr [indexOfMin] = max;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}