package C1108;
/*
 * 20221020, 유제승, 11/08
 */
public class CicleArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Circle c[] = new Circle[100];
        //
        for(int i=0;i<c.length;i++)
        {
            c[i]=new Circle(i);
        }

        for(int i=0;i<c.length;i++)
        {
            System.out.println((int)c[i].getArea()+"\t");
        }

        Circle c1 = new Circle(1);
        System.out.println(c1.add(1,2));

        System.out.println(c1.add(1,2,3));

        System.out.println(c1.add(1.2,2.4));

    }
}
