import org.junit.Before;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import static org.junit.Assert.*;

public class DepositAccountTest {
    private DepositAccount depositAccount;


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
        depositAccount = new DepositAccount(client1, 100000, 15);
    }


    @Test
    public void putMoney() {
        depositAccount.putMoney(100000.0);
        assertEquals(200000, depositAccount.getBalance(), 0);
    }

    @Test
    public void withdrawMoney1() {
        depositAccount.withdrawMoney(100000.0);
        assertEquals(0, depositAccount.getBalance(), 0);
    }

    @Test
    public void withdrawMoney2() {
        depositAccount.withdrawMoney(150000.0);
        assertEquals(100000, depositAccount.getBalance(), 0);
    }

    @Test
    public void addPercent() {
        depositAccount.addPercent();
        assertEquals(115000, depositAccount.getBalance(), 0);
    }

    @Test
    public void getBalance() {
        assertEquals(100000, depositAccount.getBalance(),0);
    }


}