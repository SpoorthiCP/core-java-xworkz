class IceCreamTester
{
public static void main(String cream[]){
IceCreams.creamyWoo("chocolate");
IceCreams.creamyWoo("vanila");
IceCreams.creamyWoo("strawberry");
IceCreams.creamyWoo("butterscoch");
IceCreams.creamyWoo("blackcurrent");
IceCreams.creamyWoo("kulfi");
IceCreams.getIceCream();
System.out.println("the updated flavours are:");

boolean value=IceCreams.updateFlavours("chocolate","choco choco");
System.out.println(value);
boolean value1=IceCreams.updateFlavours("vanila","VANILLA");
System.out.println(value1);
boolean value2=IceCreams.updateFlavours("strawberry","raspberry");
System.out.println(value2);
boolean value3=IceCreams.updateFlavours("butterscoch","BUTTERSCOCH");
System.out.println(value3);
IceCreams.getIceCream();

//boolean var=IceCreams.deleteFlavours("blackcurrent");
IceCreams.getIceCream();
int newLength=IceCreams.deleteFlavours("kulfi");
System.out.println("calling");
IceCreams.getAllTheFlavours(newLength);
}
}