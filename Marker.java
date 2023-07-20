class Marker
{
String brandName;
int price;
String colour;

public Marker(int price){
	//this("fine liner","red");
	this.price=price;
}

public Marker(String brandName,String colour){
	this(120);
	this.brandName=brandName;
	this.colour=colour;
}
public static void toHighlight(){
System.out.println("it will shows important line");
}
}