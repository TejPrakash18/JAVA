public class reverseArray
{
    public static void main(String args[])
    {
        int[] arr = {5, 6, 2, 10, 7, 3};

        System.out.print("Orginal Array ");
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println("\nModified Array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}