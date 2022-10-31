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
    }
}
