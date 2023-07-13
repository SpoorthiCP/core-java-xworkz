class BankAccountTester{
 public static void main(String hlo[]){
 BankAccount.credit(20000);
 System.out.println(BankAccount.getBalance());
 BankAccount.credit(200);
 BankAccount.credit(20);
 BankAccount.debit(500);
 System.out.println(BankAccount.getBalance());
 
 
 }
 }