import java.util.Scanner;

public class Task_1_3_0 {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        int y=0;
        for (int i = 0; i <x+1; i++) {
            y = y+i;
            System.out.println(y);
        }
    }

}

