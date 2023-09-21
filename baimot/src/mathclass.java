import java.util.Scanner;
public class mathclass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String name = "lllll";
       do{
            System.out.println("Enter your name");
            name = scanner.nextLine();
        } while(name.isBlank());
        System.out.println("Hello "+name);

    }

}
