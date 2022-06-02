import java.util.*;
class Prime{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please insert any number");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        System.out.print(isPrime?n+" is prime number":n+" is not prime number");
    }
}
