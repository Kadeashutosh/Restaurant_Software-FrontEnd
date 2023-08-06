import java.util.Arrays;
public class Solution {
public static void main(String[] args) {
int[] my_array = {
            10,20,30,40,50};
System.out.println("Original numeric array : "+Arrays.toString(my_array));            
Arrays.sort(my_array);
int index = my_array.length-2;
while(my_array[index]==my_array[my_array.length-2]){
index--;
}
System.out.println("Second largest value: " + my_array[index]);
}
}