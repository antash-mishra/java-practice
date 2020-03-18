import java.util.*;

public class mergeSort{
    static int MAX=10005;
    static int[] a = new int[MAX];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max array size: ");
        int n=scanner.nextInt();
        Random random = new Random();
        //System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
            a[i]=random.nextInt(1000);
            //a[i]=scanner.nextInt();
        //MergeSort(0,n-1);
        long startTime=System.nanoTime();
        MergeSort(0,n-1);
        long stopTime=System.nanoTime();
        long elapsedTime=stopTime-startTime;
        System.out.println("Time elapsed (in ms) n ="+ n + "is "+ (double)elapsedTime/1000000);
        //System.out.println("sorted elements: ");
        //for(i=0;i<n;i++)
            //System.out.println(a[i] + " ");
        scanner.close();
    }
    public static void MergeSort(int low,int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            MergeSort(low,mid);
            MergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }
    public static void merge(int low,int mid,int high){
        int[] b = new int[MAX];
        int i,h,j,k;
        h=i=low;
        j=mid+1;
        while((h<=mid)&& (j<=high)){
            if(a[h]<a[j])
                b[i++]=a[h++];
            else
                b[i++]=a[j++];
        }
        while(h<=mid)
            b[i++]=a[h++];
        while(j<=high)
            b[i++]=a[j++];
        for(i=low;i<=high;i++)
            a[i]=b[i];
    }
}