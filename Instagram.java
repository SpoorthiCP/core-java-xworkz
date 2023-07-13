class Instagram{
static string email;
static String password;
static long phoneNo;

public static double loginWthEmail(String email,String password){
System.out.println("please login through email or phone num");
double isInformation;
if(email.length>0){
System.out.println("valid email");
}return isInformation;

if(password>0){
System.out.println(" it is a strong password ");
}return isInformation;
else{
System.out.println(" plzz enter the strong password");
}
else{
System.out.println("invalid email,please enter correct email");
}
} 
 
public static double loginWthPhone(long phoneNo,String password){
System.out.println("please login through email or phone num");
double isInformation;
if(phoneNo>0){
System.out.println("valid phoneNo");
}
return isInformation;
if(password>0){
System.out.println(" it is a strong password ");
}return isInformation;
else{
System.out.println(" plzz enter the strong password");
}
};
else{
System.out.println("invalid phoneNo,please enter correct phoneNo");
}

}




}