class MetroTester
{
public static void main(String hlo[]){
Metro.nammaMetro("indira nagar metro station");
Metro.nammaMetro("mahakavi metro station");
Metro.nammaMetro("halasuru metro station");
Metro.nammaMetro("dasrahalli metro station");
Metro.nammaMetro("mahalaxmi metro station");
Metro.nammaMetro("kengeri metro station");
Metro.nammaMetro("peenya metro station");
Metro.getMetroNames();

System.out.println("hlo data");
String value=Metro.getMetroByName("peenya metro station");
System.out.println("the name of the metro station is"+value);



System.out.println("the updated metro stations are:");
boolean updatedname=Metro.updateStationNames("indira nagar metro station","INDIRA NAGAR ");
boolean updatedname1=Metro.updateStationNames("halasuru metro station","HAlSURU METRO");
boolean updatedname2=Metro.updateStationNames("mahalaxmi metro station","MAHALAXMI METROSTATION");
Metro.getMetroNames();
}
}