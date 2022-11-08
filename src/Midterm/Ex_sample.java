package Midterm;

public class Ex_sample {
    public static void main(String[] args) {
        int arr[]=new int[10];
        System.out.println(arr.length);
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        // for문 신기한 형태
        int n[]={1,2,3,4,5};
        int sum=0;
        for(int k:n)
        {
            System.out.print(k+" ");
            sum+=k;
        }
        System.out.println("");
        char [] a = {'일','월','화','수'};
        char b[] = {'일','월','화','수'};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
