import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Bach");
        Scanner scanner =new Scanner(System.in);
        System.out.println("What your name");
        String name = scanner.nextLine();
        System.out.println("How old are you ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What your favourite food ");
        String food = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("You are "+tuoi+" years old");
        System.out.println("You like "+food);

    }

}
