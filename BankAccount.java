class BankAccount
{
static double balance;
public static boolean credit(int amount)
{
boolean isCredited=false;
if(amount>0)
{
balance=balance+amount;
isCredited=true;
System.out.println("the current amount in the balance is"+balance);
}return isCredited;
}
public static boolean debit(int amount){
boolean isDebited=false;
if(amount<=balance){
balance=balance-amount;
System.out.println("the current amount in the balance is"+balance);
isDebited=true;
}
return isDebited;
}

public static double getBalance(){
return balance;
}
}