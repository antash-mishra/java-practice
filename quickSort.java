import java.util.*;

public class quickSort{
    static final int MAX=10005;
    static int[] a = new int[MAX];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max array size: ");
        int n = scanner.nextInt();
        Random random = new Random();
        //System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            a[i]=random.nextInt(1000);
            // a[i] = scanner.nextInt();
        a = Arrays.copyOf(a,n);
        //QuickSortAlgorithm(0,n-1);
        //System.out.println("Input Array: ");
        //for(int i=0;i<n;i++)
            //System.out.println(a[i] + " ");
        long startTime=System.nanoTime();
        QuickSortAlgorithm(0,n-1);
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        /*System.out.println("\nSorted array: ");
        for (int i=0; i<n; i++)
            System.out.println(a[i] + " ");
        System.out.println();*/
        System.out.println("Time complexity (in ms) for n= "+ n + " "+ (double)elapsedTime/1000000);
        scanner.close();
    }
    public static void QuickSortAlgorithm(int p,int r){
        int i,j,temp,pivot;
        if (p<r){
            i=p;
            j=r+1;
            pivot=a[p]; //first element of array is pivot
            while (true){
                i++;
                while(a[i]<pivot && i<r)
                    i++;
                j--;
                if (i<j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                else
                    break;
            }
            a[p]=a[j];
            a[j]=pivot;
            QuickSortAlgorithm(p,j-1);
            QuickSortAlgorithm(j+1,r);
        }
    }
}