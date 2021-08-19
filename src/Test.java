import com.tms.bank.ChinaBankClient;
import com.tms.bank.DBankClient;
import com.tms.terminal.BankTerminalAsia;

public class Test {

    public static void main(String[] args) {
        System.out.println("Start start");

        ChinaBankClient myCBClient = new ChinaBankClient();
        myCBClient.clientName = "Andrew";
//        myCBClient.income = 100000.0;
//        myCBClient.passportNumber = "12345667";
//        System.out.println(myCBClient);
//
//        System.out.println(myCBClient.hashCode());
//
//
//
//        ChinaBankClient myCBClient2 = new ChinaBankClient();
//
//
//
//        myCBClient.checkPassportNumber();
//        myCBClient.checkCardNumber();
//        myCBClient.getClientInfo();
//
//        System.out.println("-----------");
//
//        DBankClient myDBClient = new DBankClient();
//        myDBClient.cardNumber = "1234-567-999";
//
//        myDBClient.checkPassportNumber();
//        myDBClient.checkCardNumber();
//
//        BankTerminalAsia bankTerminalAsia = new BankTerminalAsia();
//        bankTerminalAsia.customTerminalMethod();
//        bankTerminalAsia.registerNewClient(myCBClient);


        System.out.println("End");
    }

}
