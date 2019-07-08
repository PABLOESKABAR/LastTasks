package by.java.EPAM._2_Algoritmization;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.


public class Task_2_1_5 {
    public static void main(String[] args) {
        int start = 6;
        int[] arr = new int[15];
        System.out.print("Строка до сортировки    ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) );
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Строка после сортировки ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>i){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");
    }
}