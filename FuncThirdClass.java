import java.util.*;
class FuncThirdClass{
    public static int calculateMulti(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateMulti(a, b);
        System.out.println("Product: " + mul);
    }
}
