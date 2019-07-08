package by.java.EPAM._2_Algoritmization;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.


public class Task_2_1_6 {
    public static void main(String[] args) {

        int[] arr = new int[15];
        System.out.print("Строка до сортировки    ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) );
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Строка после сортировки ");
        int x, y, sum=0;
        for (x = 1; x < arr.length; x++)
        {
            y = 0;
            for (int i = 1; i <= x; i++)
            {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
                sum +=arr[x];

        }
        System.out.print(sum);
    }
}


