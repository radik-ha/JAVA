import java.util.Arrays;
class SingleSwap
{
public static void main(String args[])
{

int arr[] = {1,6,4,5,2,8};
System.out.println("Original aray is: "+ Arrays.toString(arr));
int sorted[] = arr.clone();
Arrays.sort(sorted);
System.out.println("Sorted array is: "+ Arrays.toString(sorted));
int first = -1,second = -1,temp;
for(int i =0;i<arr.length;i++)
{
if(arr[i] != sorted[i])
{
if(first == -1)
first = i;
else
second = i;
}
}
if(first != -1 && second != -1)
{
System.out.println("Before sorting array is: "+ Arrays.toString(arr));
temp = arr[first];
arr[first] = arr[second];
arr[second] = temp;
System.out.println("After sorting array is: "+ Arrays.toString(arr));
}
else
{
System.out.println("Array is already sorted");
}
}
}