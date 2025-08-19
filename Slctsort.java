import java.util.Scanner;
class Outer{
void disp(int[] ele){
int i,j,t;
int n = ele.length;
for(i=0;i<n;i++){
for(j=i+1;j<n;j++)
{
if(ele[i]>ele[j]){
t = ele[i];
ele[i] = ele[j];
ele[j] = t;
}
}
}
System.out.println("Sorted array is: ");
for(i=0;i<n;i++)
{
System.out.println(ele[i]+ " ");
}
System.out.println();
}
}


class Slctsort{
public static void main(String args[])
{
int i;
int[] a = new int[5];
Scanner o = new Scanner(System.in);
System.out.println("Enter the array values:");
for(i=0;i<5;i++)
a[i] = o.nextInt();
Outer x = new Outer();
x.disp(a);
}
}