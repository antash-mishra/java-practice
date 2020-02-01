import java.util.*;
class exceptions{
    public static void main(String args[]){
        int a,b;
        double res;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a and b");
        try{
            a=scanner.nextInt();
            b=scanner.nextInt();
            res=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
            res=0;
        }
        System.out.println("res = "+ res);
    }
}