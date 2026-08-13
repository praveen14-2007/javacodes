import java.util.*;
class TenthArrayClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] number=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose matrix is : ");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
