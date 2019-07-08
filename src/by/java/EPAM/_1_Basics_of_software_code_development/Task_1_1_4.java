package by.java.EPAM._1_Basics_of_software_code_development;

public class Task_1_1_4 {
    public static void main(String[] args) {
        System.out.println("Enter R(nnn.ddd)");
        double r = 456.567;
        double z = Math.floor(r);
        double k = Math.round((r - z)*1000)+(z/1000);
        System.out.println(k);
    }
}
