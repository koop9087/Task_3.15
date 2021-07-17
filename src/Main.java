import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] stringArray = line.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("[!.?]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
