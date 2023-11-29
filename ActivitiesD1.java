import java.util.Scanner;

public class ActivitiesD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What about your nick name?");
        String nick = sc.nextLine();

        System.out.println("So How old are you?");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Then What is your school?");
        String school = sc.nextLine();
        System.out.println("And What is your Qoute?");
        String qoute = sc.nextLine();
        sc.close();

        System.out.println("Thank you");

        System.out.println("\n\n\n################################");
        System.out.printf("Name : %s\n",name);
        System.out.printf("Nickname : %s\n",nick);
        System.out.printf("Age : %d years old\n",age);
        System.out.printf("School : %s\n",school);
        System.out.printf("Qoute : %s\n",qoute);
        System.out.println("################################\n\n\n");

    }
}