import java.util.*;
class Fibo{
    static int f=0;
    static int s=1;
    static int temp;
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" "+1+" ");
        printFib(n-2);
    }
    public static void printFib(int n){
        
        if(n>0){
              temp=f+s;
              f=s;
              s=temp;
              System.out.print(" "+temp);
              printFib(n-1);
        }
    }
}
