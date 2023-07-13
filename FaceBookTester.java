class FaceBookTester
{
public static void main(String hlo[]){

//FaceBook.login("chdqhwqjjv@gmail.com","hefhih@2133");
//FaceBook.login(77845,"gdvshh2123");

boolean emailLoginSuccess=FaceBook.login("chdqhwqjjv@gmail.com","hefhih@2133");
System.out.println(emailLoginSuccess);

boolean phoneLoginSuccess=FaceBook.login(77845,"gdvshh2123");
System.out.println(phoneLoginSuccess);
}


}