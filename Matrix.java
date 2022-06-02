import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        System.out.println("Enter the matrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the matrix 2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        int[][] add=matAdd(m1,m2);
        int[][] Mul=matMul(m1,m2);
        System.out.println("Addition of matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(add[i][j]+" ");;
            }
        }
        System.out.println();
        System.out.println("Multiplication of matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Mul[i][j]+" ");;
            }
        }


    }
    public static int[][] matAdd(int[][] m1,int[][] m2){
        int[][] m3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return m3;
    }
    public static int[][] matMul(int[][] m1,int[][] m2){
        int[][] m3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j]=m1[i][j]*m2[i][j];
            }
        }
        return m3;
    }
}
