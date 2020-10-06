import java.util.Scanner;

class GradeBot {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        double outof= 0;
        double score=0;
        double percent=0;

        //2. get user input
        System.out.print("What was your test out of?");
        outof=sc.nextDouble();
        System.out.print("What was your score?");
        score=sc.nextDouble();

        //3. calculate and display answer
        if(score > outof || score == 0 || score < 0) {
            System.out.println("impossible score LOL.");   
        } else {
            percent = 100 * (score/ outof);
            if(percent>= 86){
                System.out.println("A! Excellent job.");
            }else if(percent>=73){
                System.out.println("B! Nice work.");
            }else if(percent>=67){
                System.out.println("C+! Keep up the good work.");
            }else if(percent>=60){
                System.out.println("C! Good job but study more.");
            }else if(percent>=50){
                System.out.println("C-! You just barely passed.");
            }else{
                System.out.println("F! That's a fail but keep trying.");

            }
        }
    }
}