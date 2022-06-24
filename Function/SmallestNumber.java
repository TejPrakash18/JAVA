
public class SmallestNumber {
    public static void smallnumber(int num1,int num2,int num3) {
        if((num1 > num2)&&(num1>num3)){
            System.out.println("Num 1 is leargest");
        }
        else if((num2>num1) && (num2>num3)){
            System.out.println("Num2 is leargest");
        }
        else{
            System.out.println("num 3 is leargest");
        }
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 60;
        int num3 = 50;


        smallnumber(num1, num2, num3);
    }

}
