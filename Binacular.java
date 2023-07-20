class Binacular
{
static String brandName;
static String typesOfLens;
static int price;
//user defined
public Binacular(){
System.out.println("binocular constructor is invoked");

}
/*
public Binacular(String brandName,String typesOfLens){
	//chaining one constructer from another called constructor chaining
	//this method
	this(15000);
	this.brandName=brandName;
	this.typesOfLens=typesOfLens;
//System.out.println("binocular constructor is invoked");

}

public Binacular(int price){
	this.price=price;
	
}
*/
public Binacular(String brandName,String typesOfLens){
	//chaining one constructer from another called constructor chaining
	//this method
	//this(15000);
	this();
	System.out.println("1 arg");
	this.brandName=brandName;
	this.typesOfLens=typesOfLens;
//System.out.println("binocular constructor is invoked");

}

public Binacular(int price){
	this("cannon","covex");
	System.out.println("2 arg");
	this.price=price;

}
}