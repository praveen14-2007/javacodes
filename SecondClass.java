import java.util.Scanner;          // ← Add this line

class SecondClass {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        String name = SC.nextLine();
        int age = SC.nextInt();
        int roll = SC.nextInt();
        int maths_marks = SC.nextInt();
        int science_marks = SC.nextInt();
        int sum = maths_marks + science_marks;
        
        System.out.println(maths_marks);
        System.out.println(science_marks);
        System.out.println(sum);
    }
}
