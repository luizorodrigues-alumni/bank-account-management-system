import java.util.Scanner;

public class InputUtils {
    private Scanner scanner;

    // Constructor
    public InputUtils(){
        this.scanner = new Scanner(System.in);
    }

    // Validate int Input
    public int readInt(){
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a correct number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    // Validate double Input
    public double readDouble(){
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid input. Please enter a correct number");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
