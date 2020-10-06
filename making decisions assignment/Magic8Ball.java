import java.util.Scanner;

class Magic8Ball {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        int ans = (int) (Math.random()*20) + 1;
        //2. get user input
        System.out.println("Ask a question!");
        sc.nextLine();

        if(ans == 1){
            System.out.println("yes");
        }else if(ans == 2){
            System.out.println("no");
        }else if (ans == 3){
            System.out.println("definitely");
        }else if (ans == 4){
            System.out.println("very doubtful");
        }else if (ans == 5){
            System.out.println("it's better not to say");
        }else if (ans == 6){
            System.out.println("most likely");
        }else if (ans == 7){
            System.out.println("ask again later");
        }else if (ans == 8){
            System.out.println("unfortunatley not");
        }else if (ans == 9){
            System.out.println("it is unpredictable at the moment");
        } else if (ans == 10) {
            System.out.println("for sure");
        } else if (ans == 11) {
            System.out.println("i will tell you after my nap");
        } else if (ans == 12) {
            System.out.println("the answer is clearly a no");
        } else if (ans == 13) {
            System.out.println("can no be determined right now");
        } else if (ans == 14) {
            System.out.println("no way");
        } else if (ans == 15) {
            System.out.println("yes duh");
        } else if (ans == 16) {
            System.out.println("you have a 17% chance");
        } else if (ans == 17) {
            System.out.println("do not ask again");
        } else if (ans == 18) {
            System.out.println("yes for sure");
        } else if (ans == 19) {
            System.out.println("outlook not so good");
        } else if (ans == 20) {
            System.out.println("as i see it, yes");
        }
    }
}
            
