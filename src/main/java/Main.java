import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("$ ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            switch (command) {
                case "exit" -> System.exit(0);
                case "echo" -> System.out.println(input.split(" ", 2)[1]);
                default -> System.err.printf("%s: command not found%n", input);
            }
            System.out.print("$ ");
            }
        }
    }
}
