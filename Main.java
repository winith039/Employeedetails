import java.util.*;
class Employee{
    String name;
    int joiningYear;
    String address;
    Employee(String name,int joiningYear,String address){
        this.name=name;
        this.joiningYear=joiningYear;
        this.address=address;
    }
    public void printDetails(){
        System.out.print(name+" "+joiningYear+" "+address);
    }
}
class Main{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee details");
        Employee[] emps=new Employee[3];
        for(int i=0;i<3;i++){
            String name=sc.next();
            int year=sc.nextInt();
            String add=sc.nextLine();
            emps[i]=new Employee(name,year,add);
        }
        System.out.println("Name Year-of-joining Address ");
        for(int i=0;i<3;i++){
            emps[i].printDetails();
            System.out.println();
        }
    }
}
