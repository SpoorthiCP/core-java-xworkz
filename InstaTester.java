class InstaTester{
public static void main(String hlo[]){
boolean account=Instagram.loginWthEmail("ammulyaShetty@1gmail.com" ,"Sahhh@123");
System.out.println(account);
boolean account1=Instagram.loginWthEmail(0,0);
System.out.println(account1);
boolean account2=Instagram.loginWthPhone(9463 ,"hsguhjs@122");
System.out.println(account2);
boolean account3=Instagram.loginWthPhone(0,0);
System.out.println(account3);

}
}