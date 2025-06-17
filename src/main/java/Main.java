import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String input;
        System.out.print("$ ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.equals("exit 0")) {
                System.exit(0);
            }
            System.out.println(input + ": command not found");
            System.out.print("$ ");


        }
    }
}
