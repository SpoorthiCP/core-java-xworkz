class LensKart
{

String name;
int price;
String typeOfSpectacle;
int offer;

public LensKart(String name){
	this("sunglases",50);
	this.name=name;
	System.out.println("hello");
	this.toWear();
}

//constructor overloading
public LensKart(String typeOfSpectacle,int offer){
	this.typeOfSpectacle =typeOfSpectacle;
	System.out.println("this type of spectacle will suit your face");
}

//using "this method" 
public LensKart(int price)
{
	this("cateye");
	this.price=price;
	System.out.println("its an reasonable prize,u can buy it");
}

public static void toWear(){
System.out.println("welcome to lenskart plz select ur choice");
}

 
}