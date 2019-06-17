package _1_Basics_of_software_code_development;


public class Task_1_2_5 {


    public static void main(String[] args) {
        double z1 = 0;
        double z2 = 0;
        for (int a = 3, b = 4; b<100; a--,b++) {
            z1 = Math.pow(a, 2) - (3 * a) + 9;
            z2 = 1 / (Math.pow(b, 3) + 6);

        }
        if (z1==z2){
            System.out.println(z1);
        }
        else {
            System.out.println("Нет корней");
        }

    }

}

