import java.util.Scanner;
public class guessing_number {
    public static void main(String[] args){

        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("guess my number (1 - 100 ): ");
            userNumber = sc.nextInt();

            if (userNumber == mynumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if (userNumber > mynumber) {
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        }while (userNumber >= 0);

        System.out.print("my number was : ");
        System.out.println(mynumber);
    }
}
