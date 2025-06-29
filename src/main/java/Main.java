import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("$ ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] part = input.split(" ",2);
            String command = part[0];
            String argument = (part.length > 1) ? part[1] : ""; 
            
            switch (command) {
                case "exit" -> System.exit(0);
                case "echo" -> System.out.println(argument);
                case "type" -> {
                    if (argument.equals("exit") || argument.equals("type") || argument.equals("echo")) {
                        System.out.println(argument + " is a shell builtin");
                    } else {
                        System.out.println(argument + ": not found");
                    }
                }
                default -> System.err.printf("%s: command not found%n", input);
            }
            System.out.print("$ ");
            }
        }
    }
}
