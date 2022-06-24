public class PrintTable {
    public static void printTable(int num) {
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=10;i++){
            int temp = num*i; 
            printTable(temp);
        }
    }
}