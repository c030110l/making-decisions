import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        String answer = "";

        //2. get user input

        System.out.print("What's the password?");
        answer = sc.nextLine();
        if("hyperactiv imagina".equals(answer)){
            System.out.println("Correct! My secret is hyperactive imagination.");
        }else{
            System.out.println("Incorrect! My secret is still a secret...");
        }
    }
}