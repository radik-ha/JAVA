public class SecSmallest {
    public static void main(String[] args)
    {
        int smallest = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;
        int[] arr = {1,2,3,6,3,7};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                secsmall = smallest;
                smallest = arr[i];
            }
            else if(smallest<secsmall && arr[i]<secsmall)
            {
                secsmall = arr[i];
            }
        }
        System.out.println(secsmall);
    }
}
