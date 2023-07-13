class TelecomTester
{
public static void main(String hii[]){
Telecom.phoneSim("airtel");
Telecom.phoneSim("jio");
Telecom.phoneSim("vodofone");
Telecom.phoneSim("bsnl");
Telecom.phoneSim("Bt grup");
Telecom.phoneSim("reliance");
Telecom.phoneSim("orange");
Telecom.phoneSim("truemove");
Telecom.getSimCard();



boolean value=Telecom.updateTelecom("airtel","Airtel pvt ltd");
//System.out.println(value);
boolean value1=Telecom.updateTelecom("jio","jio infocom limited");
boolean value2=Telecom.updateTelecom("bsnl","BSNL");
boolean value3=Telecom.updateTelecom("vodofone","vadafone");
boolean value4=Telecom.updateTelecom("reliance","Reliance");






Telecom.getSimCard();

}
}