class TravelAgncyTester
{
public static void main(String hlo[]){
TravelAgency.agency("paris");
TravelAgency.agency("london");
TravelAgency.agency("new york");
TravelAgency.agency("tokyo");
TravelAgency.agency("rome");
TravelAgency.agency("dubai");
TravelAgency.agency("south korea");


TravelAgency.getTravelAgency();

System.out.println("the updated tourist places are:");
boolean values=TravelAgency.updatePlace("paris","PARIS");
System.out.println(values);
boolean values1=TravelAgency.updatePlace("london","america");
System.out.println(values1);
boolean values2=TravelAgency.updatePlace("rome","ROME");
System.out.println(values2);
boolean values3=TravelAgency.updatePlace("south korea","Jungkook");
System.out.println(values3);
TravelAgency.getTravelAgency();

}
}