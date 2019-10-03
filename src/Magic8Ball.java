import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //todo Declare verbals
        Scanner keyboard;
         double number;
        keyboard = new Scanner(System.in);


        System.out.println("This is the magic 8ball");
        System.out.println("Give an number between 1-100");
        System.out.println("when you give the nubmer you'll get the answer to every one of your question");
        number = keyboard.nextDouble();


        if (10>=number && number>0); {
            System.out.println("Most likely not");

        }
         else if (20<number && number>10); {
              System.out.println("Most likely yes");

        }
        else if (30<number && number>20); {
            System.out.println("certian");
        }













    }
}
