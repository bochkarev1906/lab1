import org.junit.Before;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;
//jhjgjопгг
public class CurrentAccountTest {

    private CurrentAccount currentAccount;


    @Before
    public void init() throws IOException {
        FileReader fileReader1 = new FileReader("client1.txt");
        Scanner scanner1 = new Scanner(fileReader1);
        ArrayList<String> strings = new ArrayList<String>();
        while (scanner1.hasNextLine()){
            strings.add(scanner1.nextLine());
        }
        Client client1 = new Client(strings.get(0), strings.get(1), strings.get(2), strings.get(3), Double.parseDouble(strings.get(4)));
        fileReader1.close();
        strings.clear();
        currentAccount = new CurrentAccount(client1, 100000);
    }

    @Test
    public void putMoney() {
        currentAccount.putMoney(50000);
        assertEquals(150000, currentAccount.getBalance(), 0);
    }

    @Test
    public void withdrawMoney1() {
        currentAccount.withdrawMoney(50000);
        assertEquals(50000, currentAccount.getBalance(), 0);
    }

    @Test
    public void withdrawMoney2() {
        currentAccount.withdrawMoney(150000);
        assertEquals(100000, currentAccount.getBalance(), 0);
    }

    @Test
    public void getBalance() {
        assertEquals(100000, currentAccount.getBalance(), 0);
    }




}