import java.util.Scanner;
class search {
    void bsearch(int[] b,int search,int l,int r){
        while(l<=r){
            int mid = (l+r)/2;
            if(search==b[mid]){
                System.out.println("Element found at index :"+ mid);
             
                break;
            }
            else if(search>=b[mid]){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        if(l>r){
            System.out.println("Element not found");
        }
    }
}

class BiSearch{
    public static void main(String args[]){
        int[] a = new int[5];
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the array values: ");
        for(int i=0; i<5; i++){
            a[i] = o.nextInt();
        }
        System.out.println("Enter the search element: ");
        int s = o.nextInt();
        search x = new search();
        x.bsearch(a,s,0,a.length-1);
    }
}