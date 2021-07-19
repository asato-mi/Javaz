import java.util.Scanner;

//your first java program
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, World! \n");
        System.out.print("Today is awesome!\n");
        System.out.print("What is your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s! \n", firstName);
        System.out.printf("Goodbye %s\n", firstName);
    }
}
