import java.util.*;
class FuncFourthClass{
    public static void calculateFact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFact(n);
    }
}
