public class Task_1_1_5 {
    public static void main(String[] args) {

        int t = 9675;

        int h = t/3600;

        int m=(t-(h*3600))/60;

        int s=(t-(h*3600+m*60));




        System.out.println("HH:"+h+" MM:"+m+" SS:"+s);



    }
}
