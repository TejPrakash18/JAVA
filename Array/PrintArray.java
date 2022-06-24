class PrintArray{
    public static void main(String[] args) {
        System.out.println("String Array..");
        String car[] = {"Volvo", "BMW", "Ford","Mazda"};
        for(int i=0 ;i<car.length; i++){
            System.out.println(car[i]);
        }
        System.out.println("\nInterger Array..");
        int num[] = {10,20,30,40};
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}