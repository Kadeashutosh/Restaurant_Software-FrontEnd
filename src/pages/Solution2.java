import java.util.Arrays;

class Solution2
{

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int index = arr.length-1;

        System.out.println("The original Array is "+ Arrays.toString(arr));

        for(int i=0; i< arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] =arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    
    //int index = arr.length-1;
    while(arr[index]== arr[arr.length-1])
    {
      index--;

    }
    System.out.println(arr[index]);
}
}

