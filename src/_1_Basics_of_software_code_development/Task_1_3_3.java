package _1_Basics_of_software_code_development;

public class Task_1_3_3 {


    public static void main(String[] args) {
      int x=0;
      int y;
        for (int i = 0 ; i <101 ; i++) {
            y = i*i;
            x = x+y;
        }
        System.out.println("Сумма квадратов первых 100 чисел равна - "+x);
    }
}
