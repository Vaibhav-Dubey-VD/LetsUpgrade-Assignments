import java.util.*;
class greatestnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.1:");
        int n1 = sc.nextInt();
        System.out.println("Enter No.2:");
        int n2 = sc.nextInt();
        System.out.println("Enter No.3:");
        int n3 = sc.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("Greatest Number Is: "+n1);
        }
        else if(n2>n1&&n2>n3){
            System.out.println("Greatest Number Is: "+n2);
        }
        else{
            System.out.println("Greatest Number Is: "+n3);
        }
        sc.close();
    }
}