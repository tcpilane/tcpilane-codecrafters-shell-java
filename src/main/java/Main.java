import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String input;
        System.out.print("$ ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            System.out.println(input + ": command not found");
            System.out.print("$ ");
        }
    }
}
