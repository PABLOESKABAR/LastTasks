package by.java.EPAM._2_Algoritmization;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.



public class Task_2_1_3 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int z = 0;
        int [] arr = new int[15];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(arr[i]+" ");

            if (arr[i]>0){x++;}
            if (arr[i]<0){y++;}
            if (arr[i]==0){z++;}
        }
        System.out.println("");
        System.out.println("(arr[i]>0)"+x);
        System.out.println("(arr[i]<0)"+y);
        System.out.println("(arr[i]==0)"+z);
    }
}