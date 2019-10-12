import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{

        FileReader fileReader1 = new FileReader("client1.txt");
        Scanner scanner1 = new Scanner(fileReader1);
        ArrayList<String> strings = new ArrayList<String>();
        while (scanner1.hasNextLine()){
            strings.add(scanner1.nextLine());
        }
        Client client1 = new Client(strings.get(0), strings.get(1), strings.get(2), strings.get(3), Double.parseDouble(strings.get(4)));
        fileReader1.close();
        strings.clear();

        FileReader fileReader2 = new FileReader("client2.txt");
        Scanner scanner2 = new Scanner(fileReader2);
        while (scanner2.hasNextLine()){
            strings.add(scanner2.nextLine());
        }
        Client client2 = new Client(strings.get(0), strings.get(1), strings.get(2), strings.get(3), Double.parseDouble(strings.get(4)));
        fileReader2.close();
        strings.clear();

        FileReader fileReader3 = new FileReader("client3.txt");
        Scanner scanner3 = new Scanner(fileReader3);
        while (scanner3.hasNextLine()){
            strings.add(scanner3.nextLine());
        }
        Client client3 = new Client(strings.get(0), strings.get(1), strings.get(2), strings.get(3), Double.parseDouble(strings.get(4)));
        fileReader3.close();
        strings.clear();

        CurrentAccount currentAccount = new CurrentAccount(client1, 25000);

    }

}
