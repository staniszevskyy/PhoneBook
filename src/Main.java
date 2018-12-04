import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static Scanner in = new Scanner(System.in);
    public void printCmd(){
        System.out.println("Wybierz tryb wyszukiwania");
        System.out.println("1. Po imieniu");
        System.out.println("2. Po nazwisku");
        System.out.println("3. Po imieniu i nazwisku");
        System.out.println("4. exit ");
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        List phoneBook = new List();
        phoneBook.init();
        String cmd;
        do {
            m.printCmd();
            cmd = in.nextLine();
            switch (cmd) {
                case "1": {
                    String input = in.nextLine();
                    phoneBook.matchFirstName(input);
                    break;
                }
                case "2": {
                    String input = in.nextLine();
                    phoneBook.matchLastName(input);
                    break;
                }
                case "3": {
                    String input = in.nextLine();
                    phoneBook.matchFullName(input);
                    break;
                }
            }
        }
            while (!cmd.equals("4"));



    }
}
