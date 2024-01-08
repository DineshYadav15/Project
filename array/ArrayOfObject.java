package array;
import java.util.*;
class BankAccount
{
	private long AccountNumber;
	String CustName;
	private double balance;
	long phNumber;
	static int custcount;
	BankAccount(long an,String cn,double bal,long ph)
	{
		AccountNumber=an;
		CustName=cn;
		balance=bal;
		phNumber=ph;
	}
	static void printCount()
    {
        System.out.println("No of customers="+custcount);
    }
    void displayRecords()
    {
        System.out.println(AccountNumber+"\t"+
                CustName+"\t"+balance+"\t"+
                phNumber+"\t");
    }
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankAccount[] obj=new BankAccount[4];
     Scanner s1=new Scanner(System.in);
     for(int i=0;i<4;i++)
     {
    	 System.out.println("enter of AccountNumber,name "
     +"phNumber,balance of first cutmer ="+(i+1));
    	    obj[i]=new BankAccount(
    	    		s1.nextLong(),
    	    		s1.next(),
                    s1.nextDouble(),
                    s1.nextLong());
        }
        BankAccount.printCount();
        System.out.println("Account Number\tName\tBalance"
                + "\tPhone Number");
        for(int i=0;i<4;i++)
            obj[i].displayRecords();
     }
     
	}


