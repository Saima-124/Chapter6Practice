public class PowerOfTwo {
    public static void main(String[] arg){
        int power=0;
        int result=1;
        while(power<=20){
            System.out.println("2^ " + power + "=" + result);
            result=result*2;
            power++;
        }
    }
}
