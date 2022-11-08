import java.util.*;
public class swapwithout3rdvar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No1:");
        int x = sc.nextInt();
        System.out.println("Value Of x Is: "+x);
        System.out.println("Enter No2:");
        int y = sc.nextInt();
        System.out.println("Value Of y Is: "+y);
        x = x^y^(y=x);
        System.out.println("After Swapping:");
        System.out.println("Value Of x Is: "+x);
        System.out.println("Value Of y Is: "+y);
        sc.close();
    }
}